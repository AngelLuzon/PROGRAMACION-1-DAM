import java.util.Scanner;

public class Actividad1x04 {

	public static void main(String[] args) {
		Double numeroA, numeroB, resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Real A? ");
		numeroA = teclado.nextDouble();
		System.out.print("¿Número Real B? ");
		numeroB = teclado.nextDouble();
		
		resultado = numeroA + numeroB;
		System.out.println(numeroA + " + " + numeroB + " = " + resultado);
		
		resultado = numeroA - numeroB;
		System.out.println(numeroA + " - " + numeroB + " = " + resultado);
		
		
		resultado = numeroA * numeroB;
		System.out.println(numeroA + " * " + numeroB + " = " + resultado);
	
		resultado = numeroA / numeroB;
		System.out.println(numeroA + " / " + numeroB + " = " + resultado);
	}
	
	

}
