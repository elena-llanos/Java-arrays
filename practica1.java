package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class practica1 {
	static Scanner teclado  = new Scanner(System.in);



	public static void main(String[] args) {
		// El codigo que se ejecuta

		String userNumber;
		int [] arrayentero = new int [9];
		/*arrayentero [0] = 0;
		arrayentero [1] = 1;
		arrayentero [2] = 2;
		arrayentero [3] = 3;
		arrayentero [4] = 4;
		arrayentero [5] = 5;
		arrayentero [6] = 6;
		arrayentero [7] = 7;
		arrayentero [8] = 8;*/
		do {
			userNumber = menu();
			switch (userNumber) {

			case "1":
				System.out.println("Has elegido inicializar");
				iniArr(arrayentero);
				break;

			case "2":
				System.out.println("Has elegido ver");
				verArr(arrayentero);
				break;

			case "3":
				System.out.println("Has elegido a�adir");
				arrayentero = addElement(arrayentero);
				break;

			case "4":
				System.out.println("Has elegido modificar");		
				modifyElement(arrayentero);	
				break;

			case "5":
				System.out.println("Has elegido borrar");
				System.out.print("�Qu� posici�n quieres borrar?");
				int posicionAborrar  = teclado.nextInt();
				//tengo un array de una posicion menos
				int [] arrayNuevo = new int [arrayentero.length -1];
				for(int i = 0; i < arrayentero.length; i++) {
					
					if (i < posicionAborrar) {
						arrayNuevo [i] = arrayentero [i];
						
					}else  {
						arrayNuevo [i -1] = arrayentero [i];
					}
				}
				arrayentero = arrayNuevo;		
				
				

				break;

			case "6":
				System.out.println("Has elegido salir");
			default:
				
			}
		}while (userNumber != "6");
		
		
		


	}

	private static void modifyElement(int[] arrayentero) {
		//Esta funci�n pide la posici�n y el n�mero que queremos modificar
		System.out.print("�Qu� posici�n quieres modificar?");
		int posicionAmodificar  = teclado.nextInt();

		System.out.print("�Qu� n�mero quieres poner?");
		int numeroNuevo  = teclado.nextInt();

		arrayentero[posicionAmodificar] = numeroNuevo;
	}

	private static int[] addElement(int[] arrayentero) {
		//Esta funci�n a�ade un n�mero que pedimos por teclado
		int [] a�adoArray = new int [arrayentero.length + 1];
		System.out.print("Dime un n�mero");
		int otroNumber  = teclado.nextInt();

		addAllElements(arrayentero, a�adoArray);

		int posicion = a�adoArray.length -1;
		a�adoArray [posicion] = otroNumber;
		arrayentero = a�adoArray;
		return arrayentero;
	}
	

	private static void addAllElements(int[] arrayOrigen, int[] arrayDestino) {
		//esta funci�n clona el array inicial en el nuevo 
		for (int i = 0; i < arrayOrigen.length; i++) {

			arrayDestino [i] = arrayOrigen [i];				


		}
	} 

	public static String menu() {
		System.out.println("Operaciones Array\n" +

			"1. Inicializar Array\n"+
			"2. Ver Array\n"+
			"3. A�adir elemento\n"+
			"4. Modificar elemento\n"+
			"5. Borrar elemento\n"+
				"6.Salir\n" );
		return teclado.nextLine();
	}

	public static int [] iniArr(int [] arrayentero ) {
		//Funci�n de inicializaci�n del array
		arrayentero = new int [9];
		System.out.print(Arrays.toString(arrayentero));
		return arrayentero;

	}

	public static void verArr(int[] arrayentero) {
		//Funci�n que muestra el array
		for (int i = 0; i < arrayentero.length; i++) {
			System.out.print("[ , ] " + arrayentero[i]);
		}
		System.out.println("\n");


	}


	

}
