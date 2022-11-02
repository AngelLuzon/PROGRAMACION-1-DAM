import java.util.Scanner;

public class Actividad1x06 {

	public static void main(String[] args) {
		int numChicos, numChicas;
		double porcentajeChicos, porcentajeChicas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número de Chicos? ");
		numChicos = teclado.nextInt();
		System.out.print("¿Número de Chicas? ");
		numChicas = teclado.nextInt();
		
		porcentajeChicos = numChicos * 100.0 / (numChicos + numChicas);
		porcentajeChicas = 100.0 - porcentajeChicos;
		System.out.printf("Porcentaje de Chicos: %.2f%%\n" , porcentajeChicos);
		System.out.printf("Porcentaje de Chicas: %.2f%%\n" , porcentajeChicas);
		
	}
}
