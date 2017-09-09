print("------ | Poção Mágica | -------\n")

def main():

    print("                       Novo jogo\n")
    op = str(input("Insira 0-SAIR | 1-Inputs aqui | 2-Carregar ficheiro "))
    op = sao_inteiros(op)
    if op == 0:
        print('-------------------FIM DO JOGO------------------------')
        
    if op == 1:
############################### Opção 1 #######################################
#os inputs sao feitos no programa
        n = str(input("Introduza o tamanho da vila: "))
        n = sao_inteiros(n)
        if n <= 1 or n >= 8:  
            print("Vila com tamanho invalido \n")
            print("--------------------------------------------------------\n")
            main()
        else: 
            p = str(input("Introduza o numero de habitantes: "))
            p = sao_inteiros(p)
            if p>=1 and p<=n:
                tabuleiro = cria_tabuleiro(n) 
                coordenadas = coord_lista(n,p,tabuleiro)
                listacoords = string_tuplo(coordenadas)
                grelha = tabuleiro_coordenadas(n,p,tabuleiro,coordenadas)
                grafo = d_grafo(n)
                coordenadas = coordenadas_para_tuplo(coordenadas)
              
  
                if p==1:
                    inicio = coordenadas[0][0]
                    fim = coordenadas[0][1]
                    caminho = find_shortest_path(grafo, inicio, fim, path=[])
                    for c in caminho:
                        grelha[c[0]][c[1]] = 1
                    print('   TOUTATIS    ')
                    for i in grelha:
                        print(i)
                    main()
                      
                elif p == 2:
                    d = dict()
                    contador_1 = 1
                    for c in coordenadas:
                        inicio = c[0]
                        fim = c[1]
                        todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                        caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                        d[contador_1] = caminhos_poss
                        contador_1 += 1
                    
                    for c1 in d[1]:
                        for c2 in d[2]:
                         
                            if tem_duplicados2(c1,c2) == False:
                                for x in caminho_1:
                                    grelha[x[0]][x[1]] = 1
                                for y in caminho_2:
                                    grelha[y[0]][y[1]] = 2
                                print('   TOUTATIS   ')
                                for i in grelha:
                                    print(i)     
                                main()
                                       
                             
                    print( ' ALESIA '  )
                    main()    
                        
                 
                elif p == 3:
                    d = dict()
                    contador_1 = 1
                    for c in coordenadas:
                        inicio = c[0]
                        fim = c[1]
                        todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                        caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                        d[contador_1] = caminhos_poss
                        contador_1 += 1
                    
                    for c1 in d[1]:
                        for c2 in d[2]:
                            for c3 in d[3]:
                         
                               if tem_duplicados3(c1,c2,c3) == False:
                                   for x in c1:
                                       grelha[x[0]][x[1]] = 1
                                   for y in c2:
                                       grelha[y[0]][y[1]] = 2
                                   for w in c3:
                                       grelha[w[0]][w[1]] = 3
                                   print('   TOUTATIS   ')
                                   for i in grelha:
                                       print(i)
                                   main()    
              
                
                    print( 'ALESIA' )
                    main()
                                       
                elif p == 4:
                    d = dict()
                    contador_1 = 1
                    for c in coordenadas:
                        inicio = c[0]
                        fim = c[1]
                        todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                        caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                        d[contador_1] = caminhos_poss
                        contador_1 += 1
                    
                    for c1 in d[1]:
                        for c2 in d[2]:
                            for c3 in d[3]:
                                for c4 in d[4]:
                         
                                    if tem_duplicados4(c1,c2,c3,c4) == False:
                                        for x in c1:
                                            grelha[x[0]][x[1]] = 1
                                        for y in c2:
                                            grelha[y[0]][y[1]] = 2
                                        for w in c3:
                                            grelha[w[0]][w[1]] = 3
                                        for z in c4:
                                            grelha[z[0]][z[1]] = 4
                                        print('   TOUTATIS   ')
                                        for i in grelha:
                                            print(i)
                                        main()     
                    print( 'ALESIA' )
                    main()

                elif p == 5:
                    d = dict()
                    contador_1 = 1
                    for c in coordenadas:
                        inicio = c[0]
                        fim = c[1]
                        todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                        caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                        d[contador_1] = caminhos_poss
                        contador_1 += 1
                    
                    for c1 in d[1]:
                        for c2 in d[2]:
                            for c3 in d[3]:
                                for c4 in d[4]:
                                    for c5 in d[5]:
                         
                                        if tem_duplicados5(c1,c2,c3,c4,c5) == False:
                                            for x in c1:
                                                grelha[x[0]][x[1]] = 1
                                            for y in c2:
                                                grelha[y[0]][y[1]] = 2
                                            for w in c3:
                                                grelha[w[0]][w[1]] = 3
                                            for z in c4:
                                                grelha[z[0]][z[1]] = 4
                                            for k in c5:
                                                grelha[k[0]][k[1]] = 5
                                            print('   TOUTATIS   ')
                                            for i in grelha:
                                                print(i)
                                            main()           
                    print( 'ALESIA' )
                    main()

                elif p == 6:
                    d = dict()
                    contador_1 = 1
                    for c in coordenadas:
                        inicio = c[0]
                        fim = c[1]
                        todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                        caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                        d[contador_1] = caminhos_poss
                        contador_1 += 1
                    
                    for c1 in d[1]:
                        for c2 in d[2]:
                            for c3 in d[3]:
                                for c4 in d[4]:
                                    for c5 in d[5]:
                                        for c6 in d[6]:
                         
                                            if tem_duplicados6(c1,c2,c3,c4,c5,c6) == False:
                                                for x in c1:
                                                    grelha[x[0]][x[1]] = 1
                                                for y in c2:
                                                    grelha[y[0]][y[1]] = 2
                                                for w in c3:
                                                    grelha[w[0]][w[1]] = 3
                                                for z in c4:
                                                    grelha[z[0]][z[1]] = 4
                                                for k in c5:
                                                    grelha[k[0]][k[1]] = 5
                                                for h in c6:
                                                    grelha[h[0]][h[1]] = 6

                                                print('   TOUTATIS   ')
                                                for i in grelha:
                                                    print(i)
                                                main()             
                    print( 'ALESIA' )
                    main()


                elif p == 7:
                    d = dict()
                    contador_1 = 1
                    for c in coordenadas:
                        inicio = c[0]
                        fim = c[1]
                        todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                        caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                        d[contador_1] = caminhos_poss
                        contador_1 += 1
                    
                    for c1 in d[1]:
                        for c2 in d[2]:
                            for c3 in d[3]:
                                for c4 in d[4]:
                                    for c5 in d[5]:
                                        for c6 in d[6]:
                                            for c7 in d[7]:
                         
                                                if tem_duplicados7(c1,c2,c3,c4,c5,c6) == False:
                                                    for x in c1:
                                                        grelha[x[0]][x[1]] = 1
                                                    for y in c2:
                                                        grelha[y[0]][y[1]] = 2
                                                    for w in c3:
                                                        grelha[w[0]][w[1]] = 3
                                                    for z in c4:
                                                        grelha[z[0]][z[1]] = 4
                                                    for k in c5:
                                                        grelha[k[0]][k[1]] = 5
                                                    for h in c6:
                                                        grelha[h[0]][h[1]] = 6
                                                    for i in c7:
                                                        grelha[h[0]][h[1]] = 6
                                                    

                                                    print('   TOUTATIS   ')
                                                    for i in grelha:
                                                        print(i)
                                                    main()             
                    print( 'ALESIA' )                              
                    main()                
          
                    

            else:

                print("Numero invalido de habitantes \n")
                print("----------------------------------------------------\n")
                main()
                
