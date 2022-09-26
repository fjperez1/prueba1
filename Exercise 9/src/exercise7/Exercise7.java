package exercise7;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
	int actual;
	int nacimiento;
	int edad;
	Scanner leer = new Scanner(System.in);
	System.out.println("Introduce el año actual");
	actual = leer.nextInt();
	System.out.println("Introduce tu año de nacimiento");
	nacimiento = leer.nextInt();
	edad = actual - nacimiento;
	System.out.println("Tienes " + edad + " años");

}
}
