package sc.cj.datos;

import java.util.Scanner;

public class Explicaci�n {
	
 private static Scanner SC = new Scanner(System.in);
 
	public static void main(String[] args) {
		
		//do while
		int numero = 0;
		/*
		do {
			System.out.println("n�");
			numero = SC.nextInt();
		} while (numero < 0);
		*/
		//while
		/*
		while(numero >= 0) {
			System.out.println(numero);
			numero = numero - 1;
		}
		*/
		//for
		numero = SC.nextInt();
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
	
	SC.close();
	}
	
}
