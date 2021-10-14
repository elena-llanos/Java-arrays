package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {


		// TODO Auto-generated method stub
		int arrayTemp []  = new int [10];
		int userNumber = 0;
		int posicion = 0;
		int longitud = arrayTemp.length;
		int mediaTemp = 0;
		int suma = 0;
		do {
			System.out.print("Introduce temperatura");
			userNumber = teclado.nextInt();
			arrayTemp [posicion] = userNumber;
			posicion++;

		}while (userNumber != -999);
		System.out.println(Arrays.toString(arrayTemp));


		for(int i = 0; i < arrayTemp.length; i++) {
			suma += arrayTemp[i];
		}
		System.out.print(suma - (-999));
		
		mediaTemp = (suma -(-999))/posicion++;
		
		
		System.out.println("\n la temperatura media es " + mediaTemp );
		
		
		

	}

}
//7. Realiza la clase Java Mediatem que pide temperaturas por pantalla 
//y las almacena en un array hasta que  se introduzca la temperatura -999 que 
//no será tenida en cuenta. Después calcula la temperatura media y  muestra el número de temperaturas que 
//son mayores que la media, iguales que la media, e inferiores a la  media.  