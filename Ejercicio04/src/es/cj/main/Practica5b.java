package es.cj.main;

import es.cj.clases.Alumno;
import es.cj.clases.Asignatura;
import es.cj.clases.Profesor;

public class Practica5b {
	public static void main(String[] args) {
		Asignatura aiw = new Asignatura(1234);
		Asignatura sgbd = new Asignatura(5678);
		Asignatura aso = new Asignatura(2244);
		
		
		Alumno yo = new Alumno(aiw, sgbd, aso);
		
		//Profesor prof = new Profesor();
		
		
		Profesor.ponerNotas(yo);
		
		System.out.println("Media: " + Profesor.calcularLaMediaDeUnAlumno(yo));
		
	}
}
