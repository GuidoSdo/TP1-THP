package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		int num1;
		int num2;

		System.out.println("Ingrese un numero");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		System.out.println("Ingrese un segundo numero");
		num2 = scan.nextInt();

		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1 + num2));

		scan.close();

	}
}
