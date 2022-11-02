import java.util.Scanner;

public class Actvidad8x04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numN, num, suma;


		System.out.println("ESCRIBE UN NÚMERO : ");
		numN = teclado.nextInt();

		if (numN <= 0) {
			System.out.println("El nuero natural N debe ser positivo");
		}

		else {
			num = 1;
			suma = 0;
			System.out.println("Números Impares menores o iguales que " +
					numN + ": ");
			while (num <= numN) {
				
					System.out.println(num + ", ");
					suma = suma + num;
					num = num + 2;
					
				
				System.out.println("\nSuma de Números Impares menores o iguales que " +
						numN + ": " + suma);	
			}

		}

	}
}