package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio09 {

	// Pedir al usuario día, mes y año y decir cual seria el dia siguiente
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Día: ");
		int dia = sc.nextInt();

		System.out.println("Mes: ");
		int mes = sc.nextInt();

		System.out.println("Año: ");
		int anyo = sc.nextInt();

		boolean fechaCorrecta = false;
	
		if (anyo >= 0) {
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
					if (dia >= 1 && dia <= 30)
						fechaCorrecta = true;
					break;
				default:
					break;
				}
			}
		}
	
		if (fechaCorrecta) {
			int NuevoDia = dia + 1;
			if(NuevoDia == 31) {
			dia = 1;
				if (mes == 12) {
					mes = 1;
					anyo = anyo + 1;
				}else {
					mes = mes + 1;
				
				}
				System.out.println("la fecha nueva es: " + dia + "/" + mes + "/" + anyo);
			}else {
				System.out.println("la fecha nueva es: " + (dia + 1) + "/" + mes + "/" + anyo);
				  }
		}else {
				
			System.out.println("Fecha incorrecta: " + dia + "/" + mes + "/" + anyo);
			System.out.println("Fecha incorrecta: cambiala, que seguro que te has equivocado sin querer");
			}
			sc.close();
	
	}
}