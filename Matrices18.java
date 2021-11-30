package matrices;

import java.util.Arrays;

public class Matrices18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrizA [][] =  {{1,2},{2,4}};
		int matrizB [][] =  {{1,2},{2,4}};
		int matrizResultado [][] ; 
		int suma = 0;
		
		int matrizC [][] = new int [matrizA.length][matrizB[0].length];
		
		if(matrizA[0].length == matrizB.length) {
			
			for(int i = 0; i < matrizA.length; i++) {
				
				for(int j = 0; j < matrizB[0].length; j++){
					suma = suma + matrizB[i][j];
					
					
					for(int k = 0; k < matrizA[0].length;k++){
						
						
				int	resultado = 	matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
						System.out.println(resultado);
					}
				} 
		}
		
			
			
			
		}
		
	}

}
//18.Realiza la clase Java Multimat calcula la multiplicación de dos matrices bidimensionales A y B 
//que tienen  como característica principal que el número de columnas de A es igual que el 
//número de filas de B y que  la matriz resultado tiene tantas filas como A y tantas columnas como B. 
//Cada uno de los términos de la  matriz resultado se obtiene sumando la multiplicación de los elementos 
//de una fila de A por los de una  columna de B. 