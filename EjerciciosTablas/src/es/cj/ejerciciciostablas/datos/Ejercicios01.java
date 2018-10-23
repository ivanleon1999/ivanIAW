package es.cj.ejerciciciostablas.datos;

import java.util.Scanner;

public class Ejercicios01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Leer n números enteros, guardarlos en la tabla y mostrar la media de los
		// positivos, media negativos y el número de ceros

		
		
		System.out.println("que cantidad de numero desear analiar: ");
		int cantidad = sc.nextInt();
		int[] tabla = new int[cantidad];
		int contadorpositivos = 0;
		int sumapo = 0;
		int contadornegativos = 0;
		int sumane = 0;
		int contadordeceros = 0;

			int negativos;
			int positivos;
		

		for (int i = 0; i < cantidad; i++) {
			System.out.println("insertar numero:");
			tabla[i] = sc.nextInt();
	
			if (tabla[i] < 0) {
				sumane = sumane + tabla[i];
				contadornegativos++;}
			else if (tabla[i] > 0) {
				sumapo = sumapo + tabla[i];
				contadorpositivos++;
			}else
				contadordeceros++;
		}

		if (contadornegativos==0) {
			negativos = 0;	
		}else
			negativos = (sumane/contadornegativos);
		
		if(contadorpositivos == 0) {
			positivos = 0;
		}else 
			positivos = sumapo/contadorpositivos;
	
		
		
		
		System.out.println("positivos: " + positivos  + ", " + "negativos: " + negativos + ", " + " y hay "
				+ contadordeceros + " ceros.");
	}
}
