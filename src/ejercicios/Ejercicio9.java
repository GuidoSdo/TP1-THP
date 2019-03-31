package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        int numeroIngresado;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero de la semana entre 1 y 7 inclusive");
        numeroIngresado = scan.nextInt();
        scan.close();

        switch (numeroIngresado) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("El dia ingresado no es valido");
                break;
        }
    }
}
