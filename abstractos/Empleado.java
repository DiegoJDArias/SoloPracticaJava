package abstractos;

import constructores.conthis.Fecha;

/**
 * 
 * @author Diego J D Arias.
 * 
 */
public abstract class Empleado {
	
	protected String nombre;
	protected double salario = 1500.00;
	protected Fecha fechaNacimiento;

	public abstract String getDetalles(); 

}
