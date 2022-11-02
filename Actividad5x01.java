import java.util.Scanner;

public class Actividad5x01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int altura, anchura, i, j;
		boolean dimensionesValidas;
		
		System.out.println("¿Altura del Rectángulo? ");
		altura = teclado.nextInt();
		System.out.println("¿Anchura del Rectángulo? ");
		anchura = teclado.nextInt();
		
		dimensionesValidas = true;
		
		if (altura<= 0) {
			System.out.println("La altura del rectángulo debe ser positiva");
			dimensionesValidas = false;
		}
		
		if (anchura <= 0) {
			System.out.println("La anchura del rectángulo debe ser positiva");
			dimensionesValidas = false;
		}
		
		if(dimensionesValidas) {
//			cada linea
			for(i = 1 ; i <= altura ; i++) {
//				cada columna
				for(j = 1 ; j <= anchura ; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}

}
