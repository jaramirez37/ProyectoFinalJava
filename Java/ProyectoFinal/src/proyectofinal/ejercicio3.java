package ProyectoFinal;

/* Construir una función que reciba como parámetros un vector de 10 posiciones enteras 
y un dígito y que retorne la cantidad de veces que dicho dígito se encuentra en el vector. No se olvide que
un mismo dígito puede estar varias veces en un solo número */
import java.util.Scanner;

public class ejercicio3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vector = new int[10];
        int digito, contadorRepetido = 0;

        System.out.println("Ingresar el dígito que desea verificar: ");
        digito = sc.nextInt();
        System.out.println("Ingrese los valores del vector: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(">");
            vector[i] = sc.nextInt();
            contadorRepetido += DeterminarCantidadDigitos(vector[i], digito);
        }
        System.out.print("La cantidad de veces que se repite el digito en el vector es: " + contadorRepetido);

    }

    public static int DeterminarCantidadDigitos(int num, int digito) {
        int cantidadDigitos = 0, cantidadRepeticiones = 0, numHelper = num, FamiliaDiez = 10, digitoInterno = 0;
        while (numHelper >= 1) {
            numHelper = (int) (numHelper / 10);
            cantidadDigitos += 1;
        }

        for (int i = 0; i < cantidadDigitos; i++) {
            if (i > 0) {
                digitoInterno = (int) (num / FamiliaDiez) % FamiliaDiez;
            } else {
                digitoInterno = (int) (num % FamiliaDiez);

            }
            FamiliaDiez *= 10;
            if (digitoInterno == digito) {
                cantidadRepeticiones += 1;
            }
        }

        return cantidadRepeticiones;
    }
}
