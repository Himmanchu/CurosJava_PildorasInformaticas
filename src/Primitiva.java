
public class Primitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros=new int[6];
		
		for(int i=0;i<6;i++) {
			
			numeros[i]=(int)Math.round(((Math.random()*100)/2));
		}
		
		for(int resultado:numeros) {
			
			System.out.print(resultado + " ");
			
		}
			
		int reintegro=(int)Math.round((Math.random()*100)/10);
		
			System.out.println("Reintegro " +reintegro);
		
		
	}

}
