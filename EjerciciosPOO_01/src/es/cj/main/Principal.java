package es.cj.main;

import es.cj.clases.CUENTA_OPERACIONES;
import es.cj.clases.Cuenta;

public class Principal {
	
	
	public static void main(String[] args) {
	
		Cuenta C1 = new Cuenta();
		Cuenta C2 = new Cuenta("Yo", "6846168", 6844, 2.1);
				
		C1.setNombre("Tu");
		
		CUENTA_OPERACIONES CO = new CUENTA_OPERACIONES();
		
		CO.Ingresar(100, C1);
		
		CO.reintegro(50, C2);
		
		System.out.println(C1);
		System.out.println(C2);
	}
}
