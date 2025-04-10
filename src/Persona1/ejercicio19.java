package Persona1;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner entrada = new Scanner( System.in);
		
		int intentos = 0;
		int contrasena;
		
		do {
			System.out.println("Ingrese la contraseña: ");
			contrasena = entrada.nextInt();
			
			if (contrasena != 2008) {
				Thread.sleep(1000);
				intentos++;
				
				if (intentos < 3) {
					System.out.println("vvolve a intentar. ");
				}
				
			}
			
				
		} while(contrasena != 2008 && intentos<3);
		
		if (contrasena==2008){
		System.out.println("Contrasena correcta.");
		
		}
		if (contrasena!=2008){
			System.out.println("Bloqueaste el usuario. ");
		}
		
}
}