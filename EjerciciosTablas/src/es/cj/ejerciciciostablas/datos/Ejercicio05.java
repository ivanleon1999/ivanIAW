package es.cj.ejerciciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
	
	private static Scanner sc = new Scanner(System.in);
	private static int [] numeros;
	
	
	
	public static void main(String[] args) {
		//Crear una tabla de n n�meros y desplazarla una posici�n hacia abajo, es decir, el primero pasa a ser el segundo, el segundo pasa a ser el tercero y as� sucesivamente. El �ltimo pasa a ser el primero

		int tamanyo;
		do {
			System.out.println("n� de elementos");
			tamanyo = sc.nextInt();
		} while (tamanyo <=0);
	
		numeros = new int [tamanyo];
		
		iniciar();
		
		mostrar();
		
		desplazar();
		
		mostrar();

	sc.close();
	}



	private static void desplazar() {
		int aux = numeros[numeros.length -1];
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i]=numeros[i-1];
		}
		numeros[0]=aux;
	}


	private static void mostrar() {
		System.out.println(Arrays.toString(numeros));
		
	}


	private static void iniciar() {
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50)+1;
		}
		
	}
}
