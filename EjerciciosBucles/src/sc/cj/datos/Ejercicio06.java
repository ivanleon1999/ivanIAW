package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio06 {

	//Dise�e una aplicaci�n que muestre las tablas de multiplicar del 1 al 10. Adem�s, solicite al usuario que tabla quiere mostrar
	private static Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero;

	for (int i = 0; i < 11; i++) {
			System.out.println(numero + " x " + i + " = " + (i*numero));
		}
		
		
		System.out.println("de que numero deseas ver la tabla");
		numero = SC.nextInt();
	
		for (int i = 0; i < 11; i++) {
			
			System.out.println(numero + " x " + i + " = " + (i*numero));
		}
		
	}
}
