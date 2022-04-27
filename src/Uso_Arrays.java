
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	int [] mi_matriz=new int[5];
			
			mi_matriz[0]=35;
			mi_matriz[1]=5;
			mi_matriz[2]=-86;
			mi_matriz[3]=72;
			mi_matriz[4]=4;
			*/
			
		int[]mi_matriz= {35,5,-86,72,4,6,89,6,123,64,-83,-56,0,98,73,65,24,56,71};
		
	//for(int i=0;i<5;i++) {
		
		for(int i=0;i<mi_matriz.length;i++) {
		
		System.out.println("El valor del índice " + i + " = " + mi_matriz[i]);
		
	}
	}

}
