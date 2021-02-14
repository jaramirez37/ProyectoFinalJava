import numpy


def DeterminarPromedio(matriz):
    promedio = 0
    for i in range(0, 5):
        for j in range(0, 5):
            if (i != j):
                promedio = promedio + matriz[i][j]
    promedio = promedio / 20
    return promedio


def LeerMatriz():
    matriz = numpy.zeros([5, 5], dtype=int)
    for i in range(0, len(matriz)):
        for j in range(0, len(matriz[i])):
            print("> ", end="")
            matriz[i][j] = int(input())
    return matriz


print("Ingrese los valores de la primera matriz: ")
matriz1 = LeerMatriz()
print("Ingrese los valores de la segunda matriz: ")
matriz2 = LeerMatriz()

promedio1 = DeterminarPromedio(matriz1)
promedio2 = DeterminarPromedio(matriz2)

print("Promedio de la primera matriz: " , promedio1)
print("Promedio de la segunda matriz: " , promedio2)

if promedio1 == promedio2:
    print("El promedio de los números que no están en la diagonal  es igual al promedio de la segunda matriz.")
else:
    print("El promedio de los números que no están en la diagonal no es igual al promedio de la segunda matriz.")
