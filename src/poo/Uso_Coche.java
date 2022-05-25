package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche Renault=new Coche();  //INSTANCIAR UNA CLASE. EJEMPLAR UNA CLASE
		
		System.out.println(Renault.dime_largo());
		
		Renault.establece_color("naranja");
		
		System.out.println(Renault.dime_color());
		
		
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
		
		
	} 

}
