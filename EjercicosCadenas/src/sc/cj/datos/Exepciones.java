package sc.cj.datos;

public class Exepciones {
	public static void main(String[] args) {
		
		try {
			int valor = 100/0;
			System.out.println(valor);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