############################### Opção 2 #######################################
    
#opcao 2, os inputs são feitos por um ficheiro dado pelo utilizador
#o tamanho da vila está no primeiro elemento da lista 
    elif op == 2:

        f = str(input("Insira o nome do ficheiro: "))
        coordenadas = abrir_ficheiro(f)
        grelha = cria_tabuleiro(int(coordenadas[0]))
        n = int(coordenadas[0])
        p = int(coordenadas[1])
        del coordenadas[0:2] #apagar o n e o numero de coordenadas
        for c in coordenadas:
            c = c.replace("\n", "")
            c = c.replace("", "")
       
        sinal = 1
        for c in coordenadas:
            grelha[int(c[0])][int(c[1])] = sinal
            grelha[int(c[2])][int(c[3])] = sinal
            sinal += 1
        listacoords = string_tuplo(coordenadas)
        grelha = tabuleiro_coordenadas(n,p,grelha,coordenadas)
        grafo = d_grafo(n)
        coordenadas = coordenadas_para_tuplo(coordenadas)
         
        
        if p==1:
            inicio = coordenadas[0][0]
            fim = coordenadas[0][1]
            caminho = find_shortest_path(grafo, inicio, fim, path=[])
            for c in caminho:
                grelha[c[0]][c[1]] = 1
            print('   TOUTATIS    ')
            for i in grelha:
                print(i)
            main()
                 

        elif p == 2:
            d = dict()
            contador_1 = 1
            for c in coordenadas:
                inicio = c[0]
                fim = c[1]
                todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                d[contador_1] = caminhos_poss
                contador_1 += 1
                    
            for c1 in d[1]:
                for c2 in d[2]:
                         
                    if tem_duplicados2(c1,c2) == False:
                        for x in c1:
                            grelha[x[0]][x[1]] = 1
                        for y in c2:
                            grelha[y[0]][y[1]] = 2
                        print('   TOUTATIS   ')
                        for i in grelha:
                            print(i)     
                        main()
                                       
                             
            print( ' ALESIA '  )
            main()       
               
          
        elif p == 3:
            d = dict()
            contador_1 = 1
            for c in coordenadas:
                inicio = c[0]
                fim = c[1]
                todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                d[contador_1] = caminhos_poss
                contador_1 += 1
                    
            for c1 in d[1]:
                for c2 in d[2]:
                    for c3 in d[3]:
                        
                        if tem_duplicados3(c1,c2,c3) == False:
                            for x in c1:
                                grelha[x[0]][x[1]] = 1
                            for y in c2:
                                grelha[y[0]][y[1]] = 2
                            for w in c3:
                                grelha[w[0]][w[1]] = 3
                            print('   TOUTATIS   ')
                            for i in grelha:
                                print(i)
                            main()    
             
                
            print( 'ALESIA' )
            main()        
       

        elif p == 4:
            d = dict()
            contador_1 = 1
            for c in coordenadas:
                inicio = c[0]
                fim = c[1]
                todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                d[contador_1] = caminhos_poss
                contador_1 += 1
                    
            for c1 in d[1]:
                for c2 in d[2]:
                    for c3 in d[3]:
                        for c4 in d[4]:
                                
                            if tem_duplicados4(c1,c2,c3,c4) == False:
                                for x in c1:
                                    grelha[x[0]][x[1]] = 1
                                for y in c2:
                                    grelha[y[0]][y[1]] = 2
                                for w in c3:
                                    grelha[w[0]][w[1]] = 3
                                for z in c4:
                                    grelha[z[0]][z[1]] = 4
                                print('   TOUTATIS   ')
                                for i in grelha:
                                    print(i)
                                main()     
            print( 'ALESIA' )
            main()            
       
        elif p == 5:
            d = dict()
            contador_1 = 1
            for c in coordenadas:
                inicio = c[0]
                fim = c[1]
                todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                d[contador_1] = caminhos_poss
                contador_1 += 1
                    
                for c1 in d[1]:
                    for c2 in d[2]:
                        for c3 in d[3]:
                            for c4 in d[4]:
                                for c5 in d[5]:
                         
                                    if tem_duplicados5(c1,c2,c3,c4,c5) == False:
                                        for x in c1:
                                            grelha[x[0]][x[1]] = 1
                                        for y in c2:
                                            grelha[y[0]][y[1]] = 2
                                        for w in c3:
                                            grelha[w[0]][w[1]] = 3
                                        for z in c4:
                                            grelha[z[0]][z[1]] = 4
                                        for k in c5:
                                            grelha[k[0]][k[1]] = 5
                                        print('   TOUTATIS   ')
                                        for i in grelha:
                                            print(i)
                                        main()           
            print( 'ALESIA' )
            main()

        elif p == 6:
            d = dict()
            contador_1 = 1
            for c in coordenadas:
                inicio = c[0]
                fim = c[1]
                todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                d[contador_1] = caminhos_poss
                contador_1 += 1
                    
                for c1 in d[1]:
                    for c2 in d[2]:
                        for c3 in d[3]:
                            for c4 in d[4]:
                                for c5 in d[5]:
                                    for c6 in d[6]:
                         
                                        if tem_duplicados6(c1,c2,c3,c4,c5,c6) == False:
                                            for x in c1:
                                                grelha[x[0]][x[1]] = 1
                                            for y in c2:
                                                grelha[y[0]][y[1]] = 2
                                            for w in c3:
                                                grelha[w[0]][w[1]] = 3
                                            for z in c4:
                                                grelha[z[0]][z[1]] = 4
                                            for k in c5:
                                                grelha[k[0]][k[1]] = 5
                                            for h in c6:
                                                grelha[h[0]][h[1]] = 6
                                            print('   TOUTATIS   ')
                                            for i in grelha:
                                                print(i)
                                            main()             
            print( 'ALESIA' )
            main()


        elif p == 7:
            d = dict()
            contador_1 = 1
            for c in coordenadas:
                inicio = c[0]
                fim = c[1]
                todos_caminhos = find_all_paths(grafo,inicio,fim,path=[])
                caminhos_poss = caminhos_possiveis(todos_caminhos, listacoords)
                d[contador_1] = caminhos_poss
                contador_1 += 1
                
            for c1 in d[1]:
                for c2 in d[2]:
                    for c3 in d[3]:
                        for c4 in d[4]:
                            for c5 in d[5]:
                                for c6 in d[6]:
                                    for c7 in d[7]:
                    
                                        if tem_duplicados7(c1,c2,c3,c4,c5,c6) == False:
                                            for x in c1:
                                                grelha[x[0]][x[1]] = 1
                                            for y in c2:
                                                grelha[y[0]][y[1]] = 2
                                            for w in c3:
                                                grelha[w[0]][w[1]] = 3
                                            for z in c4:
                                                grelha[z[0]][z[1]] = 4
                                            for k in c5:
                                                grelha[k[0]][k[1]] = 5
                                            for h in c6:
                                                grelha[h[0]][h[1]] = 6
                                            for i in c7:
                                                grelha[h[0]][h[1]] = 6
                                                

                                            print('   TOUTATIS   ')
                                            for i in grelha:
                                                print(i)
                                            main()             
            print( 'ALESIA' )                              
            main()

