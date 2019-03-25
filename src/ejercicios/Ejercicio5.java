package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int resultado;
		System.out.println("Ingrese numero a ser dividido");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		System.out.println("Ingrese numero que va a dividir al primero numero ingresado");
		num2 = scan.nextInt();
		scan.close();

		if (num2 > 0) {
			resultado = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + resultado);
		} else {
			System.out.println("No se puede dividir por cero.");

		}

	}

}
