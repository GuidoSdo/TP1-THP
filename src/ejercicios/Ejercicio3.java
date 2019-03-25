package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		String name;

		System.out.println("Ingrese su nombre");

		Scanner scan = new Scanner(System.in);
		name = scan.next();
		System.out.println("Bienvenido " + name);
		scan.close();
	}

}
