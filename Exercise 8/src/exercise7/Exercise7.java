package exercise7;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
	System.out.println("Introduce tu edad guap@r"); /*Le preguntamos la edad al usuario*/
	int edad; /*Creamos la variable donde se va a guardar la edad del usuario*/
	Scanner sc = new Scanner (System.in);/*Leemos el caracter escrito por el usuario*/
	edad = sc.nextInt();/*Guardamos el numero escrito por el usuario en una variable*/
	edad++;/*Le sumamos 1 al valor que hemos guardado anteriormente*/
	System.out.println("El año que viene tendrás " + edad +" años "); /*Mostramos en pantalla el resultado, es decir, la edad que tendrá el usuario el próximo año*/
	
}
}
