package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio04 {
	//Escribir un programa que lea un número desde el teclado y realice la suma de los 100 números siguientes, mostrando el resultado en pantalla
	
	private static Scanner SC = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero = 0, contador = 0;
		System.out.println("Numero");
		numero = SC.nextInt();
		int valor = numero + 100;
		for (int i = numero; i <= valor; i++) {
			contador = i + contador;
		}
		System.out.println("La suma es= " + contador);
	}
}
