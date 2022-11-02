import java.util.Scanner;

public class Actividad3x01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
//		Leer por teclado año y tiene que ser >= 1583
//		Indicar si el año es bisiesto
//		Es bisisesto si es div / 4 y 400 pero no div / 100
//		Si el año es < escribe El año debe ser mayor o igual que 1583
		
		int anno;
		
		System.out.print("¿Año? ");
		anno = teclado.nextInt();
		
		if(anno < 1583) {
			System.out.println("El año debe ser mayor o igual que 1583.");
		}
	
		else {
			
			if(anno % 4 == 0) {
				if(anno % 100 != 0 || anno % 400 == 0){
					System.out.print("El año " + anno + " es bisiesto.");
				}
				else {
//					se pone este print para el caso por ejemplo 2100
					System.out.print("El año " + anno + " no es bisiesto.");
				}
			}
			else {
				System.out.println("El año " + anno + " no es bisiesto.");
			}
			
		
		}
			
	}

}
