package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio05 {
	//Pedir un número y calcular su factorial
	
	private static Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero = 0, contador = 1;
		
		System.out.println("de que umero quieres que hagamos el factorial?");
		numero = SC.nextInt();
		
		for (int i = numero; i > 0; i--) {
			contador= i * contador;
		}
		System.out.println(contador);
	}
}
