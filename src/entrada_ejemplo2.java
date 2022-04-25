import javax.swing.*;
public class entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
	//	String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		
		
	//	System.out.println("Hola " + nombre_usuario + " tienes " + edad + " años.");
		
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		
		
		System.out.println("Hola " + nombre_usuario + " el año que viene tendrás " + (edad_usuario+1) + " años.");
		
		
	}

}
