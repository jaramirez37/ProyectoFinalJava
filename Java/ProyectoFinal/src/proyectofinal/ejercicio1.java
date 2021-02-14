package ProyectoFinal;
//Leer n números enteros, almacenarlos en un vector y determinar a cuánto es igual el promedio entero 
//de las factoriales de cada uno de los números leídos.

import java.util.Scanner;

public class ejercicio1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double promedio = 0;
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int longitud = sc.nextInt();
        int[] Vector = new int[longitud];

        System.out.println("Ingrese los valores del vector: ");
        //Se lee el vector
        for (int i = 0; i < longitud; i++) {
            System.out.print(">");
            Vector[i] = sc.nextInt();
            //Se calcula el factorial de cada número del vector
            promedio = promedio + Factorial(Vector[i]);
        }
        
        promedio = promedio / longitud;
        System.out.println("El promedio entero de los factoriales de cada número es: " + (int) promedio);

    }

    //Se usa una función recursiva para poder calcular el factorial
    public static int Factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Factorial(num - 1);
        }

    }
}
