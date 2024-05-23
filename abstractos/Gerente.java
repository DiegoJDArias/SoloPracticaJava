package abstractos;
/**
 * 
 * @author Diego J D Arias
 *
 */
class Gerente extends Empleado {
	
	private String departamento;

	public String getDetalles() {
		
		return "Nombre: " + nombre + "\nSalario: " + salario;
	}
}

