import java.util.Scanner;

public class Actividad1x02 {

	public static void main(String[] args) {
		int numeroA, numeroB, numeroC;
		// para poder leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Entero A? ");
		numeroA = teclado.nextInt();
		System.out.print("¿Número Entero B? ");
		numeroB = teclado.nextInt();
		System.out.print("¿Número Entero C? ");
		numeroC = teclado.nextInt();
		teclado.close();
		
		System.out.println("Numeros enteros alineados a la derecha:");
		System.out.printf("A = %5d\n", numeroA);
		System.out.printf("B = %5d\n", numeroB);
		System.out.printf("C = %5d\n", numeroC);
		
		System.out.println("Numeros enteros alineados a la izquierda:");
		System.out.printf("A = %d\n", numeroA);
		System.out.printf("B = %d\n", numeroB);
		System.out.printf("C = %d\n", numeroC);
	}

}
