package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Numveces_5 {
	
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1 [] = new int [5];
		int userNumber = 0;
		int posicion = 0;
		int longitud = arr1.length;
		int cont0 = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0;
		
		do {
			System.out.println("Introduce un número del 1 al 9");
			userNumber = teclado.nextInt();
			
			switch (userNumber) {
			case 0: 
				cont0++;
				break;
			case 1: 
				cont1++;
				break;
			case 2: 
				cont2++;
				break;
			case 3: 
				cont3++;
				break;
			case 4: 
				cont4++;
				break;
			case 5: 
				cont5++;
				break;
			case 6: 
				cont6++;
				break;
			case 7: 
				cont7++;
				break;
			case 8: 
				cont8++;
				break;
			case 9: 
				cont9++;
				break;	
			}
			arr1 [posicion] = userNumber;
			posicion ++;
			
			
			
		} while (userNumber >=0 && userNumber <=9 );
			System.out.print("Array: "+ Arrays.toString(arr1));
		
		

	}

}
//Realiza la clase Java Numveces que pide números de 0 a 9 por pantalla y 
//calcula el número de veces que  han sido introducidos utilizando un array. (los números que va metiendo el usuarioa se ven en el array)
//Finaliza la introducción de datos cuando se introduce un valor  negativo. 
//Al finalizar la introducción de datos muestra por pantalla el número de veces que se ha  introducido cada número.  
