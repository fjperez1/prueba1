package exercise7;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
	System.out.println("Introduce tu nombre");
	Scanner nom = new Scanner (System.in);
	String nombre = nom.nextLine();
	System.out.println("Introduce tu dirección");
	Scanner dir = new Scanner (System.in);
	String direccion = dir.nextLine();
	System.out.println("Introduce tu teléfono");
	Scanner tel = new Scanner (System.in);
	int telefono = tel.nextInt();
	System.out.println("Nombre: " + nombre);
	System.out.println("Dirección: " + direccion);
	System.out.println("Teléfono: " + telefono);


}
}
