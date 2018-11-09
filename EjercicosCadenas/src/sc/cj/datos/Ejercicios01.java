package sc.cj.datos;

public class Ejercicios01 {
	//Muestra el string en Mayúsculas. Muestra el string en Minúsculas. Mostrar los 2 primeros caracteres y los 2 últimos. Número de veces que aparece el último carácter. Reemplazar todas las veces que se repite el primer carácter por el primer
	
	
	
	
	
	public static void main(String[] args) {
		String palabra = "CIUdcnDjcRciN";
		
		//MAYUSCULAS
		System.out.println(palabra.toUpperCase());
	
		//Minusculas
		System.out.println(palabra.toLowerCase());
	
		//mostras los 2 primeros caracteres y los dos ultimos
		if (palabra.length() >= 2) {
		System.out.println(palabra.substring(0, 2));
		System.out.println(palabra.substring(palabra.length()-2, palabra.length()));
		}
		
		//veces que se repite el ultimo caracter
		
		String ultimo = palabra.substring(palabra.length()-1);
		System.out.println(ultimo);
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.substring(i, i+1).equalsIgnoreCase(ultimo))
				contador ++;
		}
		
		System.out.println(contador);
		
		//remplazar todas las veces del primer caracter por el primer caracter en mayuscula(tods las c en mayusculas)
		String primero = palabra.substring(0, 1);
		palabra = palabra.replaceAll(primero.toLowerCase(), primero.toUpperCase());
		
		System.out.println(palabra);
		
		
		//Añadir por e principio y por el final la cadena "***"
		
		StringBuffer sb = new StringBuffer(palabra);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
		
				
				
	
		
		
		
		
		
		
	}
}
