package es.cj.clases;

public class Punto {

	
	//atributos
	
	private double x;
	private double y;
	
	//constructires
	
	public Punto() {
		// Tel vacio
	}

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	//get and set
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double CalcularDistanciaDesde(Punto p) {
		//n saberlo
		return Math.sqrt(Math.pow(this.x-p.getX(), 2) + Math.pow(this.y-p.getY(), 2));
	}
	
	
	
	
		
}
