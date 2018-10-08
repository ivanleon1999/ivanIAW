package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio07 {
//pedir nota del 0 al 10 y mostrar si está insuficiente, bien, notable y sobresaliente
	private static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Nota= ");
		double nota = SC.nextInt();
		 
		if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		}else if (nota >=6 && nota < 7) {
			System.out.println("Bien");
		}else if(nota >=7 && nota <9) {
			System.out.println("Notable");
		}else if(nota >= 9 && nota <= 10){
			System.out.println("Sobresaliente");
		}else {
			System.out.println("insuficioente"); 
		}
	}
}

