package exercise7;

import java.util.Scanner;
import java.util.Locale;

public class Exercise7 {
	public static void main(String[] args) {

			// Inicializamos las variables
		
			final int IVA = 21;
			double precioIntroducido;
			double precioConIVA;
			Scanner lectura = new Scanner(System.in);
			lectura.useLocale(Locale.US);

			// Empezamos a crear las instrucciones
			// Solicitamos al usuario un precio
			System.out.print("Introduzca un precio: ");
			precioIntroducido = lectura.nextDouble();

			// Calculamos el precio final con IVA
			precioConIVA = precioIntroducido * IVA /100 + precioIntroducido;

			// Mostramos el resultado obtenido por pantalla
			System.out.println("El precio con IVA es: " + precioConIVA);

		}

	}