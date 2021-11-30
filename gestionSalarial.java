package matrices;

import java.util.Scanner;

public class gestionSalarial {

	static Scanner teclado = new Scanner(System.in);

	static String nombre = " ";
	static String salario = " ";
	static String edad = " ";
	static String numHijos = " ";
	static String [][] matrizEmpleados = new String [4][4];


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean control = false;
		System.out.println("Introduce tus datos");
		
		do {
			
		
		for(int i = 0; i < matrizEmpleados.length; i++) {
			
			for (int j = 0; j < matrizEmpleados.length; j++) {
				System.out.println("Introduce tu nombre");
				nombre = teclado.nextLine();
				matrizEmpleados[i][j]=nombre;
				System.out.println("Introduce tu salario");
				salario = teclado.nextLine();
				matrizEmpleados[i][j]=salario;
				System.out.println("Introduce tu edad");
				edad = teclado.nextLine();
				matrizEmpleados[i][j]=edad;
				System.out.println("Introduce tu número de hijos");
				numHijos = teclado.nextLine();
				matrizEmpleados[i][j]=numHijos;
				System.out.println((matrizEmpleados[i][j]));
				control = false;
			}
				
				
				
				
			
				
				
				
				

			}
		}while(control);

	}


	

	
}
