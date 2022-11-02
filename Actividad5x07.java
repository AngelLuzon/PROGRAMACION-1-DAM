import java.util.Scanner;

public class Actividad5x07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numA, numB, i, j;
		boolean numValido;
		
		System.out.println("Número natural A: ");
		numA = teclado.nextInt();
		System.out.println("Número natural B: ");
		numB = teclado.nextInt();
		
		numValido = true;
		
		if(numA > numB) {
			System.out.println();
			numValido = false;
		}
		if(numValido) {
			for(i = numA ; i <= numB ; i++) {
				System.out.println("Ta");
				
				for(j = 0 ; j <= 10 ; j++) {
					System.out.printf("%3d * %3d = %3d\n",
							i, j, i* j);
				}
				System.out.println();
			}
		}
		
		
		
		
	
	}

		
	
	
}
