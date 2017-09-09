###################################################################
# Universidade de Évora
# Trabalho de Arquitectura de Sistemas e Computadores I
# Ano Lectivo 2014/2015
#
# João Chiola 32456
# Gabriel Charrua 32457
#
# Pretende-se com este trabalho desenvolver um programa em Assembly MIPS
# para tocar musica lida de um ficheiro de texto. A melodia, descrita em texto
# ASCII, É interpretada pelo programa e tocada na interface MIDI habitualmente
# presente nas placas de som dos computadores pessoais.
############################################################3#######

.data
mensagem1: .asciiz "Introduza o nome do ficheiro:\n"
input1: .space 50 	#espaço p/ buffer do input do user
mensagem2: .asciiz "O nome introduzido excede o limite (50)"
msgerro: .asciiz "Erro ao abrir / Ficheiro não existente\n"
ficheiro: .space 1024 	#espaço p/ buffer da string do ficheiro
byte: .space 4
instrumento: .word 32
duracao: .word 32
duracaoatual: .word 32
nota: .word 32
formato: .asciiz "O ficheiro não está no formato apropriado \n"

.text
main:

jal NomeFicheiro
nop
jal AbreFicheiro
nop
jal LerFicheiro
nop

###################################################################
# NomeFicheiro
# v0 - Valor do syscall de (InputDialogString)
# a0 - Mensagem de prompt ao user
# a1 - Buffer onde é guardada a informação introduzida pelo user
# a2 - Tamanho máximo do input do user (30 neste caso)
###################################################################
NomeFicheiro:
li $v0, 54		
la $a0, mensagem1	
la $a1, input1		
li $a2, 30	
syscall

addi $t0, $zero, -2 		#Erro cancelar
addi $t1, $zero, -3 		#Erro campo vazio
addi $t2, $zero, -4 		#Erro exceder limite

beq $a1, $t0, Fim	 	#Ao cancelar, acaba o programa
nop

beq $a1, $t1, NomeFicheiro 	#Ao não inserir nada, o programa fica em loop
nop

beq $a1,$t2, texcedido
nop

#Remover o linefeed da string 

la $t0, input1 
li $t1, 10		#lf code(10)
Removelf:
addi $t0, $t0, 1
lb $t2, ($t0)
bne $t2, $t1, Removelf
nop
sb $zero, ($t0) 

jr $ra 			#Continua o programa
nop

texcedido:
#Syscall de msg de erro (tamanho excedido --> volta a pedir o nome)
li $v0, 4
la $a0, mensagem2
syscall
beq $a1, $t2, NomeFicheiro
nop

la $a0, input1
li $v0, 4
syscall
###############################################################
# AbreFicheiro
# v0 - Valor do syscall para abrir o ficheiro
# a0 - Buffer onde está guardada a informação introduzida anteriormente
# a1 - Flag a 0 (Read Only)
# a2 - Mode a 0 (Read Only)
###############################################################
AbreFicheiro:

li $v0, 13
la $a0, input1
li $a1, 0
li $a2, 0
syscall
move $s0, $v0 			#Guarda o descritor

blt $v0, $zero, erroabrir 	#Se v0<0 ---> Erro ao abrir (propriedades do syscall)
nop

jr $ra
nop

erroabrir:
#Syscall de erro (ao abrir)
li $v0, 4
la $a0, msgerro
syscall

beq $zero, $zero, main
nop

###############################################################
# LerFicheiro
# $v0 - Syscall de ReadFile
# $a0 - Descritor do ficheiro
# $a1 - Onde fica guardado o que é lido
# $a2 - Número máximo de caracteres lidos (1024)
###############################################################
LerFicheiro:

li $v0, 14		
move $a0, $s0		
la $a1, ficheiro	
li $a2, 1024	
syscall

li $v0, 16 			#syscall de closefile
move $a0, $s0			#descritor do ficheiro a fechar
syscall

#Inicio da leitura byte a byte
la $a0, ficheiro
move $s0, $a0
addi $t0, $zero, 10	#Multiplicador por 10 / Valor no Linefeed (ENTER)
addi $t3, $zero, 0	#Registo inicializado para guardar o valor lido

lerinstrumento:
lb $t1, 0($s0)
beq $t1, 32, fiminstrumento	#branch se chegar ao 32 (espaço)
addi $s0, $s0, 1		#incrementar 1 byte (ler o proximo caracter)
mul $t3, $t3, $t0		#multiplicar por 10 para adicionar proximo algarismo (se existente)
addi $t1, $t1, -48		#subtrair 48 para converter de ascii para decimal
add $t3, $t3, $t1		#adicionar ao t3 o algarismo lido
j lerinstrumento

