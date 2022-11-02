import java.util.Scanner;

public class Actividad2x04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numA, numB;
		
		System.out.print("¿Número real A?: ");
		numA = teclado.nextDouble();
		System.out.print("¿Número real B?: ");
		numB = teclado.nextDouble();
		teclado.close();
//		Dejar huecos en blanco en numero == 0 por ejemplo
		if(numA > numB) {
			System.out.println("El numero real: " + numA + " es mayor");
		}
		else if(numB > numA) {
			System.out.println("El numero real: " + numB + " es mayor");
			
		}
		else {
			System.out.println("Los numeros reales son iguales.");
		
		}
	}

}
//HAY QUE ARREGLARLO