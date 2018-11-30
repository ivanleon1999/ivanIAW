package es.cj.main;

import es.cj.clases.Libro;

public class Principal {

	public static void main(String[] args) {
		
		Libro uno = new Libro("Harry Potter", "J.K Rowling", 5, 1);
		
		System.out.println("Titulo: " + uno.getTitulo());
		System.out.println("Autor: " + uno.getAutor());
		System.out.println("Ejemplares: " + uno.getEjemplares());
		System.out.println("Prestados: " + uno.getPrestados());
		
		//metodo prestamo
		uno.Prestamo();
		
		//devolución
		uno.Devolucion();
		
		
		
	}
}
