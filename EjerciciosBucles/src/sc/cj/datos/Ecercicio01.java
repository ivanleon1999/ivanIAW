package sc.cj.datos;

import java.util.Scanner;

public class Ecercicio01 {
//pedir 10 numeros mostrar la media de los positivos, media de los negativos y cantidad de 0 que habia
	
	private static Scanner SC = new Scanner(System.in);
	public static void main(String[] args) {
	
	double sumapositivos = 0, sumanegativos = 0;
	int contadorpositivo = 0, contadornegativo = 0, contadorcero = 0;
	
	for (int i = 0; i < 5; i++) {
		System.out.println("numero");
		double numero =SC.nextDouble();
		
		if (numero > 0) {
			sumapositivos = sumapositivos + numero;
			contadorpositivo++;
		}else if(numero < 0) {
			sumanegativos = sumanegativos +numero;
			contadornegativo++;
		}else {
			contadorcero++;
		}
	}
	
	System.out.println("MEdia de positivos= " + sumapositivos/contadorpositivo);
	System.out.println("MEdia de negativos= " + sumanegativos/contadornegativo);
	System.out.println("cuantos 0 habia= " + contadorcero);
	


	}
}
