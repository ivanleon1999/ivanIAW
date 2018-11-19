package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* Partimos de 2 tablas de n elementos cada uno (solicitada al usuario). Rellenarlas de 
	manera aleatoria con números entre 1 y 20. Genere una nueva tabla con los elementos repetidos en 
	las 2 tablas. Además, genere una nueva tabla con los
	elementos de la primera tabla que no se encuentran repetidos en la segunda tabla.*/

public class Ejer2 {

	private static int [] tabla1;
	private static int [] tabla2;
	private static int [] repetidos;
	//private static int [] NoRepetidos;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int cantidad;
		
		do {
			System.out.println("cantidad de numero en cada tabla (no a deser ni 0 ni menor de 0)");
			cantidad = sc.nextInt();
		} while (cantidad <=0);
		
		tabla1 = new int [cantidad];
		tabla2 = new int [cantidad];
		repetidos = new int [cantidad];
		//NoRepetidos = new int [cantidad];
		
		Rellenar();
		
		System.out.println("las tablas son las sigueintes");
		Mostrar();
		
		repetidos();
		//NoRepetidos();
		
		System.out.println("repetidos");
		MostrarRepetidos();
		
		//System.out.println("No repetidos");
		//MostrarNoRepetidos();
		
		
	}

	/*private static void NoRepetidos() {
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla2.length; j++) {
				if (tabla1[i] != tabla2[j])
					NoRepetidos[i] = tabla1[i]; 
			}
		}	
		
	}*/

/*	private static void MostrarNoRepetidos() {
		
		System.out.println(Arrays.toString(NoRepetidos));
		
	}*/

	private static void MostrarRepetidos() {
		
		System.out.println(Arrays.toString(repetidos));
		
	}
	//revisar cuando termine que no se me repita el numero no repetido
	private static void repetidos() {
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla2.length; j++) {
				if (tabla1[i] == tabla2[j])
					repetidos[i] = tabla1[i]; 
			}
		}	
	}

	private static void Mostrar() {
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
		
	}

	private static void Rellenar() {
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = new Random().nextInt(20)+1;
			tabla2[i] = new Random().nextInt(20)+1;
		}
	}
}
