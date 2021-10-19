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
				System.out.println("Has elegido añadir");
				arrayentero = addElement(arrayentero);
				break;

			case "4":
				System.out.println("Has elegido modificar");		
				modifyElement(arrayentero);	
				break;

			case "5":
				System.out.println("Has elegido borrar");
				System.out.print("¿Qué posición quieres borrar?");
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
		//Esta función pide la posición y el número que queremos modificar
		System.out.print("¿Qué posición quieres modificar?");
		int posicionAmodificar  = teclado.nextInt();

		System.out.print("¿Qué número quieres poner?");
		int numeroNuevo  = teclado.nextInt();

		arrayentero[posicionAmodificar] = numeroNuevo;
	}

	private static int[] addElement(int[] arrayentero) {
		//Esta función añade un número que pedimos por teclado
		int [] añadoArray = new int [arrayentero.length + 1];
		System.out.print("Dime un número");
		int otroNumber  = teclado.nextInt();

		addAllElements(arrayentero, añadoArray);

		int posicion = añadoArray.length -1;
		añadoArray [posicion] = otroNumber;
		arrayentero = añadoArray;
		return arrayentero;
	}
	

	private static void addAllElements(int[] arrayOrigen, int[] arrayDestino) {
		//esta función clona el array inicial en el nuevo 
		for (int i = 0; i < arrayOrigen.length; i++) {

			arrayDestino [i] = arrayOrigen [i];				


		}
	} 

	public static String menu() {
		System.out.println("Operaciones Array\n" +

			"1. Inicializar Array\n"+
			"2. Ver Array\n"+
			"3. Añadir elemento\n"+
			"4. Modificar elemento\n"+
			"5. Borrar elemento\n"+
				"6.Salir\n" );
		return teclado.nextLine();
	}

	public static int [] iniArr(int [] arrayentero ) {
		//Función de inicialización del array
		arrayentero = new int [9];
		System.out.print(Arrays.toString(arrayentero));
		return arrayentero;

	}

	public static void verArr(int[] arrayentero) {
		//Función que muestra el array
		for (int i = 0; i < arrayentero.length; i++) {
			System.out.print("[ , ] " + arrayentero[i]);
		}
		System.out.println("\n");


	}


	

}
