package exercise7;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {

		/*Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te
		 * introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado
		 * de la conversión.*/
		
		//Inicializamos las variables
		float valorPesetas;
		float valorEuros;
		
		//Pedimos en valor en pesetas al usuario

		System.out.println("Introduce el valor en pesetas");
		Scanner valor = new Scanner(System.in);
		valorPesetas = valor.nextFloat();
		
		//Hacemos la conversión, añadimos una f al final para indicar que reduzca el numero de decimales
		
		valorEuros = valorPesetas/166.386f;
		
		//Mostramos el resultado al usuario
		
		System.out.println("La cantidad que has introducido es igual a " + valorEuros +" euros");

	}
}
