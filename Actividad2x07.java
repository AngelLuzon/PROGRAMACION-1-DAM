import java.util.Scanner;

public class Actividad2x07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, c, discriminante;
		double x, x1, x2;
		
		System.out.print("¿Coeficiente A?: ");
		a = teclado.nextDouble();
		teclado.close();
		if(a == 0.0) {
			System.out.println("El coeficiente A debe ser distinto de 0.");
		}
		
		else {
			System.out.print("¿Coeficiente B?: ");
			b = teclado.nextDouble();
			System.out.print("¿Coeficiente C?: ");
			c = teclado.nextDouble();
			
			discriminante = (b * b) - (4 * a * c);
			
			if(discriminante < 0.0) {
				System.out.println("La ecuación no tiene ninguna única solucón real: ");
			}
			
			else if(discriminante == 0.0) {
				System.out.println("La ecuación tiene una única solucón real: ");
				x = -b / (2 * a);
				System.out.printf("X = %f\n", x);
			}
			
			else {
				System.out.println("La ecuación tiene dos soluciones reales: ");
				x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.printf("X1 = %f\n", x1);
				System.out.printf("X2 = %f\n", x2);
			}
		}
		
		
	}

}
