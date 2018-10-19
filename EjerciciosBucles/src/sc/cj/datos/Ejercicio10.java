package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio10 {
// Dados dos números introducidos por teclado, indique si son amigos o no. Dos números son amigos si la suma de los divisores propios de cada uno de ellos es igual al otro (la unidad se considera divisor propio, pero no lo es el mismo número)

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int primero = 0;
		int segundo = 0;
		System.out.println("solo valon valores positivos");
		
		do {
			System.out.println("Primer numero: ");
			primero = sc.nextInt();
		} while (primero < 1);
		
		do {
			System.out.println("Segundo Numero: ");
			segundo = sc.nextInt();
		} while (segundo < 1);
		
	System.out.println("numero primero = " + primero + segundo);
	
		
		
		
	}
}
