# -*- coding: utf-8 -*-
import socket, select, datetime

SOCKET_LIST = []    
RECV_BUFFER = 4096  
PORT = 5000
open("users.txt","a")
def process_cmd(data, newsock):

    message_received_client = str(data.decode())
    if 'LOGIN' or 'REGISTER' in message_received_client :
        command, message = message_received_client.split(' ',1)
        print ('COMANDO: ', command)
        print ('MENSAGEM: ', message)
    

    if command == 'LOGIN':
        user, password =message.split(' ',1)
        if message in open("users.txt","r+").read():
            print("OK_LOGIN"+ ' ' + user)
            msg = 'OK' 
            sock.sendall(msg.encode('utf-8'))            
        else:
            print("ERROR_LOGIN" + ' ' + user)
            msg = 'NOT_OK' 
            sock.sendall(msg.encode('utf-8')) 

    elif command == 'REGISTER':
        user, password =message.split(' ',1)
        file=open("users.txt","r+")
        if message in file:
            print('ERR_ALREADY_EXISTS' +' '+ user)
            msg = 'ERR_ALREADY_EXISTS' + user
            sock.sendall(msg.encode('utf-8'))
        else:
            file.write('\n'+ message)
            file.close()
            print ('OK_REGISTERED'+ ' ' + user)
            msg = 'OK_REGISTERED' 
            sock.sendall(msg.encode('utf-8'))
            

    elif command == 'PUBLIC':
        try:
            print('Mensagens Publicas: ')
            file = open('publica.txt','r')
            line = print(file.read())
        except FileNotFoundError:
            print('Não existem mensagens públicas')
    elif command == 'PRIVMSGS':
        try:
            print('Mensagens Privadas ')
            file = open(message+'.txt','r')
            print('Conversa acedida:' + ' ' + message)
            line = print(file.read())
        except FileNotFoundError:
            print('Não existem conversas com ' + message)
    elif command == 'SENDMSG':
        file = open('publica.txt','a')
        file.write('\n'+ message)
        file.close()
        print ('MESSAGE_RECEIVED')
        
    elif command == 'SENDPRIVMSGS':
        comando, data, hora , user, mensagem = message_received_client.split(' ',4)
        user=user + '.txt'
        file = open(user,'a')
        file.write('\n' +data+' '+hora+' '+ mensagem)
        print ('MENSAGEM PRIVADA ENVIADA','('+data, ' ',hora+')', 'DESTINATÁRIO: ',user, 'MSG: ', mensagem)
        print ('MESSAGE_RECEIVED')

    elif command == 'GOODBYE':
        print('GOODBYE')
        server_socket.close()


    pass


if __name__ == "__main__":
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    server_socket.bind(("localhost", PORT))  
    server_socket.listen(1)
    server_socket.setblocking(0) 

    SOCKET_LIST.append(server_socket)

    print("Server started on port %d" % (PORT,))

    while True: 

        for sock in SOCKET_LIST:
            if sock.fileno() < 0: 
                SOCKET_LIST.remove(sock)

        rsocks,wsocks,esocks = select.select(SOCKET_LIST,[],[])

        for sock in rsocks:  

            if sock == server_socket: 
                newsock, addr = server_socket.accept()
                newsock.setblocking(0)
                SOCKET_LIST.append(newsock)

                print("New client - %s" % (addr,))

            else:
                try:
                    data = newsock.recv(RECV_BUFFER)

                    if data:

                        process_cmd(data, newsock)

                    else: 
                        print("Client disconnected 1")
                        sock.close()
                        SOCKET_LIST.remove(sock)

                except Exception as e: 
                    print('EXCEPTION ERROR ->', e)
                    sock.close()
                    SOCKET_LIST.remove(sock)
