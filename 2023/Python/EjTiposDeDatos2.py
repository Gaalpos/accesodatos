# Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros),
# calcule el índice de masa corporal y lo almacene en una variable, y muestre por
# pantalla la frase Tu índice de masa corporal es <imc>
# donde <imc> es el índice de masa corporal calculado
# redondeado con dos decimales

peso = float(input('Su peso:'))
altura = float(input('Su altura: '))
imc = (peso/(altura**2))
print('Indice masa corporal: ',round(imc, 2))

# 8. Escribir un programa que pida al usuario dos números
# enteros y muestre por pantalla la <n> entre <m> da un cociente <c> y un resto
# <r> donde <n> y <m> son los números introducidos por el usuario, y <c> y <r>
# son el cociente y el resto de la división entera respectivamente.

num1 = int(input('Numero 1 : '))
num2 = int(input('Numero 2 : '))
cociente = num1/num2
resto = num1 % num2
print('Cociente: ', int(cociente), ' Resto: ',resto)


# 9. Escribir un programa que pregunte al usuario una cantidad a invertir, el interés
# anual y el número de años, y muestre por pantalla el capital obtenido en la
# inversión.

dinero = int(input('Cantidad a invertir: '))
interes = int(input('Interes: '))
year = int (input('Anhos : '))
total = (dinero * interes * year) + dinero
print('Total: ', total)



