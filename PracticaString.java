package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticaString {
	static Scanner teclado  = new Scanner(System.in);


	static String [] arrayentero ;
	static int pos = 0;
	static String userName = " ";

	public static void main(String[] args) {
		// El codigo que se ejecuta


		String userName;

		do {
			userName = menu();
			switch (userName) {



			case "1":
				System.out.println("Has elegido inicializar");			
				iniArr();
				break;


			case "2":
				System.out.println("Has elegido ver");
				verArr();
				break;

			case "3":
				System.out.println("Has elegido añadir");
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
		}while (userName != "6");





	}

	private static void delElements() {
		System.out.print("¿Qué posición quieres borrar?");
		int posicionAborrar  = teclado.nextInt();
		//tengo un array de una posicion menos
		String [] arrayNuevo = new String [arrayentero.length -1];
		for(int i = 0; i < arrayentero.length; i++) {

			if (i < posicionAborrar) {
				arrayNuevo [i] = arrayentero [i];

			}else  {
				arrayNuevo [i -1] = arrayentero [i];
			}
		}
		arrayentero = arrayNuevo;
		verArr();

	}

	private static void modifyElement() {
		//Esta función pide la posición y el número que queremos modificar

		try {


			System.out.print("¿Qué posición quieres modificar?");
			int posicionAmodificar  = teclado.nextInt();

			System.out.print("¿Qué fruta quieres poner?");
			String frutaNueva  = teclado.next();

			arrayentero[posicionAmodificar] = frutaNueva;
		}catch(Exception e) {
			System.out.println("Error fatal, debes añadir letras");

		}
		verArr();
	}

	private static void addElement() {
		//Esta función añade un número en una posición que pedimos por teclado

		try	{


			System.out.print("¿Qué posición quieres añadir?");
			int posicionAñadir  = teclado.nextInt();


			System.out.print("¿Qué fruta quieres poner?");
			String otraFruta  = teclado.next();
			


			arrayentero [posicionAñadir] = otraFruta;
		}catch(Exception e) {
			System.out.println("Error fatal");
		}

		verArr();
	}
	public static String menu() {
		System.out.println("Operaciones Array\n" +

			"1. Inicializar Array\n"+
			"2. Ver Array\n"+
			"3. Añadir elemento\n"+
			"4. Modificar elemento\n"+
			"5. Borrar elemento\n"+
				"6.Salir\n" );
		return teclado.next();
	}

	public static void iniArr() {

		//Función de inicialización del array
		arrayentero = new String [9];				

		for (int i = 0; i < arrayentero.length; i++);{
			int i = 0;
			arrayentero[i] = "";



			System.out.println(Arrays.toString(arrayentero));
		}

	}
	public static void verArr() {
		//Función que muestra el array
		System.out.println(Arrays.toString(arrayentero));
		System.out.println("\n");


	}
}





