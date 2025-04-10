package Persona1;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int n1, n2, n3, n4, n5;
		int cafes = 1;
		
		switch (cafes){
			
		case 1: 
			System.out.println("1. café cortado");
			
			
			System.out.println("2. café Latte");
			
			System.out.println("3. café solo");
			
			System.out.println("4. café lágrima");
			
			System.out.println("5. Salir del programa");
			n1 = entrada.nextInt();

			
			
			if (n1 < 2 && n1 > 0) {
				System.out.println("disfrute su café cortado");	
				}
			
			else if  (n1 < 3 && n1 > 1) {
			System.out.println("disfrute su café Latte");
			}
			
			else if (n1 < 4 && n1 > 2) {
				System.out.println("disfrute su café solo");
			}
			
			else if (n1 < 5 && n1 > 3) {
				System.out.println("disfrute su café lágrima");
			}
			
			else if (n1 < 6 && n1 > 4) {
				System.out.println("saliste del programa");
				
			}
			else{
				System.out.println("ingre el numero que corresponda");
				
			}

		
		
	
	}
	}
}

