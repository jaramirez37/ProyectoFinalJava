package ProyectoFinal;

/*Leer dos matrices 5x5 enteras y determinar si el promedio entero de todos los elementos que
  no están en la diagonal de una matriz es igual al promedio entero de todos los
  elementos que no están en la diagonal de la otra matriz */

import java.util.Scanner;

public class ejercicio2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] Matriz1 = new int[5][5];
        int[][] Matriz2 = new int[5][5];

        System.out.println("Ingrese los valores de la primera matriz: ");
        Matriz1 = LeerVector(Matriz1);
        System.out.println("Ingrese los valores de segunda matriz: ");
        Matriz2 = LeerVector(Matriz2);

        double promedio1 = DeterminarPromedio(Matriz1);
        double promedio2 = DeterminarPromedio(Matriz2);
        System.out.println("Promedio de la primera matriz: " + promedio1);
        System.out.println("Promedio de la segunda matriz: " + promedio2);

        if (promedio1 == promedio2) {
            System.out.println("El promedio de los números que no están en la matriz  es igual al promedio de la segunda matriz.");
        } else {
            System.out.println("El promedio de los números que no están en la matriz no es igual al promedio de la segunda matriz.");
        }
    }

    public static int[][] LeerVector(int[][] vector) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = sc.nextInt();
            }
        }
        return vector;
    }

    public static double DeterminarPromedio(int[][] vector) {
        double promedio = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (i != j) {
                    promedio = promedio + vector[i][j];
                }
            }
        }
        promedio = promedio / 20;
        return promedio;
    }

}
