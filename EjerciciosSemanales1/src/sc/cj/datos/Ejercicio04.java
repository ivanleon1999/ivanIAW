package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio04 {
	
	//Escriba un programa que lea un número entero por el teclado y muestre en la pantalla si es un número abundante. Un número es abundante si la suma de sus divisores es mayor que él. Ejemplo: 12 es abundante ya que sus divisores son 1, 2, 3, 4 y 6 cuya suma es 16 que es mayor que 12.
	//corregir
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int numero = 0;
		
		System.out.println("inserta un numero que sea solo positivo");
		do {
			System.out.println("Insertar numero positivo: ");
			numero = sc.nextInt();
		} while (numero < 1);
		
		int abundante = comprobar(numero);
		
		if (abundante == 1)
			System.out.println("Es abundante");
		else
			System.out.println("no es abundante");
	}

	private static int comprobar(int num) {
		
		int si = 0;
		int sum = 0;
		
		for (int i = 1; i < num; i++) {
			if (i%num==0)
				sum = sum + i;
		}

		if 	(sum > num)
			si = 1;
		else
			si = 0;
		
		return si;
		
	}	
}



