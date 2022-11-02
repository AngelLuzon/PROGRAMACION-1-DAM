import java.util.Scanner;

public class Actividad3x06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in) ;
		int num;
		
		
		
		
		System.out.print("¿Número Entero? ");
		num = teclado.nextInt();
		
		if (num < 0 || num > 99999) {
			System.out.println("El número entero debe estar "
					+ "comprendido entre 0 y 99999. ");
		}
		
		else if (num < 10) {
				System.out.println("El numero " + num + " tiene 1 cifras");
			}
		else if (num < 100) {
			System.out.println("El numero " + num + " tiene 2 cifras");
		}
		
		else if (num < 1000) {
				System.out.println("El numero " + num + " tiene 3 cifras");
		}
						
				
		else if (num < 10000) {
			System.out.println("El numero " + num + " tiene 4 cifras");
		}
		
		else {
			System.out.println("El numero " + num + " tiene 5 cifras");
					
		
		}
		
	
		
		
		
		
	}
}
