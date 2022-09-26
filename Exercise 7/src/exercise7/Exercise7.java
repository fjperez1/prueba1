package exercise7;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
	System.out.println("Introduce un numero"); /*Le pedimos un numero al usuario */
	int numero; /*Declaramos la variable donde vamos a guardar el numero introducido por el usuario*/
	Scanner sc = new Scanner (System.in); /*Creamos el objeto Scanner para poder leer el numero introducido por el usuario*/
	numero = sc.nextInt(); /*Guardo en la variable el numero introducido por el usuario*/
	System.out.println("Has escrito el numero " + numero); /*Mostramos en consola el valor guardado en la variable numero*/
	
}
}
