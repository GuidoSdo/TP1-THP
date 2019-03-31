package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Integer num1;
        Integer num2;
        boolean sonIguales;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor a num1");
        num1 = scan.nextInt();
        System.out.println("Ingrese el valor a num2");
        num2 = scan.nextInt();
        scan.close();

        if ( num1.equals(num2)){
            sonIguales = true;
            System.out.println("Los numeros son iguales: " + sonIguales);
        } else {
            sonIguales = false;
            System.out.println("Los numeros no son iguales: " + sonIguales);
        }

    }
}
