package sc.cj.datos;

import java.util.Arrays;

public class ClaseExpliación {

	public static void main(String[] args) {
		
		String cadena1 = "Hola";
		String cadena2 = "Hola";
		//no se compara con el == sino con el .equal
		if(cadena1.equals(cadena2)) {
			
			System.out.println("igulaes");
		}else
			System.out.println("Distintas");
		
		//equalsIgnoreCase = se la suda si es mayusculas o minusculas
		
		
		
		//concatenar
		System.out.println(cadena1.concat(cadena2));
		//
		if (cadena1.contains("la")){
			System.out.println("lo tiene");
		}
		//
		System.out.println(cadena1.indexOf("a"));
		//
		if (cadena1.equals("") || cadena1.length()==0 || cadena1.isEmpty())
		System.out.println("cadena vacia");
		
		//remplazar
		cadena1 = cadena1.replace("h", "p");
		System.out.println(cadena1);
		//contrar de a de
		System.out.println(cadena1.substring(0, 3));
		
		//
		char[] letras = cadena1.toCharArray();
		System.out.println(Arrays.toString(letras));
		
		
		//para qitar los espacios
		String usuario = "javiyo";
		usuario = usuario.trim();
		System.out.println(usuario);
	
		//convertir en buffer cadena modificable 
		 StringBuffer sb = new StringBuffer(cadena1);
		//para añadir cosas en la cadena al final por elñ apend
		sb.append("adios");
		System.out.println(sb.toString());
		
		sb.insert(0, "inicio");
		System.out.println(sb.toString());
		//borrar caracter
		sb.deleteCharAt(3);
		//sustituir
		sb.replace(0, 3, "avion");
		//darle la vuelta
		sb.reverse();
		
		String frase = "hola que tal estas";
		//dibidir la frase palabra a palabra
		String [] palabras = frase.split(" ");
		//lo meto en la tabla para que la podamos tener
		
		//para quitarle las comas y que me lo lea
		String [] numeros = palabras[4].split(";");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	
	
	
	
	
	
	}
}
