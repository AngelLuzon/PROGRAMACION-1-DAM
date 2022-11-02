import java.util.Scanner;

public class Actividad5x02 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		int altura, i, j;
		boolean dimensionesValidas;
		
		System.out.println("¿Altura del Triángulo? ");
		altura = teclado.nextInt();
		
		dimensionesValidas = true;
		
		if (altura<= 0) {
			System.out.println("La altura del rectángulo debe ser positiva");
			dimensionesValidas = false;
		
		}
		
		
		if(dimensionesValidas) {
//			cada linea
			for(i = 1 ; i <= altura ; i++) {
				for(j = 1 ; j <= i ; j++) {
					System.out.print('*');
				}
				System.out.println();	
			}
			
		}
	}

}
