package exercise7;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {

		/*Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te
		 * introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado
		 * de la conversión.*/

		System.out.println("Introduce tu nombre");
		Scanner nom = new Scanner(System.in);
		String nombre = nom.nextLine();
		System.out.println("Introduce tu edad");
		Scanner ed = new Scanner(System.in);
		int edad = ed.nextInt();
		System.out.println("Hola " + nombre + ", tienes " + edad + " años ¡qué mayor eres!");

	}
}