import java.util.Scanner;

public class Actividad1x05 {
	public static void main(String[] args) {
	

		double numeroA, numeroB;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Real A? ");
		numeroA = teclado.nextDouble();
		System.out.print("¿Número Real B? ");
		numeroB = teclado.nextDouble();
		System.out.println("Número con 2 dígitos decimales");
		System.out.printf(" A = %.2f\n", numeroA);
		System.out.printf(" B = %8.2f\n", numeroB);
		System.out.println("Números con 1 digito decimal");
		System.out.printf(" A = %.1f\n", numeroB);
		System.out.printf(" B = %.1f\n", numeroB);
		System.out.println("Número con ningún digito decimal");
		System.out.printf(" A = %.0f\n", numeroB);
		System.out.printf(" B = %2.0f\n", numeroB);
	}
}