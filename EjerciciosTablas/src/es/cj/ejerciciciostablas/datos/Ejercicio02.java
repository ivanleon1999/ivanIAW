package es.cj.ejerciciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {
	
	private static Scanner sc = new Scanner(System.in);
	private static int [] numeros;
	
	public static void main(String[] args) {
		// Leer n números ordenados crecientemente. Pedir al usuario un número y 
		//buscarlo en la tabla. Se debe mostrar la posición en la que se encuentra. Si no está, indicarlo con un mensaje
	
		int tamanyo;
		int num;
	
		System.out.println("cauntos valores tendra");
		tamanyo = sc.nextInt();
		
		numeros = new int [tamanyo];
		
		mostar();
		
		ordenar();
		
		System.out.println("que nuero elijes");
		num= sc.nextInt();
		
		if (respuesta(num))
			System.out.println("Esta en la tabla");
		else
			System.out.println("no esta en la tabla");
	
	
	sc.close();
	}

	private static boolean respuesta(int num) {
		boolean yas = true;
		for (int i = 0; i < numeros.length; i++) {
			if (num == numeros[i])
				yas = true;
			else
				yas = false;
		}
			return yas;
	}

	private static void ordenar() {
		
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
	}

	private static void mostar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(20)+1;
		}
		System.out.println(Arrays.toString(numeros));
	}
}
