package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio06 {

	//Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10. Además, solicite al usuario que tabla quiere mostrar
	private static Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		for (int i = 1; i < 11; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 1; j < 11; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		
		System.out.println("de que numero deseas ver la tabla");
		numero = SC.nextInt();
	
		for (int i = 0; i < 11; i++) {
			
			System.out.println(numero + " x " + i + " = " + (i*numero));
		}
		
	}
}
