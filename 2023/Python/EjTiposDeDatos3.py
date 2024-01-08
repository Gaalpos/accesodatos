# 10. Una juguetería tiene mucho éxito en dos de sus productos: payasos y muñecas.
# Suele hacer venta por correo y la empresa de logística les cobra por peso de cada
# paquete así que deben calcular el peso de los payasos y muñecas que saldrán en
# cada paquete a demanda. Cada payaso pesa 112 g y cada muñeca 75 g. Escribir un
# programa que lea el número de payasos y muñecas vendidos en el último pedido y
# calcule el peso total del paquete que será enviado
def diez():
    peso_payaso = 112
    peso_munheca = 75
    num_payasos = int(input('Numero de payasos: '))
    num_munhecas = int(input('Numero de munhecas: '))
    total_kg = (num_payasos*peso_payaso+num_munhecas*peso_munheca)/1000
    print ('Peso total: ', total_kg , ' kilos' )

# 11. Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de
# interés al año. Estos ahorros debido a intereses, que no se cobran hasta finales de
# año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa
# que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros,
# introducida por el usuario. Después el programa debe calcular y mostrar por
# pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear
# cada cantidad a dos decimales.

def once():
    ahorros = int(input('Ahorros iniciales: '))
    interes = 4
    for i in range(1,4):
      print("Ahorrros iniciales año", i ,' : ', round(ahorros, 2))
      ahorros = ahorros + ahorros*(interes/100)
      print('Ahorros finales : ', round(ahorros,2) )

once()