package es.cj.main;

import java.util.Scanner;

import es.cj.clases.Persona;

public class Principal {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Persona peso = new Persona();
		Persona altura = new Persona();
		
		double pesio = 0;
		do {
		System.out.println("Cuanto pesa?");
		pesio = sc.nextDouble();
		} while ( pesio <= 0);
		
		peso.setPeso(pesio);
		
		double altur = 0;
		do {
		System.out.println("Cuanto mide?");
		altur = sc.nextDouble();
		} while ( altur <= 0);
		altura.setAltura(altur);
		
		//seguir con calcularIMC


sc.close();
				
	}
}
