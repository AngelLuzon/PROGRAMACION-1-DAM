import java.util.Scanner;

public class Actividad4x09{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numA, numB, num, suma;

		System.out.println("¿Número Entero A? ");
		numA = teclado.nextInt();
		System.out.println("¿Número Entero B? ");
		numB = teclado.nextInt();
	

		if (numA > numB) {
			System.out.println("El número entero A debe ser menor o igual que el número entero B");

		}

		else {
			num = numA;
			suma = 0;
			System.out.println();

			while (num <= numB) {
				if (num % 2 == 0) {
					System.out.println("Números Pares comprendidos entre " + numA + 
							" y " + numB + ": ");
					suma= suma + num;
				}
				num = num + 1;
			}
			System.out.println("\nSuma de Números Pares comprendidos entre " + 
					numA + " y " + numB + ": " + suma);		
		}
	}
}