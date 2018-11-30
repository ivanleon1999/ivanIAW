package es.cj.clases;

public class Libro {

	// atributos

	private String titulo;
	private String autor;
	
	private int prestados;
	private int Ejemplares;

	// constructores

	public Libro() {
		// por defecto
	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.Ejemplares = ejemplares;
		this.prestados = prestados;
	}

	// getters and setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return Ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.Ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	// metodos
	//prestamo
	public String Prestamo() {
		String si = "";
		if (this.Ejemplares > this.prestados) { 
			 si = "True";
			 this.prestados = this.prestados + 1;
		}else
			si = "False";
			
		return si;
	}
	//devolucion
	public String Devolucion() {
		this.prestados = this.prestados - 1 ;
			 
		return "";
	}
	
	
	//tostring
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", prestados=" + prestados + ", Ejemplares="
				+ Ejemplares + "]";
	}
	
	
	
	
	
}
