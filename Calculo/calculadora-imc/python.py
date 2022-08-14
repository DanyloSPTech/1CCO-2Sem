#Calculadora de IMC | Danylo Dias Gomes  02221004

import json
from os import path
from pickle import FALSE, TRUE
# from importlib_metadata import files

exec = TRUE

dadosJson = {'Nome', 'IMC'}

#DEIXAR O CAMINHO DO ARQUIVO LOCAL DO PYTHON.PY
caminho = 'E:/Users/Danyl/Documents/workspacepython/lista.json'

while exec:
    print('='*30)
    nome = input('Bem vindo a calculador de IMC! Informe o nome da pessoa:\n')
    print('='*30)
    p = float(input('Cadastrando: {}, quanto essa pessoa pesa?\n'.format(nome)))
    print('='*30)
    print('='*30)
    h = float(input('Ok, e quanto ela mede?\n'))
    print('='*30)
    imc = round(p/h**2, 1)
    print("Nome: {}\nIMC Calculado: {:.1f}".format(nome, imc))
    if imc < 18.5:
        print('Diagnóstico: Abaixo do peso normal')
    elif 18.5 <= imc < 25:
        print('Diagnóstico: peso normal')
    elif 25 <= imc < 30:
        print('Diagnóstico: sobrepeso')
    elif 30 <= imc < 40:
        print('Diagnóstico: obeso')
    elif imc >= 40:
        print('Diagnóstico: obesidade mórbida')
    print('='*30)
    r = input('Deseja salvar esse resultado em um arquivo JSON? | s -> sim ou n -> não\n')
    if r == 's':
        print('='*30)
        if path.isfile(caminho):
            with open(caminho) as a:
                listaJson = json.load(a)
                listaJson.append({"Nome": nome,
                                  "IMC": imc},)
            with open(caminho, 'w') as arquivo_json:
                json.dump(listaJson, arquivo_json, indent=4)
        else:
            with open(caminho, 'w') as arquivo_json:
                dicionario = [
                    {"Nome": nome,
                    "IMC": imc},
                ]
                json.dump(dicionario, arquivo_json, indent=4)
        print('='*30)
        print('Dados guardados no arquivo lista.json na pasta raiz do \narquivo, verifique a pasta raiz do programa para achar o arquivo.')
        print('='*30)
        encerrar = input('Deseja cadastrar uma nova pessoa? | s -> sim ou n -> não\n')
        if encerrar == 'n':
            break
    elif r == 'n':
        print('='*30)
    else:
        print('erro')