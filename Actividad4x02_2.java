import java.util.Scanner;
public class Actividad4x02_2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num = 6;
		
		do {
		 		
			System.out.print("Escribe un número (1-5 para salir): ");
			num = teclado.nextInt();
		
		}while (num <1 || num >5);
		
		System.out.print("Programa finalizado");
	}
}
