package test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        String a;
        String b;
        String aux;

        System.out.println("ingrese valor A");
        Scanner scan = new Scanner(System.in);
        a = scan.next();
        System.out.println("ingrese valor B");
        b = scan.next();

        System.out.println("A: " + a + " " +  " B: " + b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("CAMBIO - A: " + a + " " + "B: " + b);
    }
}
