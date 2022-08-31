## Versão Da API que Simula 3 Máquinas | Atividade Cálculo
## GRUPO : 03 - Guardian Angel
## Nome: Danylo Dias Gomes | RA: 02221004

## Versão base da API é a mesma do grupo, com as modificações para simular as máquinas feitas individualmente

## Inserção no banco comentada para evitar erros ao não encontrar o banco de dados na máquina local, para executar inserção
## basta usar o script do banco da sprint

import psutil
from psutil import virtual_memory
import os
from time import sleep
# import pymysql
import matplotlib.pyplot as plt
from matplotlib.animation import FuncAnimation

os.system('cls')
escolha = 0
while escolha != 4:
    os.system('cls')
    print('''Insira o número de acordo com o seu desejo: 
    [1] Memória RAM
    [2] Uso da CPU
    [3] Disco
    ''')
    escolha = float(input('Entrar: '))

    if escolha == 1:
        os.system('cls')
        # conversão memória virtual em GB
        # (bytes --> kb = total/1024)
        # (bytes --> mb = total/1024/1024)
        # (bytes --> gb = total/1024/1024/1024)

        # memória virtual

        def convert_gb(value):
            return f'{value /1024/1024/1024: .2f}GB' 

        ram = (virtual_memory().total)/1024/1024/1024
        ramU = (virtual_memory().used)/1024/1024/1024
        ram1 = ram + (ram * 0.15)
        ramU1 = ramU + (ramU * 0.15)
        ram2 = ram1 - (ram1 * 0.05)
        ramU2 = ramU1 - (ramU1 * 0.05)
        print("=-="*20)
        print("Memória RAM total na máquina 1:")
        print('{:.2f}'.format(ram),"GB") #total
        print("Memória RAM sendo utilizada na máquina 1:")
        print('{:.2f}'.format(ramU),'GB') #usando no momento
        print("=-="*20)
        print("=-="*20)
        print("Memória RAM total na máquina 2:")
        print('{:.2f}'.format(ram1),"GB") #total
        print("Memória RAM sendo utilizada na máquina 2:")
        print('{:.2f}'.format(ramU1),'GB') #usando no momento
        print("=-="*20)
        print("=-="*20)
        print("Memória RAM total na máquina 3:")
        print('{:.2f}'.format(ram2),"GB") #total
        print("Memória RAM sendo utilizada na máquina 3:")
        print('{:.2f}'.format(ramU2),'GB') #usando no momento
        print("=-="*20)


        def definirGraficoRAM(frame):
            valores1.append(round(psutil.virtual_memory().used / psutil.virtual_memory().total * 100, 2))
            valores1.remove(valores1[0])
            
            valores2.append(round(valores1[-1] + (valores1[-1] * 0.15), 2))
            valores2.remove(valores2[0])
            
            valores3.append(round(valores2[-1] - (valores2[-1] * 0.05), 2))
            valores3.remove(valores3[0])

            graficosRAM.cla()
            graficosRAM.plot(valores1)
            graficosRAM.title.set_text(f'Memoria RAM - {valores1[-1]}%')
            graficosRAM.set_ylim(0, 100)
            
            graficosRAM2.cla()
            graficosRAM2.plot(valores2)
            graficosRAM2.title.set_text(f'Memoria RAM - {valores2[-1]}%')
            graficosRAM2.set_ylim(0, 100)
            
            graficosRAM3.cla()
            graficosRAM3.plot(valores3)
            graficosRAM3.title.set_text(f'Memoria RAM - {valores3[-1]}%')
            graficosRAM3.set_ylim(0, 100)

            # conexao = pymysql.connect(db='GuardianAngel', user='user_atividePI', passwd='sptech')
            # cursor = conexao.cursor()
            # cursor.execute("INSERT INTO registro (fkMaquina, componente, registroComponente, horaRegistro) VALUES (1, 1, '{:.2f}', NOW())".format(ramU))
            # cursor.execute("INSERT INTO registro (fkMaquina, componente, registroComponente, horaRegistro) VALUES (2, 1, '{:.2f}', NOW())".format(ramU1))
            # cursor.execute("INSERT INTO registro (fkMaquina, componente, registroComponente, horaRegistro) VALUES (3, 1, '{:.2f}', NOW())".format(ramU2))
            # conexao.commit()
            # conexao.close()

        valores1 = [0]*50
        valores2 = [0]*50
        valores3 = [0]*50

        janelaGeral = plt.figure(figsize=(4*3, 4*3), facecolor='#EEE')

        graficosRAM = plt.subplot(311)
        graficosRAM2 = plt.subplot(312)
        graficosRAM3 = plt.subplot(313)

        # graficosRAM.axes.get_xaxis().set_visible(False)
        graficosRAM.set_facecolor('#DDD')

        animacaoGeral = FuncAnimation(janelaGeral, definirGraficoRAM, interval=100)

        plt.show()


        sleep(8)
        # memória virtual
        os.system('cls')
        print("Voltando ao menu...")
        sleep(2)

    elif escolha == 2:
        os.system('cls')
        freq = psutil.cpu_percent()
        freq1 = freq + (freq * 0.10)
        freq2 = freq + (freq * 0.05)

        print("=-="*20)
        #Uso CPU 1
        print("Velocidade da CPU 1: ")
        print('{:.2f}'.format(freq),"GHz")
        print("=-="*20)
        #Uso CPU 2
        print("Velocidade da CPU 2: ")
        print('{:.2f}'.format(freq1),"GHz")
        print("=-="*20)
        #Uso CPU 3
        print("Velocidade da CPU 3: ")
        print('{:.2f}'.format(freq2),"GHz")
        print("=-="*20)
        

        def definirGraficoCPU(frame):
            freqG = psutil.cpu_percent()
            freq1G = freqG + (freqG * 0.10)
            freq2G = freq1G + (freq1G * 0.05)
            
            valores1.append(round(freqG, 1))
            valores1.remove(valores1[0])
            valores2.append(round(freq1G, 1))
            valores2.remove(valores2[0])
            valores3.append(round(freq2G, 1))
            valores3.remove(valores3[0])

            graficosCPU1.cla()
            graficosCPU1.plot(valores1)
            graficosCPU1.title.set_text(f'Velocidade CPU 1 - {round(valores1[-1], 1)}%')
            graficosCPU1.set_ylim(0, 100)
            
            graficosCPU2.cla()
            graficosCPU2.plot(valores2)
            graficosCPU2.title.set_text(f'Velocidade CPU 2 - {round(valores2[-1], 1)}%')
            graficosCPU2.set_ylim(0, 100)
            
            graficosCPU3.cla()
            graficosCPU3.plot(valores3)
            graficosCPU3.title.set_text(f'Velocidade CPU 3 - {round(valores3[-1], 1)}%')
            graficosCPU3.set_ylim(0, 100)

            # conexao = pymysql.connect(db='GuardianAngel', user='user_atividePI', passwd='sptech')
            # cursor = conexao.cursor()
            # cursor.execute("INSERT INTO registro (fkMaquina, componente, registroComponente, horaRegistro) VALUES (1, 2, '{:.1f}', NOW())".format(freqG))
            # cursor.execute("INSERT INTO registro (fkMaquina, componente, registroComponente, horaRegistro) VALUES (2, 2, '{:.1f}', NOW())".format(freq1G))
            # cursor.execute("INSERT INTO registro (fkMaquina, componente, registroComponente, horaRegistro) VALUES (3, 2, '{:.1f}', NOW())".format(freq2G))
            # conexao.commit()
            # conexao.close()

        valores1 = [0]*50
        valores2 = [0]*50
        valores3 = [0]*50

        janelaGeral = plt.figure(figsize=(4*3, 4*3), facecolor='#EEE')

        graficosCPU1 = plt.subplot(311)
        graficosCPU2 = plt.subplot(312)
        graficosCPU3 = plt.subplot(313)

        graficosCPU1.axes.get_xaxis().set_visible(False)
        graficosCPU1.set_facecolor('#DDD')
        graficosCPU2.axes.get_xaxis().set_visible(False)
        graficosCPU2.set_facecolor('#DDD')
        graficosCPU3.axes.get_xaxis().set_visible(False)
        graficosCPU3.set_facecolor('#DDD')

        animacaoGeral = FuncAnimation(janelaGeral, definirGraficoCPU, interval=1000)

        plt.show()

        
        sleep(8)
        os.system('cls')
        print("Voltando ao menu...")
        sleep(2)

    elif escolha == 3:
        os.system('cls')
        # free_disk=(psutil.disk_usage('C:\\').free)/1024/1024/1024
        percentage_disk=(psutil.disk_usage('C:\\').percent)
        
        usoDisco1 = percentage_disk
        usoDisco2 = percentage_disk - (percentage_disk * 0.05)
        usoDisco3 = usoDisco2 * 3

        print("Porcentagem de espaço sendo usado no disco da máquina 1: ")
        print('{:.2f}'.format(usoDisco1),"%")
        print("=-="*20)
        print("Porcentagem de espaço sendo usado no disco da máquina 2: ")
        print('{:.2f}'.format(usoDisco2),"%")
        print("=-="*20)
        print("Porcentagem de espaço sendo usado no disco da máquina 3: ")
        print('{:.2f}'.format(usoDisco3),"%")
        print("=-="*20)

        def definirGraficoDisco(frame):
            
            usoDisco1G = percentage_disk
            usoDisco2G = percentage_disk - (percentage_disk * 0.05)
            usoDisco3G = usoDisco2 * 3
            
            valores1.append('{:.2f}'.format(usoDisco1G))
            valores1.remove(valores1[0])
            valores2.append('{:.2f}'.format(usoDisco2G))
            valores2.remove(valores2[0])
            valores3.append('{:.2f}'.format(usoDisco3G))
            valores3.remove(valores3[0])

            graficosDisco1.cla()
            graficosDisco1.plot(valores1)
            graficosDisco1.scatter(len(valores1) - 1, valores1[-1])
            graficosDisco1.title.set_text(f'Quantidade ocupada no disco da máquina 1- {valores1[-1]}%')
            graficosDisco1.set_ylim(0, 100)
            
            graficosDisco2.cla()
            graficosDisco2.plot(valores2)
            graficosDisco2.scatter(len(valores2) - 1, valores2[-1])
            graficosDisco2.title.set_text(f'Quantidade ocupada no disco da máquina 2 - {valores2[-1]}%')
            graficosDisco2.set_ylim(0, 100)
            
            graficosDisco3.cla()
            graficosDisco3.plot(valores3)
            graficosDisco3.scatter(len(valores3) - 1, valores3[-1])
            graficosDisco3.title.set_text(f'Quantidade ocupada no disco da máquina 3 - {valores3[-1]}%')
            graficosDisco3.set_ylim(0, 100)

            # conexao = pymysql.connect(db='GuardianAngel', user='user_atividePI', passwd='sptech')
            # cursor = conexao.cursor()
            # cursor.execute("INSERT INTO registro (fkMaquina, componente, registroComponente, horaRegistro) VALUES (1, 3, '{:.2f}', NOW())".format(usoDisco1G))
            # cursor.execute("INSERT INTO registro (fkMaquina, componente, registroComponente, horaRegistro) VALUES (2, 3, '{:.2f}', NOW())".format(usoDisco2G))
            # cursor.execute("INSERT INTO registro (fkMaquina, componente, registroComponente, horaRegistro) VALUES (3, 3, '{:.2f}', NOW())".format(usoDisco3G))
            # conexao.commit()
            # conexao.close()

        valores1 = [0]*50
        valores2 = [0]*50
        valores3 = [0]*50

        janelaGeral = plt.figure(figsize=(3*3, 2*2), facecolor='#EEE')

        graficosDisco1 = plt.subplot(311)
        graficosDisco2 = plt.subplot(312)
        graficosDisco3 = plt.subplot(313)

        graficosDisco1.axes.get_xaxis().set_visible(False)
        graficosDisco1.set_facecolor('#DDD')
        graficosDisco2.axes.get_xaxis().set_visible(False)
        graficosDisco2.set_facecolor('#DDD')
        graficosDisco3.axes.get_xaxis().set_visible(False)
        graficosDisco3.set_facecolor('#DDD')

        animacaoGeral = FuncAnimation(janelaGeral, definirGraficoDisco, interval=5000)

        plt.show()

        sleep(8)
        os.system('cls')
        print("Voltando ao menu...")
        sleep(2)

    else:
        print("Insira um dos números a cima!")
        sleep (1.5)



