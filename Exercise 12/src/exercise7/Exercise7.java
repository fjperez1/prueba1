package exercise7;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
	System.out.println("Introduce el primer numero");
	Scanner n1 = new Scanner (System.in);
	double numero1 = n1.nextDouble();
	System.out.println("Introduce el segundo numero");
	Scanner n2 = new Scanner (System.in);
	double numero2 = n2.nextDouble();
	System.out.println("La suma de los números es " + (numero1+numero2));
	System.out.println("La resta de los números es " + (numero1-numero2));
	System.out.println("La multiplicación de los números es " + (numero1*numero2));
	System.out.println("La división de los números es " + (numero1/numero2));

}
}