fiminstrumento:
sw $t3, instrumento		#guarda o valor do instrumento

xor $t3, $t3, $t3
addi $s0, $s0, 1

lerduracao:
lb $t1, 0($s0)
beq $t1, $t0, fimduracao	#branch se chegar ao $t2 (enter)
nop
addi $s0, $s0, 1		#incrementar 1 byte (ler o proximo caracter)
mul $t3, $t3, $t0		#multiplicar por 10 para adicionar proximo algarismo (se existente)
addi $t1, $t1, -48		#subtrair 48 para converter de ascii para decimal
add $t3, $t3, $t1		#adicionar ao t3 o algarismo lido
j lerduracao	

fimduracao:
sw $t3, duracao			#guarda o valor da duracao

#-----------------------------------------------------------------------------------------

addi $s0, $s0, 1

ler:
xor $t0, $t0, $t0		#Resetar os registos para 0
xor $t1, $t1, $t1		#--------------------------
xor $t2, $t2, $t2		#--------------------------
xor $t3, $t3, $t3		#--------------------------
xor $t4, $t4, $t4		#--------------------------

lb $t1, 0($s0)
beq $t1, 0, Fim			#Corretor de Formato
nop
beq $t1, 10, Fim		#Corretor de Formato
nop
blt $t1, 65, erroformato	#Caso o caracter não seja uma letra
nop
bgt $t1, 71, erroformato	#-------------------------------------
nop
beq $t1, 67, C			#
beq $t1, 68, D			#
beq $t1, 69, E			#
beq $t1, 70, F			# Converte de ascii para escala cromática
beq $t1, 71, G			#
beq $t1, 65, A			#
beq $t1, 66, B			#
nop

C:
addi $t1, $t1, -7
sb $t1, nota
j lernext
nop
D:
addi $t1, $t1, -6
sb $t1, nota
j lernext
nop
E:
addi $t1, $t1, -5
sb $t1, nota
j lernext
nop
F:
addi $t1, $t1, -5
sb $t1, nota
j lernext
nop
G:
addi $t1, $t1, -4
sb $t1, nota
j lernext
nop
A:
addi $t1, $t1, 4
sb $t1, nota
j lernext
nop
B:
addi $t1, $t1, 5
sb $t1, nota
j lernext
nop

lernext:
addi $s0, $s0, 1
lb $t2, 0($s0)
beq $t2, 35, sustenido		#Caso o proximo caracter seja um sustenido
beq $t2, 98, bemol		#Caso o proximo caracter seja um bemol
beq $t2, 45, traco		#Caso o proximo caracter seja um traço
nop
beq $t2, 10, Fim		#Chegou ao fim
nop
j erroformato			#Caso o proximo caracter não seja nenhum dos acima mencionados
nop

traco:
lw $t4, duracao			#s1 - 1000 (neste caso)
addi $t0, $t0, 1		#t0 - 1
addi $s0, $s0, 1		#s0 - proximo caracter
lb $t2, 0($s0)			#t2 - ^
mul $t3, $t0, $t4		#t3 = t0 * s1 = (1000 * 1)
sw $t3, duracaoatual		#duracao atual = (1000)
bne $t2, 45, TocaMusica
nop
j traco
nop

sustenido:			#Adiciona 1 ao valor da nota
lb $t4, nota
addi $t4, $t4 1
sb $t4, nota
j lernext
nop
		
bemol:				#Subtrai 1 ao valor a nota
lb $t4, nota
subi $t4, $t4 1
sb $t4, nota
j lernext
nop

erroformato:			#Mensagem para quando o ficheiro não se encontra no formato
li $v0, 4
la $a0, formato
syscall
j Fim
nop
###############################################################
# TocaMusica
# v0 - Contém o valor 33 (MIDI Out)
# a0 - Contém o valor lido da nota (função ler)
# a1 - Contém o valor lido da duração da nota (função traco)
# a2 - Contém o valor lido do instrumento (função çerinstrumento)
# a3 - Contém um valor predefinido de som (100 neste caso)
###############################################################
TocaMusica:

li $v0, 33
lw $a0, nota		#nota
lw $a1, duracaoatual	#duração
lw $a2, instrumento	#instrumento
li $a3, 100
syscall
j ler
nop

Fim:
