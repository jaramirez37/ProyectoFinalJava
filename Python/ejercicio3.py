import numpy 

def DeterminarCantidadDigitos(num, digito):
    cantidadDigitos = 0
    numHelper = num
    FamiliaDiez = 10
    digitoInterno = 0
    cantidadRepeticiones = 0
   
    
    while (numHelper >= 1):
        numHelper = round(numHelper / 10)
        cantidadDigitos += 1
    
    for i in range (0, cantidadDigitos):
        if i > 0:
            digitoInterno = round(num / FamiliaDiez) % FamiliaDiez
        else:
            digitoInterno = (num % FamiliaDiez)
        
        FamiliaDiez = FamiliaDiez * 10
        if digitoInterno == digito:
            cantidadRepeticiones += 1
    
    return cantidadRepeticiones
digito = int(input("Ingrese el dígito que desea verificar: "))
print("Ingrese los valores del vector: ")

vector = numpy.zeros([2], dtype=int)
contadorRepetido = 0
for i in range(0, 2):
    print(">", end = "")
    vector[i] = int(input())
    contadorRepetido = contadorRepetido +  DeterminarCantidadDigitos(int(vector[i]), int(digito))

print("La cantidad de veces que se repite el digito en el vector es: " , contadorRepetido)

