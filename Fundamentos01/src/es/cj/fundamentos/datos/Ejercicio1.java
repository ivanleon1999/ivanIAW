package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ejercicio1 {
	
	//progarama qye realice la conversion de gados celcius a Farentheid
	//los grados celcios debe proporcionarlos el usuario
			
	private static Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
	System.out.println("Grados celcius:");
		double grados = SC.nextDouble();
		double farenheit = grados*1.8 * 32;
		System.out.println(grados + "grados celcius son" + farenheit + "grados farenheit");
	}
}
