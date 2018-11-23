package es.cj.clases;

public class Circulo {

	//atributo
	private double radio;
	private Punto centro;
	
	//construcotre
	
	public Circulo() {
		// Vacio
	}

	public Circulo(double radio, Punto centro) {
		super();
		this.radio = radio;
		this.centro = centro;
	}
	
	//get y set
	
	public Circulo(double radio, double x, double y) {
		this.centro = new Punto(x, y);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	
	public double calcularDistanciaDesde(Punto p) {
		return centro.CalcularDistanciaDesde(p);
	}
	
	
	
	
}
