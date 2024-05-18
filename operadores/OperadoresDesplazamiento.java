 package operadores;

public class OperadoresDesplazamiento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int d = 2423;
		int resultado = d;

		System.out.println("Decimal:" + resultado + "\t\tResultado: " + Integer.toBinaryString(resultado));
		resultado = -d;
		System.out.println("Decimal:" + resultado + "\t\tResultado: " + Integer.toBinaryString(resultado));
		resultado = d >> 6;
		System.out.println("Decimal:" + resultado + "\t\tResultado: " + Integer.toBinaryString(resultado));
		resultado = -d >> 6;
		System.out.println("Decimal:" + resultado + "\t\tResultado: " + Integer.toBinaryString(resultado));
		resultado = d >>> 6;
		System.out.println("Decimal:" + resultado + "\t\tResultado: " + Integer.toBinaryString(resultado));
		resultado = -d >>> 6;
		System.out.println("Decimal:" + resultado + "\tResultado: " + Integer.toBinaryString(resultado));
		resultado = d << 6;
		System.out.println("Decimal:" + resultado + "\t\tResultado: " + Integer.toBinaryString(resultado));
		resultado = -d << 6;
		System.out.println("Decimal:" + resultado + "\t\tResultado: " + Integer.toBinaryString(resultado));
	}

}
