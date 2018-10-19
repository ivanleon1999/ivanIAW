package sc.cj.datos;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Introduce las horas que has trabajado");
	int sal = sc.nextInt();

	if (sal <= 40) {
		System.out.println("La suma de su salaro semanala es de= " + (sal * 16));
	}else {
		int extras = (sal - 40);
		int normal = (40 * 16);
		int total = (extras * 20) + normal;
		System.out.println("su salario semanal es de= " + total);
		
	}
	
	}
	
}