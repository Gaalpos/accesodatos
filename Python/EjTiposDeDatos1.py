#1 Escribir un programa que muestre por pantalla la cadena ¡Hola Mundo!.

print('Hola mundo')

#2 Escribir un programa que almacene la cadena ¡Hola Mundo! en una variable y luego
# muestre por pantalla el contenido de la variable

holaMundo = 'Hola mundo'
print(holaMundo)

 #3. Escribir un programa que pregunte el nombre del usuario en la consola y después
# de que el usuario lo introduzca muestre por pantalla la cadena ¡Hola <nombre>!,
# donde <nombre> es el nombre que el usuario haya introducido.\
    
nombre = input("Escriba su nombre:  ")
print('Hola ', nombre)

# 4. Escribir un programa que muestre por pantalla el resultado de la
# siguiente operación aritmética (3+2 / 2*5)**2

print(((3+2)/(2*5))**2 )


# 5. Escribir un programa que pregunte al usuario por el número de horas trabajadas y
# el coste por hora. Después debe mostrar por pantalla la paga que le corresponde.

horas = int(input('Horas que trabajas?'))
euros = int(input('Salario / hora? '))
print('Tienen que pagarte ', euros*horas ,' euros')

# 6. Escribir un programa que lea un entero positivo, introducido
# por el usuario y después muestre en pantalla la suma de
# todos los enteros desde 1 hasta la suma de los primeros
# enteros positivos puede ser calculada de la siguiente forma:
numero = int(input('Escribe un numero'))
if numero >= 0:
    suamtorio = numero*(numero + 1 ) /2
    print('Suma total ' , suamtorio)
else :
    print('numero no valido')
