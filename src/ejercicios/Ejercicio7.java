package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        int CANTIDAD_MANZANAS_X_CAJON = 8;
        int cantidadManzanas;
        int cajones;
        String finalCajones = "cajones";

        System.out.println("Ingrese la cantidad de manzanas");
        Scanner scan = new Scanner(System.in);
        cantidadManzanas = scan.nextInt();
        scan.close();


        if ((cantidadManzanas % CANTIDAD_MANZANAS_X_CAJON) == 0) {
            cajones = cantidadManzanas / CANTIDAD_MANZANAS_X_CAJON;
        } else {
            cajones = cantidadManzanas / CANTIDAD_MANZANAS_X_CAJON;
            cajones++;
        }

        if (cajones == 1) {
            finalCajones = "cajon";
        }
        System.out.println("Se necesita de " + cajones + " " + finalCajones);

    }


}
