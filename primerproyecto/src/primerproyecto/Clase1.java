package primerproyecto;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {

		
		
		/* Ejercicio 1
		  //a)
		
		int inicio = 4;
		
		int fin = 15;
		
		while (inicio< fin + 1  ) {
		System.out.println(inicio);
		inicio++;
		}
		
		//b)
		
		int inicio = 4;
		int fin = 15 ;
		
		while (inicio < fin +1) {
			if (inicio % 2 == 0) {
				System.out.println(inicio);
		}
			inicio++;
		}
		
		//c)
		
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("par o inpar?");
		String orden = obj.nextLine();
		
		
		int inicio = 4;
		int fin = 15 ;
		switch (orden) {
		case "par":
			while (inicio < fin + 1) {
			if (inicio % 2 == 0) {
				System.out.println(inicio);
			}
			inicio++;
		}
			break;
		case "inpar":
			while (inicio < fin + 1) {
			if (inicio % 2 != 0) {
				System.out.println(inicio);
			}
			inicio++;
		}
			break;
			default:
				System.out.println("Debe escribir par o inpar");
			break;
		}

		//d)
		
		for(int inicio = 15; inicio > 3; inicio--) {
			if (inicio % 2 == 0) {
			System.out.println(inicio);
			}
		}
		 */
		
		
		// Ejercicio 2
		
		Scanner obj = new Scanner(System.in);
		System.out.println("que categoria quiere comprobar? (en mayuscula)");
		String categoria = obj.nextLine();
		
		float ingresos = 299000;
		int veiculos = 0;
		int inmuebles = 1;
		boolean lujos = false;
		
		switch(categoria) {
		case "A":
			if ( (ingresos <=  284686.95) &&
					( veiculos < 1) &&
					(inmuebles <= 1) &&
					(!lujos)) {
					System.out.println("Categoría A");
					}
			else {
				System.out.println("No es categoría A");
			}
			break;
		case "B":
			if ( (ingresos <  996404.43) &&
					( veiculos <= 1) &&
					(inmuebles <= 2) &&
					(!lujos)) {
					System.out.println("Categoría B");
					}
			else {
				System.out.println("No es categoría B");
			}
			break;
		case "C":
			if ( (ingresos >  996404.43) &&
					( veiculos > 3) &&
					(inmuebles > 3) &&
					(lujos)) {
					System.out.println("Categoría C");
					}
			else {
				System.out.println("No es categoría C");
			}
			break;
			
			default:
				System.out.println("Debe elegir una categoria A, B o C (en mayuscula)");
				break;
		}
		
		
		
		
		
	}

}
