package operadores;

/**
 * 
 * @author Diego J D Arias
 * 
 */
public class OperadorTernario {

	public static void main(String[] args) {
		int a = 4, b = 5, c = 6, d = 0;
		d = a > b ? c : b;
		System.out.println("Valor de d: " + d); // 5
		d = a < b ? c : b;
		System.out.println("Valor de d: " + d); // 6
		d = a < b ? c : ++b;
		System.out.println("Valor de b---: " + b); // 5
		System.out.println("Valor de d: " + d); // 6
		d = a < b ? c : b--;
		System.out.println("Valor de d: " + d); // 6
		System.out.println("Valor de b---: " + b); // 5
	}
}
