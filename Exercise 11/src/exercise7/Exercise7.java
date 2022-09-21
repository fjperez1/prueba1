package exercise7;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
	System.out.println("Introduce el radio de la circunferencia");
	Scanner rd = new Scanner (System.in);
	double radio = rd.nextDouble();
	double longitud = Math.PI * radio;
	double area = Math.pow(radio,2) * Math.PI;
	System.out.println("La longitud de la circunferencia es " + longitud + "Y su área es " + area);

}
}
