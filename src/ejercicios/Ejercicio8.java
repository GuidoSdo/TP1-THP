package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        String persona1;
        String persona2;
        String persona3;
        float aportePersona1;
        float aportePersona2;
        float aportePersona3;
        double capitalTotal;



        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese nombre del aportante");
        persona1 = scan.next();
        System.out.println("Ingrese el capital aportado");
        aportePersona1 = scan.nextInt();
        System.out.println("Ingrese nombre del aportante");
        persona2 = scan.next();
        System.out.println("Ingrese el capital aportado");
        aportePersona2 = scan.nextInt();
        System.out.println("Ingrese nombre del aportante");
        persona3 = scan.next();
        System.out.println("Ingrese el capital aportado");
        aportePersona3 = scan.nextInt();
        scan.close();

        capitalTotal = aportePersona1 + aportePersona2 + aportePersona3;

        System.out.println("Nombre: " + persona1 + ", Capital aportado: $" + aportePersona1 + ", Porcentaje del capital %" + (aportePersona1*100)/capitalTotal);
        System.out.println("Nombre: " + persona2 + ", Capital aportado: $" + aportePersona2 + ", Porcentaje del capital %" + (aportePersona2*100)/capitalTotal);
        System.out.println("Nombre: " + persona3 + ", Capital aportado: $" + aportePersona3 + ", Porcentaje del capital %" + (aportePersona3*100)/capitalTotal);
        System.out.println("Monto total aportado: $" + capitalTotal);


}






}
