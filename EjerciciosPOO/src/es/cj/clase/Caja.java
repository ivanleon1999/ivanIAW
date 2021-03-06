package es.cj.clase;

public class Caja {

	// atributos siempre privados

	private double ancho;
	private double alto;
	private double largo;

	// constructures

	public Caja() {
		// siempre ponerlo
	}

	public Caja(double ancho, double alto, double largo) {
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}

	// GET y SET

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	// metodos

	public double obtenerVolumen() {
		return ancho * alto * largo;

	}

	public double obtenerVolumen(double valor) {
		return ancho * alto * valor * largo;

	}

//	control+shift+7 comenta automaticamente
	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "]";
	}
// metoodo comparador
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(alto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ancho);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(largo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caja other = (Caja) obj;
		if (Double.doubleToLongBits(alto) != Double.doubleToLongBits(other.alto))
			return false;
		if (Double.doubleToLongBits(ancho) != Double.doubleToLongBits(other.ancho))
			return false;
		if (Double.doubleToLongBits(largo) != Double.doubleToLongBits(other.largo))
			return false;
		return true;
	}

	

}
