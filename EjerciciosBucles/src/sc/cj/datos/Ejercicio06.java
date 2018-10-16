package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio06 {

	//Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10. Además, solicite al usuario que tabla quiere mostrar
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
