package Persona1;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Ingrese la hora: ");
		n1 = entrada.nextInt();
		
		System.out.println("Ingrese los minutos: ");
		n2 = entrada.nextInt();	
		
		System.out.println("Ingrese los segundos: ");
		n3 = entrada.nextInt();	
		
		if(n1 >= 1 && n1 < 24) { 
		}
		if(n2 >= 1 && n2 < 60) { 
		}
		if(n3 >= 1 && n3 < 60) { 
			System.out.println("Valor válido");
		}
	
		else {
			System.out.println("Valor incorrecto");
		}
	}
	

}