################################ FUNCOES AUXILIARES ###########################
                                   # COORDENADAS #
#funcao q retorna uma lista com as coordenadas
#implementa um ciclo while que vai adicionar p coordenadas

def coord_lista(n,p,tab):
            l = []
            contador = 0
            while contador < p:
                c = str(input("Insira as coordenadas: "))
                c = coord_corretas(c)

        #verificar se ha sobreposicao de coordenadas anteriores
                if tab[int(c[0])][int(c[1])]==0 and tab[int(c[2])][int(c[3])]==0:
            #verificar se as coordenadas da pocao e do habitante sao diferentes
                    if c[0:2] != c[2:4]:
                        
                        l.append(c)
                        tab[int(c[0])][int(c[1])] = contador+1
                        tab[int(c[2])][int(c[3])] = contador+1
                        contador += 1
                    else:
                        print("Existe sobreposiçao de coordenadas\n")
                        print("--------------------------------------------\n")
                        break
                    
                
                else:
                    print("Existe sobreposiçao de coordenadas\n")
                    print("------------------------------------------------\n")
                    break
             
                
            return l

# Funcao que retorna o tabuleiro ja com habitantes e poçoes
def tabuleiro_coordenadas(n,p,tabuleiro,lista):
    c = 0
    for coord in lista:
        tabuleiro[int(coord[0])][int(coord[1])] = c+1
        tabuleiro[int(coord[2])][int(coord[3])] = c+1
        c += 1
        
    return tabuleiro

