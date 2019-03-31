package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numeroIngresado;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un valor entero mayor que cero");
        numeroIngresado = scan.nextInt();
        scan.close();

        if(numeroIngresado > 0) {

            if((numeroIngresado%2) == 0){
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        } else {
            System.out.println("Ingrese un numero mayor a 0");
        }

    }
}
