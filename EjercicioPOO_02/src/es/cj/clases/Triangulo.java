package es.cj.clases;

public class Triangulo {

	//atributos
	
	private Punto p1;
	private Punto p2;
	private Punto p3;
	
	//constructore
	
	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public Triangulo(Punto p1, Punto p2, Punto p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.p1 = new Punto(x1, y1);
		this.p2 = new Punto(x2, y2);
		this.p3 = new Punto(x3, y3);
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public Punto getP3() {
		return p3;
	}

	public void setP3(Punto p3) {
		this.p3 = p3;
	}
	
	//metodos
	
	public double calcularArea() {
		double base = p1.CalcularDistanciaDesde(p2);
		double altura = p2.CalcularDistanciaDesde(p3);
		
	return (base*altura)/2;
	}
	
	public double calcularPerimetro() {
		return p1.CalcularDistanciaDesde(p2) + p2.CalcularDistanciaDesde(p3) + p3.CalcularDistanciaDesde(p1);
	}
}