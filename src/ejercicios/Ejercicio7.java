package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        int CANTIDAD_MANZANAS_X_CAJON = 8;
        int cantidadManzanas;
        int cajones;
        boolean mientras = true;

        System.out.println("Ingrese la cantidad de manzanas");
        Scanner scan = new Scanner(System.in);
        cantidadManzanas = scan.nextInt();
        scan.close();


        if ((cantidadManzanas%CANTIDAD_MANZANAS_X_CAJON) == 0) {
            cajones = cantidadManzanas / CANTIDAD_MANZANAS_X_CAJON;
            System.out.println("Se necesitan de " + cajones + " cajones");

        } else {
            if (cantidadManzanas == CANTIDAD_MANZANAS_X_CAJON) {
                cajones = 1;
                System.out.println("Se necesita de " + cajones + " cajon");
            } else {
                cajones = cantidadManzanas / CANTIDAD_MANZANAS_X_CAJON;
                cajones++;
                System.out.println("Se necesitan de " + cajones + " cajones");
            }
        }

    }


}
