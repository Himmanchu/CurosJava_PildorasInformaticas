package poo;

import java.util.*;

public class Uso_Empleado {   //clase principal

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Empleado empleado1=new Empleado("Paco Pérez", 85000, 1990, 12, 17);   //objeto instancia
		
		Empleado empleado2=new Empleado("Ana López", 95000, 1995, 6, 2);
		
		Empleado empleado3=new Empleado("María Martín", 105000, 2002, 3, 15);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);

		empleado3.subeSueldo(5);
		
		System.out.println("Nombre :" + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
		+ " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		+ " Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		+ " Fecha de Alta: " + empleado3.dameFechaContrato());*/
		
		
	Empleado[]  misEmpleados=new Empleado[4];
	
	misEmpleados[0]=new Empleado("Paco Pérez", 85000, 1990, 12, 17);
	
	misEmpleados[1]=new Empleado("Ana López", 95000, 1995, 6, 2);
	
	misEmpleados[2]=new Empleado("María Martín", 105000, 2002, 3, 15);
	
	misEmpleados[3]=new Empleado("Carlos Jiménez");
	
	/*for(int i=0; i<3; i++) {                        //bucle for
		
		misEmpleados[i].subeSueldo(5);
	}*/
	
	for(Empleado e: misEmpleados) {                  //bucle for each
		
		e.subeSueldo(5);	
		
	}
	
	/*for(int i=0; i<3; i++) {    //bucle for
		
		System.out.println("Nombre: " + misEmpleados[i].dameNombre() + 
				" Sueldo: " + misEmpleados[i].dameSueldo() +
				" Fecga de Alta: " + misEmpleados[i].dameFechaContrato());
	}*/
	
	for(Empleado e:misEmpleados) {     //bucle for each
		
		System.out.println("Nombre: " + e.dameNombre() + 
				" Sueldo: " + e.dameSueldo() +
				" Fecha de Alta: " + e.dameFechaContrato());	
	}
	
	}
	
}

class Empleado{    
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		//método constructor tiene que tener el mismo nombre que la clase a la que pertenece
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 2000,01,01);
	}
	
	
	public String dameNombre() {   //getter
		
		return nombre;
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
	
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
}