package sc.cj.datos;

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
		
	}
}
