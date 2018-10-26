package es.cj.ejerciciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros;
	private static int [] pares;
	private static int [] impares;
	
	
	public static void main(String[] args) {
	
		//Leer tabla de n números y guardar en otra tabla los pares y en otra tabla los impares
		
		int tamanyo;
		
		do {
			System.out.println("numero de elementos");
			tamanyo = sc.nextInt();
		} while (tamanyo <=0);
		
		numeros = new int [tamanyo];
		pares = new int [tamanyo];
		impares = new int [tamanyo];
		
		
		inicializartablanumeros();
		
		dividirparesimpares();
		
		mostrarresultados();

		/*para quitar los ceros
		for (int i = 0; i < pares.length && pares[i]!= 0; i++) {
			System.out.println(pares[i] + " ");
		}
		*/

		sc.close();
	}


	private static void mostrarresultados() {
		System.out.println("tabla " + Arrays.toString(numeros));
		System.out.println("pares " + Arrays.toString(pares));
		System.out.println("impares " + Arrays.toString(impares));
			
				
	}


	private static void inicializartablanumeros() {
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= new Random().nextInt(50)+1;
		}
	}


	private static void dividirparesimpares() {
		
		int contadorpares = 0, contadorimpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2 == 0) {
				pares[contadorpares] = numeros[i];
				contadorpares++;
			}else {
				impares[contadorimpares] = numeros[i];
				contadorimpares++;
			}
		}
	}



}
