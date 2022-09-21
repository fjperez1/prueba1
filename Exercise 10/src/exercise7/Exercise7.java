package exercise7;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
	System.out.println("Introduce la nota nº1");
	Scanner n1 = new Scanner (System.in);
	double numero1 = n1.nextDouble();
	System.out.println("Introduce la nota nº2");
	Scanner n2 = new Scanner (System.in);
	double numero2 = n2.nextDouble();
	double resultado = (numero1 + numero2)/2;
	System.out.println("La media aritmética de las dos notas es " + resultado);

}
}
