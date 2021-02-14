import numpy 

def Factorial(num):
    if num == 0:
        return 1
    else:
        return num * Factorial(num - 1)

longitud = int(input("Ingrese la cantidad de números a ingresar: " ))
vector = numpy.zeros([longitud] , dtype = int)

print("Ingrese los valores del vector: ")

promedio = 0
for i in range (0, longitud):
    print("> ", end = "")
    vector[i] = int(input())
    promedio = promedio + Factorial(int(vector[i]))

promedio = int(promedio / longitud)
print ("El promedio entero de los factoriales de cada número es: " , promedio);

