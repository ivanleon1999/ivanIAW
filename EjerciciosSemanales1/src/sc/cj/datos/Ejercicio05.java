package sc.cj.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
	
	
	private static Scanner sc = new Scanner(System.in);
	private static int [] numeros;
	
	public static void main(String[] args) {
		
		int num;
		numeros = new int [20];
		aleatorio();
		
		do {
			System.out.println("Deme un numero");
			num = sc.nextInt();
			
			System.out.println("El numero se repite " + repetir(num));
			System.out.println("Y la primera vez que sale en la posicion" + posicion(num));
			
		} while (num != 0);
		System.out.println("ya estaria");
		
		sc.close();
	}
	
	private static int posicion(int num) {
		int valor = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				valor = i;
				return valor;
			}
		}
		return valor;
	}
	private static int repetir(int num) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) 
				contador++;
			
		}
		return contador;
		
	}
	private static void aleatorio() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= new Random().nextInt(30);
		}
		System.out.println("L tabla es" + Arrays.toString(numeros));
	}	
	
	
	
}
