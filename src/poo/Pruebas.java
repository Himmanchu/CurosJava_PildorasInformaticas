package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1= new Empleados("Paco");   //creación de objetos
		
		Empleados trabajador2= new Empleados("Ana");
		
		trabajador1.cambiaSeccion("RRHH");
		
		
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
		
		
	}

}



class Empleados{
	
	public Empleados(String nom) {  //método constructor siempre con "public"
		
		nombre=nom;
		
		seccion="Administración";
		
		
	}
	
	public void cambiaSeccion(String seccion) { //setter
		
		this.seccion=seccion;
		
		
		
	}
	
	public String devuelveDatos() {    //getter
		
		return "El nombre es: " + nombre + " y la sección es " + seccion;
		
	
	}
	
		
	
	private String nombre;
	
	private String seccion;
	
}

