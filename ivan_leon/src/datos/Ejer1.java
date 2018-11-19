package datos;

import java.util.Scanner;

//1. Programa que solicita tres números y realiza las siguientes acciones:
// - Muestra el valor central de los tres valores numéricos
// - Muestra si alguno de los valores es múltiplo de otro de los valores
// - Debe mostrar un mensaje diciendo si el valor central está más cerca del menor que del mayor

public class Ejer1 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	int NumMedio = 0;
	
	System.out.println(" Primer valor: ");
	int num1 = sc.nextInt();
	System.out.println(" Segundo Valor: ");
	int num2 = sc.nextInt();
	System.out.println(" Tercer Valor: ");
	int num3 = sc.nextInt();
	
	//apartado 1
	if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) 
		NumMedio = num1;
	else if(num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3)
		NumMedio= num2;
	else 
		NumMedio = num3;
	System.out.println("El valor central es el " + NumMedio + ".");
	
	//apartado 2
	if (num1 > num2) 
		if(num1%num2 == 0) System.out.println(num1 + " es multiplo de " + num2);
	if (num1 > num3)
		if(num1%num3 == 0) System.out.println(num1 + " es multiplo de " + num3);
	if (num2 > num1)
		if(num2%num1 == 0) System.out.println(num2 + " es multiplo de " + num1);
	if (num2 > num3)
		if(num2%num3 == 0) System.out.println(num2 + " es multiplo de " + num3);
	if (num3 > num1) 
		if(num3%num1 == 0) System.out.println(num3 + " es multiplo de " + num1);
	if (num3 > num2)
		if(num3%num2 == 0) System.out.println(num3 + " es multiplo de " + num2);
		
	//apartado 3
	
		int mayor;
		int menor;
		
		if (num1 > num2 && num1 > num3)
			mayor = num1;
		else if(num2 > num1 && num2 > num3)
			mayor = num2;
		else
			mayor = num3;
		
		if (num1 < num2 && num1 < num3)
			menor = num1;
		else if(num2 < num1 && num2 < num3)
			menor = num2;
		else
			menor = num3;
	
	
	if ((NumMedio - menor) < (mayor - NumMedio))
		System.out.println(" El numero " + menor + " esta mas cerca del valor " + NumMedio + " que el valor " + mayor );
	else if ((NumMedio - menor) > (mayor - NumMedio))
		System.out.println(" El numero " + mayor + " esta mas cerca del valor " + NumMedio + " que el valor " + menor );
	else
		System.out.println("Estan a la misma distancia");
	}
}
