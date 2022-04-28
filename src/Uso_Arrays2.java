import javax.swing.*;
public class Uso_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String [] paises= {"España","Italia","EEUU","Perú","Alemania","Costa Rica","Francia","Japón"};
		String []paises=new String[8];
		
		 
		/*paises[0]="España";
		paises[1]="Italia";
		paises[2]="EEUU";
		paises[3]="Perú";
		paises[4]="Alemania";
		paises[5]="Costa Rica";
		paises[6]="Francia";
		paises[7]="Japón";
		+/
		
		/*for(int i=0; i<paises.length; i++) {
			
			System.out.println("País " + (i+1) + " " +paises[i]);
		}
		*/
		
		for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce país " + (i+1));
		}
		
		for(String elemento:paises) {
			
			System.out.println("País: "+ elemento);
		}
		
	}

}
