package operadores;

/**
 * 
 * @author Diego J D Arias
 * 
 */
public class OperadoresBinarios {

	public static void main(String[] args) {
		
		int a = 4, b = 5, c = 6, d = 0;
		d <<= c;
		System.out.println(d);
		d = a + b * c;
		System.out.println("Valor de d: " + d);
		System.out.println("-----------");
		d += a;
		System.out.println("Valor de d: " + d);
		System.out.println("-----------");
		d -= b * c;
		System.out.println("Valor de d: " + d);
		System.out.println("-----------");
		d %= c;
		System.out.println("Valor de d: " + d);
		System.out.println("-----------");
		d <<= c;
		System.out.println("Valor de d: " + d);
		System.out.println("Valor de c: " + c);
		System.out.println("-----------");
		d >>= c++;	
		System.out.println("Valor de d: " + d);
		System.out.println("Valor de c: " + c);
		
			
	}

}
