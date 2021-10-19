package eva1;

import java.util.Scanner;

public class Ejercicio9 {
	static Scanner teclado  = new Scanner(System.in);

	public static void main(String[] args) {

		String userName = new String ("elena");
		String userPass = new String ("alohomora");

		String givenName = new String ("");
		String givenPass = new String ("");
		int nameresult = 0;
		int passResult = 0;
		int intentos = 0;

		do {

			System.out.println("Introduce usuario");
			givenName = teclado.next();

			//nameresult = givenName.compareTo(userName);

			if (givenName.equals(userName)) {
				System.out.println("Usuario Correcto");
			}else  {
				System.out.println("Usuario Incorrecto");
			}
		}while(givenName == userName );

		do {
			System.out.println("Introduce Contraseña");
			givenPass = teclado.next();
			intentos ++;
			passResult = givenPass.compareTo(userPass) ;
			if(passResult == 0 ) {
				System.out.println("Contraseña Correcta; WELCOME");

			}else if (intentos ++ >3) {
				System.out.println("Superado máximo número de intentos: Intenta más tarde");
			}else {
				System.out.println("Contraseña Incorrecta");
			}

		}while (passResult != 0 || intentos ++ >3 );





	}

}
//9. Realiza la clase Java Contrase que pide un nombre por pantalla y una contraseña. 
//Compara los valores con  unos valores predefinidos y si coinciden muestra un mensaje de bienvenida.
//Si no coinciden muestra un  mensaje de error por pantalla. 
//El proceso se repite hasta que los datos son correctos o hasta que se  produzcan más de 3 intentos.
