package datos;

import java.util.Arrays;
import java.util.Random;

//Rellena una tabla de 15 números. Muestra la tabla. 
//Muestra el mayor, el menor y las posiciones en las que se encuentran

public class Ejer3 {

	private static int [] tabla;
	public static void main(String[] args) {
		
		tabla = new int [15];
		
		rellenar();
		
		mostar();
		int mayor = NumMayor();
		System.out.println("El numero mayor es el " + NumMayor());
		System.out.println("Y la primera posicion en el que sale es la " + posicion(mayor));
		
		System.out.println("El numero menor es el " + NumMenor(mayor));
		int menor = NumMenor(mayor);
		System.out.println("Y la primera posicion en el que sale es la " + posicionmenor(menor));
		
		
	}
	
	private static int posicionmenor(int menor) {
		int valor = -1;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == menor) {
				valor = i;
				return valor;}
		}
		return valor;
	}
	
	private static int NumMenor(int mayor) {
		int valor = mayor;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] < valor) {
				valor = tabla[i];
			}
		}
		return valor;
		
	}
	private static int posicion(int mayor) {
		int valor = -1;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == mayor) {
				valor = i;
				return valor;}
		}
		return valor;
	}
	
	private static int NumMayor() {
		
		int mayor = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > mayor) {
				mayor = tabla[i];
			}
		}
		return mayor;
		
	}
	private static void mostar() {
		System.out.println(Arrays.toString(tabla));
		
	}
	private static void rellenar() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(20)+1;
		}
		
	}
}
