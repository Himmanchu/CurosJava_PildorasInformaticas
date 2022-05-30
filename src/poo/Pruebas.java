package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1= new Empleados("Paco");   //creación de objetos
		
		Empleados trabajador2= new Empleados("Ana");
		
		Empleados trabajador3= new Empleados("Antonio");
		
		Empleados trabajador4= new Empleados("Marta");
		
		Empleados trabajador5= new Empleados("Carlos");
		
		trabajador1.cambiaSeccion("RRHH");
		
		
		
		
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() 
		+ "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos() +
		"\n" + trabajador5.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		
		
		
	}

}



class Empleados{
	
	public Empleados(String nom) {  //método constructor siempre con "public"
		
		nombre=nom;
		
		seccion="Administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
	
		
		
	}
	
	public void cambiaSeccion(String seccion) { //setter
		
		this.seccion=seccion;
		
		
		
	}
	
	
	public String devuelveDatos() {    //getter
		
		return "El nombre es: " + nombre + " la sección es " + seccion + " y el Id=" + Id;
		
	
	}
	
	
	public static String dameIdSiguiente() {
		
		return "El IdSiguiente es: " + IdSiguiente;
	}
		
	
	private final String nombre;   //al añadir el "final" conviertes la variable en constante
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
}

