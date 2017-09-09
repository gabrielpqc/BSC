# -*- coding: utf-8 -*-
import socket, select , time

SOCKET_LIST = []    # lista de sockets abertos
RECV_BUFFER = 4096  # valor recomendado na doc. do python
PORT = 5000
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server_socket.connect(("localhost", PORT))
def menu():
    print('-----MENU-----')
    print('LOGIN - 1')
    print('REGISTO - 2')
    print('SAIR - 3')
    x = int(input('Insira o comando: '))
    if x<1 or x>3:
        print ('Comando inválido')
    if x == 1:
        print('LOGIN:')
        y = input('Insira o nome de utilizador: ')
        z = input('Insira a password: ')
        w= y+' '+z
        msg = 'LOGIN' + ' '+ w
        b = msg.encode('utf-8')
        server_socket.sendall(b)
        data = server_socket.recv(RECV_BUFFER)
        message_received_server = str(data.decode())
        if message_received_server == 'OK':
            menu2(y)
        else:
            menu()

        
    if x == 2:
        print('REGISTO:')
        y = input('Insira o nome de utilizador: ')
        z = input('Insira a  sua password: ')
        w = y +' '+z
        msg = 'REGISTER' +' '+ w
        a = msg.encode('utf-8')
        server_socket.sendall(a)
        data = server_socket.recv(RECV_BUFFER)
        message_received_server = str(data.decode())
        if message_received_server =='OK_REGISTERED':
            menu2(y)
        else:
            print('Username já existente ou password errada') 
            menu()
        
    if x==3:
        print('EXIT')
        msg = 'GOODBYE' 
        a = msg.encode('utf-8')
        server_socket.sendall(a)
        
        
def menu2(a):
    #Código para gravar os Timestamps
    d= time.strftime("%x")
    h= time.strftime("%X")
    data=(d +' '+ h)
    
    print('-----MENU 2-----')
    print('CONSULTAR MENSAGENS - 1')
    print('ENVIAR MENSAGEM PÚBLICA - 2')
    print('ENVIAR MENSAGEM PRIVADA - 3')
    print('EXIT - 4')
    x = int(input('Insira o comando: '))
    if x<1 or x>4:
        print ('Comando inválido')
    if x == 1:
        print('QUE MENSAGENS DESEJA CONSULTAR:')
        print('PÚBLICAS - 1')
        print('PRIVADAS - 2')
        i= int(input('Insira o comando: '))
        if i== 1:
            msg = 'PUBLIC MSGS'
            b = msg.encode('utf-8')
            server_socket.sendall(b)
            menu2(a)

        if i == 2:
            u= str(input('Selecione a conversa: '))               
            msg = 'PRIVMSGS'+' '+u
            b = msg.encode('utf-8')
            server_socket.sendall(b)
            menu2(a)

    if x == 2:
        t = input('Insira a mensagem a enviar: ')
        msg = 'SENDMSG'+ ' ' + data +' '+ t
        b = msg.encode('utf-8')
        server_socket.sendall(b)
        menu2(a)
        
    if x == 3:
        y = input('Insira o destinatário: ')
        t = input('Insira a mensagem a enviar: ')
        msg = 'SENDPRIVMSGS'+ ' ' + data +' '+ y +' '+ t
        b = msg.encode('utf-8')
        server_socket.sendall(b)
        menu2(a)

    if x == 4:
        server_socket.close()
    
menu()

