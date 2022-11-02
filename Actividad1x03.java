import java.util.Scanner;

public class Actividad1x03 {

	public static void main(String[] args) {
		//
		int numeroA, numeroB, auxiliar;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Entero A? ");
		numeroA = teclado.nextInt();
		System.out.print("¿Número Entero B? ");
		numeroB = teclado.nextInt();
		
		System.out.println("Antes del intercambio");
		System.out.println("A = " + numeroA + " y B = " + numeroB);
		
		auxiliar = numeroA;
		numeroA = numeroB;
		numeroB = auxiliar;
		
		System.out.println("Despues del intercambio: ");
		System.out.println("A = " + numeroA + " y B = " + numeroB);
	}

}
