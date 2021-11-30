package matrices;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrices17 {
	static Scanner teclado  = new Scanner(System.in);
	static int matrizentero [][] =  new int[5][5];
	static int pos = 0;
	static int userNumber = 0;
	static int numeroNuevo = 0;
	static int posicionAmodificar = 0 ;
	static int posicionAborrar = 0;
	static int otroNumber = 0 ;
	static boolean control = false;

	public static void main(String[] args) {
		// El codigo que se ejecuta
		int userNumber = 0;

		do {
						
			
			userNumber = menu();
			switch (userNumber) {
			case 1:
				System.out.println("Has elegido inicializar");

				iniArr();
				control = true;
				break;
			case 2:
				System.out.println("Has elegido ver");
				verArr();
				control = true;
				break;

			case 3:
				System.out.println("Has elegido insertar");
				addElement();
				control = true;
				break;

			case 4:
				System.out.println("Has elegido borrar");
				delElements();	
				control = true;
				break;


			case 5:
				System.out.println("Has elegido salir");
				control = false;
			default:
				break;
				
			}if (userNumber >= 6) {
				System.out.println("Fuera de rango");
				control = true;
			}
			
			
		} while(control);






	}
	public static int menu() {
		return pedirNumero("Menú de manejo de Arrays\n" +

			"1. Inicializar Array\n"+
			"2. Ver Array\n"+
			"3. Insertar elemento\n"+
			"4. Borrar elemento\n"+
				"5. Salir\n");
	}

	public static int pedirNumero(String pregunta)	{
		int numeroMetido = 0;
		boolean esUnNumero = false;
		while(!esUnNumero) {
			try {
				System.out.println(pregunta);
				numeroMetido = teclado.nextInt();
				esUnNumero = true;

			} catch (InputMismatchException ex) {

				System.out.println("Por favor, introduzca un número, con letras no funciona");
				teclado.next();
			}
		}
		return numeroMetido;
	}


	private static void delElements() {
		//Sustituimos el array con la posición menos donde nos diga el usuario
		
		
		int fila  = pedirNumero("¿En qué fila quieres borrar?");
		
		int columna  = pedirNumero("¿En qué columna quieres borrar?");

		int arrayFila[] = matrizentero[fila];
		matrizentero[fila] = removePosition(columna, arrayFila);
		verArr();

	}
	private static int[] removePosition(int position, int[] arrayAborrar) {
		//esta funcion crea un array nuevo que tiene una posición menos que el que tiene el elemento que queremos borrar.

		int []  arrayNuevo = new int [arrayAborrar.length -1]  ;
		for(int i = 0; i < arrayAborrar.length; i++) {

			if (i < position) {
				arrayNuevo [i] = arrayAborrar [i];

			}else if (i > position) {
				arrayNuevo [i -1] = arrayAborrar [i];
			}
		}
		return arrayNuevo;
	}

	
	private static void addElement() {
		//Esta función añade un número en una posición que pedimos por teclado
		
		

		int fila  = pedirNumero("¿En qué fila quieres añadir?");

		int columna  = pedirNumero("¿En qué columna quieres añadir?");
		

		int otroNumber  = pedirNumero("¿Qué número quieres poner?")	;
		
		
		//int [] arrayAinsertar = new int [0];
		//int posicion = 0;
		//int[] arrayNuevo = new int [arrayAinsertar.length +1];
		//	for (int i = 0; i < arrayAinsertar.length; i++) {
		//		if (i < posicion) {
		//			arrayNuevo [i] = arrayAinsertar[i];
		//		}else if(i > posicion) {
		//			arrayNuevo [i +1 ] = arrayAinsertar[i];
		//		}
			//}
			
		
			matrizentero[fila ] [columna ] = otroNumber;

			verArr();



	}
	public static void iniArr() {

		//Función de inicialización del array


		for (int i = 0; i < matrizentero.length; i++){

			for(int j = 0; j < matrizentero[i].length; j++) {


			}


			System.out.println(Arrays.toString(matrizentero[i]));
		}




	}
	public static void verArr() {
		//Función que muestra el array


		for (int i = 0; i < matrizentero.length -1; i++){

			for(int j = 0; j < matrizentero[i].length -1; j++) {


			}
			System.out.println(Arrays.toString(matrizentero[i]));
			//System.out.print("\n");


		}
	}
}
