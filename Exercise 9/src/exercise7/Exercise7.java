package exercise7;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
	System.out.println("Introduce el año actual");
	Scanner sc = new Scanner (System.in);
	double numero = sc.nextDouble();
	System.out.println("Introduce tu año de nacimiento");
	Scanner nc = new Scanner (System.in);
	double nacido = nc.nextDouble();
	double resultado = numero - nacido;
	System.out.println("Tienes " + resultado + " años");

}
}
