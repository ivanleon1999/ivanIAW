package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio03 {
	//Aplicar las operaciones b�sicas de modificaci�n de Strings a la cadena �Uno dosuno�, a�adiendo caracteres al final, 
	//cambiando la �o� por �e� y pas�ndola a may�scula.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena = "uno dosuno";
		StringBuffer sb = new StringBuffer(cadena);
		
		System.out.println("Qque valor quieres a�adirle al final");
		String caracter = sc.next();
		cadena = cadena + caracter;

		System.out.println(cadena);
		
		System.out.println("Ahora el resto.");
		

		cadena = cadena.replace("o", "E");
		System.out.println(cadena);
		

	}
}
