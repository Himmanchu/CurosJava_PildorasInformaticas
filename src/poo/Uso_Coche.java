package poo;

import javax.swing.*;
public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche Renault=new Coche();  //INSTANCIAR UNA CLASE. EJEMPLAR UNA CLASE
		
		System.out.println(Renault.dime_datos_generales());
		
		Renault.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		Renault.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		Renault.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		

		
		System.out.println(Renault.dime_color());
		System.out.println(Renault.dime_asientos());
		System.out.println(Renault.dime_climatizador());
		System.out.println(Renault.dime_peso_coche());
		System.out.println("El precio final del coche es: " + Renault.precio_coche () + "€.");
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
		
		
	} 

}
