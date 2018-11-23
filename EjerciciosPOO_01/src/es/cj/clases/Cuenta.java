package es.cj.clases;

public class Cuenta {

	//atributos
	private String nombre;
	private String ccc;
	private double saldo;
	private double TipoDeInteres;
	
	//constructores
	public Cuenta() {
		//el vacio
	}

	public Cuenta(String nombre, String ccc, double saldo, double tipoDeInteres) {
		super();
		this.nombre = nombre;
		this.ccc = ccc;
		this.saldo = saldo;
		TipoDeInteres = tipoDeInteres;
	}

	//GET y SET
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoDeInteres() {
		return TipoDeInteres;
	}

	public void setTipoDeInteres(double tipoDeInteres) {
		TipoDeInteres = tipoDeInteres;
	}
	
	//to String
	
	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", ccc=" + ccc + ", saldo=" + saldo + ", TipoDeInteres=" + TipoDeInteres
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
