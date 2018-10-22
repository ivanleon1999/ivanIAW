package es.cj.ejerciciciostablas.datos;

import java.util.Arrays;
import java.util.Random;

public class Explicacion {
	
	public static void main(String[] args) {
		
		//int tabla[][] = new int[10][6];
	//primero es fila y despues columna (se empieza en 0)
		//tabla[2][1] = 3;
		//iniciaializar la tabla convalores ya en ella
		//int tabla2 [] = {1,2,3};
		//visualzar la tabla
		
		
	
	/*	for (int i = 0; i < tabla2.length; i++) {
			tabla2[i]= tabla2[i] * tabla2[i];
		}*/
	
	/*	for (int i = 0; i < tabla2.length; i++) {
			System.out.print(tabla2[i] + " ");
		}*/
	
	
		/*String cadena [] = {"hola ", " que "," tal"}; 
	
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i] + " ");*/
		//}
	//mostrar 100 numeros ramdom //pero mira las columna que tiene, tiene 6, pro eso ponemos el tabla[i]
		
	/*for (int i = 0; i < tabla.length; i++) {
		for (int j = 0; j < tabla[i].length; j++) {
			tabla[i][j] = new Random().nextInt(100);
		}
	}
	for (int i = 0; i < tabla.length; i++) {
		for (int j = 0; j < tabla[i].length; j++) {
			System.out.print(tabla[i][j] + " ");
		}
		System.out.println();
	}*/
	
	//int tabla3[][] = {{1,2,3}, {4,5}, {6,7,8,9}};
	/*for (int i = 0; i < tabla3.length; i++) {
		for (int j = 0; j < tabla3[i].length; j++) {
			System.out.print(tabla3[i][j] + " ");
		}
		System.out.println();*/
	
		
		int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10);
		}
		//rellenar de randoms
		System.out.println(Arrays.toString(numeros));
	
		//ordenar
		Arrays.sort(numeros);
	
		//que me diga la posicion
		System.out.println("el 6 se encuentra en a posicion " + Arrays.binarySearch(numeros, 6));
	
	
		//rellenar con 99
		Arrays.fill(numeros, 99);
	
		System.out.println(Arrays.toString(numeros));
	 
		
		int [] auxiliar = Arrays.copyOfRange(numeros, 0, 5);
		System.out.println(Arrays.toString(auxiliar));
	
		
		
		
}		
}


