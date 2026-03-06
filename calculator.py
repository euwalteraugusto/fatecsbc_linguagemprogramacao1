# Calculadora em Python

numero1 = int(input("Digite o primeiro número: "))
numero2 = int(input("Digite o segundo número: "))

soma = numero1 + numero2
subtracao = numero1 - numero2
divisao = numero1 / numero2
multiplicacao = numero1 * numero2

print("Os operadores podem ser: +,-,/,*")
operador = input("Escolha o operador: ")

if operador == "+":
    print("A soma entre {} e {} é igual a: {}".format(numero1, numero2, soma))
elif operador == "-":
    print("A subtração entre {} e {} é igual a: {}".format(numero1, numero2, subtracao))
elif operador == "/":
    print("A divisão entre {} e {} é igual a: {}".format(numero1, numero2, divisao))
else:
    print("A multiplicação entre {} e {} é igual a: {}".format(numero1, numero2, multiplicacao))
