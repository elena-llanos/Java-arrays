package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		int pos = 0;
		int num = 0;
		int longitud = arr.length;
		
		//relleno el array
		do {
			System.out.println("Introduce número de 0 a 9. Menor que 0 para finalizar.");
			num = teclado.nextInt();
			if (num >=0 && num <=9) { 
				arr[pos] = num;
				pos++; 
			}
			
		}while (pos < longitud && num >= 0);
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.println("Posiciones ocupadas: "+ pos);
		
		//calculo la media de los números introducidos
		int media =0;
		/*
		int pos2 = 0;
		do {
			media = media + arr[pos2];
			pos2++;
		}while (pos2 < pos );
		*/
		
		for(int i=0; i<= pos; i++) {
			media = media + arr[i];
		}
		
		media = media / pos;
		System.out.println("Media de los números introducidos: "+ media);
		
		
		//return arr; 
	}

	}



//6. Realiza la clase Java Medianum que pide números por pantalla y los almacena en un array hasta que se 
//introduzca un número negativo que no será tenido en cuenta. Después calcula la Media y la muestra. 
