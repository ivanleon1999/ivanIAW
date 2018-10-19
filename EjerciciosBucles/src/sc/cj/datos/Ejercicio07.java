package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio07 {
	//Pida un número al usuario e indique cuántos números primos hay entre 1 y el número
	
	private static Scanner sc = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
	int contador = 0, numero=0;
	
	System.out.println("Numero");
	numero = sc.nextInt();
	
		for (int i = 1; i < numero; i++) {
			if (i == 2 || i == 3) {
				contador++;
			}else if((i % 2) != 0 || (i % 3) != 0 ) {
				contador++;
			}else {
			}
		}	
		System.out.println("hay " + contador + " numeros primos");		
		
		
		
	}
	
}
