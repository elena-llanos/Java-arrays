package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class practicaEx {
	static Scanner teclado  = new Scanner(System.in);


	static int[][] matrizentero ;
	static int pos = 0;
	static int userNumber = 0;
	static int numeroNuevo = 0;
	static int posicionAmodificar = 0 ;
	static int posicionAborrar = 0;
	static int otroNumber = 0 ;

	public static void main(String[] args) {
		// El codigo que se ejecuta


		String userNumber;

		do {
			userNumber = menu();
			switch (userNumber) {



			case "1":
				System.out.println("Has elegido inicializar");			
				iniArr();
				break;


			case "2":
				System.out.println("Has elegido ver");
				verArr();
				break;

			case "3":
				System.out.println("Has elegido a�adir");
				addElement();
				break;

			case "4":
				System.out.println("Has elegido modificar");		
				modifyElement();	
				break;

			case "5":
				System.out.println("Has elegido borrar");
				delElements();	
				break;

			case "6":
				System.out.println("Has elegido salir");
			default:

			}
		}while (userNumber != "6");





	}

	private static void delElements() {
		System.out.print("�Qu� posici�n quieres borrar?");
		int posicionAborrar  = teclado.nextInt();
		//tengo un array de una posicion menos
		int [] [] matrizNuevo = new int [matrizentero.length -1]  [];
		for(int i = 0; i < matrizentero.length; i++) {

			if (i < posicionAborrar) {
				matrizNuevo [i] = matrizentero [i];

			}else  {
				matrizNuevo [i -1] = matrizentero [i];
			}
		}
		matrizentero = matrizNuevo;
		verArr();

	}

	private static void modifyElement() {
		//Esta funci�n pide la posici�n y el n�mero que queremos modificar
		System.out.print("�Qu� posici�n quieres modificar?");
		int posicionAmodificar  = teclado.nextInt();

		System.out.print("�Qu� n�mero quieres poner?");
		int numeroNuevo  = teclado.nextInt();

		matrizentero[posicionAmodificar] = numeroNuevo;
		verArr();
	}

	private static void addElement() {
		//Esta funci�n a�ade un n�mero en una posici�n que pedimos por teclado

		System.out.print("�Qu� posici�n quieres a�adir?");
		int posicionA�adir  = teclado.nextInt();

		System.out.print("�Qu� n�mero quieres poner?");
		int otroNumber  = teclado.nextInt();	


		matrizentero [posicionA�adir] = otroNumber;
		verArr();
	}
	public static String menu() {
		System.out.println("Operaciones Array\n" +

			"1. Inicializar Array\n"+
			"2. Ver Array\n"+
			"3. A�adir elemento\n"+
			"4. Modificar elemento\n"+
			"5. Borrar elemento\n"+
				"6.Salir\n" );
		return teclado.next();
	}

	public static void iniArr() {

		//Funci�n de inicializaci�n del array
		int matrizentero [][] =  new int[3][2];		

		for (int i = 0; i < 3; i++){

			for(int j = 0; j < 2; j++) {
				matrizentero[i][j]= -1;
				i++;
				j++;
			}		
					
			System.out.println(Arrays.toString(matrizentero));
		}

				

	}
	public static void verArr() {
		//Funci�n que muestra el array
		
					
		System.out.println(Arrays.toString(matrizentero));
		System.out.println("\n");


	}
	}






