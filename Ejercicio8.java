package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int array [] = new int [10];
		int userNumber = 0;
		int posicion = 0;
		int longitud = array.length;
		int suma = 0;
		int primo = 0;
		do {
			System.out.println("Introduce un número");
			userNumber = teclado.nextInt();
			array[posicion] = userNumber;
			posicion++;
		}while (userNumber >0);
		System.out.println(Arrays.toString(array));

	}

}
//Realiza la clase Java Arraysumaprimo que pide números enteros por 
//pantalla y los almacena en un array  hasta que se introduzca un número negativo que no será tenido en cuenta. 
//Después calcula la suma de  todos ellos y comprueba si es un número primo o no.