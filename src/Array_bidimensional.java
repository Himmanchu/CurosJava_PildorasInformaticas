
public class Array_bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Esta forma sería la manera larga de declarar y rellenar una matriz
		
		/*int [][]matrix=new int[3][2];
		
		matrix[0][0]=3;
		matrix[0][1]=87;
		
		matrix[1][0]=45;
		matrix[1][1]=21;
		
		matrix[2][0]=8;
		matrix[2][1]=43;
		*/
		
		int[][] matrix= {
				{3,87},
				{45,21},
				{8,43}
		};
		
		
		//Forma larga de recorrer el bucle for
		
		/*for(int i=0;i<3;i++) {
			
			System.out.println();
			
			for(int j=0;j<2;j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
		}
		*/
		
		//Bucle for each
		for(int[]fila:matrix) {
			
			System.out.println();
			
			for(int z:fila) {
				
				System.out.print(z + " ");

			}
		}
		
		
	}

}
