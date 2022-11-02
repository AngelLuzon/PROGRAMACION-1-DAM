import java.util.Scanner;

public class Actividad3x05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int ica;

		System.out.print("¿íNDICE DE calidad de aire? ");
		ica = teclado.nextInt();

		if (ica >= 0 && ica <= 500) {
			if (ica <=50) {
				System.out.println("Bueno");
			}

			else if (ica <= 100) {
				System.out.println("Moderado");
			}


			else if (ica <= 150) {
				System.out.println("No saludable para grupos sensibles");
			}


			else if (ica <= 200) {
				System.out.println("No saludable para todos");
			}	

			else if (ica <= 300){
				System.out.println("Insalubre");
			}

		else { 
				System.out.println("Peligroso");
		}

		}
	}
}
