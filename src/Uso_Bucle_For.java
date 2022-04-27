import javax.swing.JOptionPane;

public class Uso_Bucle_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Introduce tu email");
		
		for(int i=0; i<mail.length(); i++) {
			
			if(mail.charAt(i)=='@') {
				arroba=true;
						
			}
		}
		if(arroba==true) {
			System.out.println("El email es correcto");
			
		}
		
			else{
				System.out.println("El email no es válido");
		}
		
		
	}

}
