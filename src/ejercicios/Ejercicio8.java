package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        String persona1 = "";
        int aportePersona1 = 0;
        int capitalTotal = 0;
        int aux1;
        int aportantes = 0;
        int CANTIDAD_MAX_APORTANTES = 3;


        Scanner scan = new Scanner(System.in);

        while (aportantes < CANTIDAD_MAX_APORTANTES) {
            System.out.println("Ingrese nombre del aportante");
            persona1 = scan.next();
            System.out.println("Ingrese el capital aportado");
            aportePersona1 = scan.nextInt();

            capitalTotal = +aportePersona1;
            aportantes++;

        }

        aux1 = (aportePersona1 * 100) / capitalTotal;
        System.out.println("Nombre: " + persona1 + ", Capital aportado: " + aportePersona1 + ", Porcentaje del capital: %" + aux1);


    }






}