# funcao para criar um tabuleiro vazio nxn
def cria_tabuleiro(n):
    if n <=1 or n >= 8:  
        print("Vila com tamanho invalido \n")
        print("------------------------------------------------------------\n")
    else:
        matriz= []
        for i in range(n):     
            matriz.append([])    
            for j in range(n):
                matriz[i].append(int(0)) 
        return matriz

    

#funcao que junta numa lista todos os elementos do ficheiro
def abrir_ficheiro(f):
    ficheiro = open(f+'.txt')
    l = []
    for linha in ficheiro:
        l.append(linha)
    return l
    ficheiro.close()

#funcao para ver se os inputs são numeros
def sao_inteiros(valor):
    while valor.isdigit()==False:
        valor = input('Insira um valor valido para o tamanho da vila')
    return int(valor)

#funcao para verificar se as coordenadas estão corretas
def coord_corretas(coord):
    while coord.isdigit() == False or len(coord) != 4:
        coord = input('Insira uma coordenada valida: ')
    return coord

#retorna um tuplo com a posiçao
def posicao_inteiro(pos):
    return (int(pos[0]),int(pos[1]))

#funcao para passar lista coordenadas para tuplo
def coordenadas_para_tuplo(l):
    h = []
    for c in l:
        h.append((tuple([int(c[0]),int(c[1])]),tuple([int(c[2]),int(c[3])])))

    return h
    
    
    

#########################FUNCOES AUXILIARES####################################
                       # PROCURAR CAMINHOS #

#retorna uma lista com os vizinhos


