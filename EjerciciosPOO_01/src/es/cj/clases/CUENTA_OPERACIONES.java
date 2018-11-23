package es.cj.clases;

public class CUENTA_OPERACIONES {
	
	public static void Ingresar(double cantidad, Cuenta c) {
		
	if (cantidad > 0) {
		c.setSaldo(c.getSaldo() + cantidad);
	}
	}
	
	
	
	public static void reintegro(double cantidad, Cuenta c) {
		if (cantidad <= c.getSaldo() && cantidad > 0) {
		c.setSaldo(c.getSaldo() - cantidad);
		}
	}
}
