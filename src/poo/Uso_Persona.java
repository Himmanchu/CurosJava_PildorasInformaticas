package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
	}

}


abstract class Persona{
	
	public Persona(String nom) {
		
		nombre=nom;
		
	}
	
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
}

class Empleado2{    
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		//método constructor tiene que tener el mismo nombre que la clase a la que pertenece
	
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		
	}
	

	public double dameSueldo() {    //getter
		
		return sueldo;
	}
	
	
	public Date dameFechaContrato() {    //getter
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {    //setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
	
}