def vizinhos(pos_atual,n):
    direcoes = [(0,1),(0,-1),(1,0),(-1,0)]
    viz = []
    for d in direcoes:
        if d[0]+int(pos_atual[0]) >= 0 and d[0]+int(pos_atual[0]) < n:
            if d[1]+int(pos_atual[1]) >= 0 and d[1]+int(pos_atual[1]) < n:
                    viz.append((d[0]+int(pos_atual[0]),d[1]+int(pos_atual[1])))
    return viz

#fazer um grafo de todos os caminhos possiveis
def d_grafo(n):
    grafo = dict()
    for i in range(n):
        for j in range(n):
           
            grafo[(i,j)] = vizinhos((i,j),n)
    
    return grafo

#encontrar todos os caminhos          

def find_all_paths(graph, start, end, path=[]):
        path = path + [start]
        if start == end:
            return [path]
        if start not in graph.keys():
            return []
        paths = []
        for node in graph[start]:
            if node not in path:
                newpaths = find_all_paths(graph, node, end, path)
                for newpath in newpaths:
                    paths.append(newpath)
        return paths
        
              

#remove todos os valores com que tiverem esse valor na lista
def remover_da_lista(lista, val):
        while val in lista:
            lista.remove(val)


#funcao para achar caminho mais curto
def find_shortest_path(graph, start, end, path=[]):
        path = path + [start]
        if start == end:
            return path
        if start not in graph.keys():
            return None
        shortest = None
        for node in graph[start]:
            if node not in path:
                newpath = find_shortest_path(graph, node, end, path)
                if newpath:
                    if not shortest or len(newpath) < len(shortest):
                        shortest = newpath
        return shortest
#todos os caminhos possiveis
def caminhos_possiveis(listatodos, listacoords):
    listaposs = []
    for caminho in listatodos:
        del caminho[0]
        del caminho[-1]
        listaposs.append(caminho)
    contador = 0
    for caminho in listaposs:
        for coord in caminho:
            if coord in listacoords:
                listaposs[contador] = 0
        contador += 1   
    remove_values_from_list(listaposs,0)
    return listaposs



#remove todos os valores com que tiverem esse valor na lista
def remove_values_from_list(the_list, val):
        while val in the_list:
            the_list.remove(val)

#passar coordenadas em string para lista de tuplos

def string_tuplo(l):
    lista = []
    for c in l:
        lista.append((int(c[0]),int(c[1])))
        lista.append((int(c[2]),int(c[3])))
    return lista


def tem_duplicados2(l1,l2):
    for x in l1:
       if x in l2:
           return True 
    
    return False

def tem_duplicados3(l1,l2,l3):
    for x in l1:
       for y in l2:
           if x in l2 or x in l3 or y in l3:
               return True 
    
    return False

def tem_duplicados4(l1,l2,l3,l4):
    for x in l1:
       for y in l2:
           for z in l3:
               if x in l2 or x in l3 or x in l4:
                   return True 
               elif y in l3 or y in l4 or z in l4:
                   return True
    return False

def tem_duplicados5(l1,l2,l3,l4,l5):
    for x in l1:
       for y in l2:
           for z in l3:
               for w in l4:
                   if x in l2 or x in l3 or x in l4 or x in l5:
                       return True 
                   elif y in l3 or y in l4 or y in l5:
                       return True
                   elif z in l4 or z in l5 or w in l5:
                       return True
    return False

def tem_duplicados6(l1,l2,l3,l4,l5,l6):
    for x in l1:
       for y in l2:
           for z in l3:
               for w in l4:
                   for k in l5:
                       if x in l2 or x in l3 or x in l4 or x in l5 or x in l6:
                           return True 
                       elif y in l3 or y in l4 or y in l5 or y in l6:
                           return True
                       elif z in l4 or z in l5 or z in l6:
                           return True
                       elif w in l5 or w in l6 or k in l6:
                           return True
    return False

def tem_duplicados7(l1,l2,l3,l4,l5,l6,l7):
    for x in l1:
       for y in l2:
           for z in l3:
               for w in l4:
                   for k in l5:
                       for h in l6:
                           if x in l2 or x in l3 or x in l4:
                               return True 
                           elif x in l5 or x in l6 or x in l7:
                               return True
                           elif y in l3 or y in l4 or y in l5:
                               return True
                           elif y in l6 or y in l7:
                               return True
                           elif z in l4 or z in l5 or z in l6 or z in l7:
                               return True
                           elif w in l5 or w in l6 or w in l7:
                               return True
                           elif k in l6 or k in l7 or h in l7:
                               return True
    return False





main()

