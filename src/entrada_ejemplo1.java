	import java.util.*;
	
public class entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola "+ nombre + ". El año que viene tendrás " + (edad+1) + " años.");
		
	}

}
