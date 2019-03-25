package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        System.out.println("Ingrese primer numero");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = scan.nextInt();
        System.out.println("Ingrese tercer numero");
        num3 = scan.nextInt();
        scan.close();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor numero es num1");
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println("El mayor numero es num2");
            } else {

                if (num3 > num1 && num3 > num2) {
                    System.out.println("El mayor numero es num3");
                } else {
                    System.out.println("Los numeros son iguales");

                }
            }
        }


    }
}


