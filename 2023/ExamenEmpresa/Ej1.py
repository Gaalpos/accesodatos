# euros a dolares con user input y comprobar que no es engativo
euros = input("Introduce una cantidad de euros: ")
euros = float(euros)
while euros < 0:
    print("No puede ser negativo")
    euros = input("Introduce una cantidad de euros: ")
    euros = float(euros)