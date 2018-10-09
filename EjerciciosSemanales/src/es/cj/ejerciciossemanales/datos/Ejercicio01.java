package es.cj.ejerciciossemanales.datos;

import java.util.Scanner;

public class Ejercicio01 {

	//Se necesita leer un numero entero positivo y determinar si es un numero de 1,2,3 o 4 cifras
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Inserte el numero");
		int num = sc.nextInt();
		
		if (num >=1 && num <= 9999) {
			if (num <= 9) {
				System.out.println("el valor es de un digito");
			}else if(num >=10 && num <= 99) {
				System.out.println("el numero contiene dos digitos");
			}else if(num >= 100 && num <= 999) {
				System.out.println("el numero tiene tres digitos");
			}else{
				System.out.println("el numero tiene cuatro digitos");
			}
		}
			
		
	}
}
