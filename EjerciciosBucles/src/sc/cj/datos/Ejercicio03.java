package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio03 {
	
	private static Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Programa que muestre y calcule el producto de los n primeros números impares dentro de un numero (ejemplo: pone el 5, que multiplique lso 5 primeros numeros impares, en nuestro caso seria 1, 3, 5, 7, 9)
		
		int cantidad = 0, contadorimpar = 1;
		
		System.out.println("introduzca un valor");
		cantidad = SC.nextInt();
		for (int i = 0; i <= cantidad; i++) {
			int uno = (i % 2);
			if (uno != 0) {
				contadorimpar = i * contadorimpar;
				uno = 0;
			}
		}
		System.out.println(contadorimpar);
	}
}