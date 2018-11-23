package es.cj.clases;

public class Persona {

	//atributos
	private String Nombre;
	private int Edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	//constructores
	
	public Persona() {
		// vacio
	}

	public Persona(String nombre, int edad, String sexo) {
		super();
		Nombre = nombre;
		Edad = edad;
		this.sexo = sexo;
	
	}

	public Persona(String nombre, int edad, String dNI, String sexo, double peso, double altura) {
		super();
		Nombre = nombre;
		Edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	//get y set
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	//calcularIMC
	public static double calcularIMC(Persona Peso, Persona Altura) {
		double total = 0;
		total = Peso.getPeso()/(Altura.getAltura());
	return total;
	}
	
	
	
	
	
	
	
	
	
	
}
