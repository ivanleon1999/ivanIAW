package es.cj.clases;

public class Asignatura {

	//atributos
	private int identificador;
	private double calificacion;

	
	//constructor
		public Asignatura(int identificador) {
		super();
		this.identificador = identificador;
		}

    //getters and setters
		
		public double getCalificacion() {
			return calificacion;
		}


		public void setCalificacion(double calificacion) {
			this.calificacion = calificacion;
		}


		public int getIdentificador() {
			return identificador;
		}
	//to string
		@Override
		public String toString() {
			return "Asignatura [identificador=" + identificador + ", calificacion=" + calificacion + "]";
		}
		
		
	
		
		
	
	
	
	
}
