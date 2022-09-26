package exercise7;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		
		/*Escribe un programa que pida al usuario su nombre y su edad y muestre por
		 * pantalla el siguiente mensaje: “Hola Juanito, tienes 21 años, ¡qué mayor
		 * eres!”. Los datos en rojo son los datos introducidos por el usuario.*/

		System.out.println("Introduce tu nombre");
		Scanner nom = new Scanner(System.in);
		String nombre = nom.nextLine();
		System.out.println("Introduce tu edad");
		Scanner ed = new Scanner(System.in);
		int edad = ed.nextInt();
		System.out.println("Hola " + nombre + ", tienes " + edad + " años ¡qué mayor eres!");

	}
}