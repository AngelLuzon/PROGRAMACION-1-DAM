import java.util.Scanner;

public class Actividad2x05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.print("¿Número real 1?: ");
		num1 = teclado.nextDouble();
		System.out.print("¿Número real 2?: ");
		num2 = teclado.nextDouble();
		System.out.print("¿Número real 3?: ");
		num3 = teclado.nextDouble();
		teclado.close();
		if(num1 > num2 && num1 > num3) {
			System.out.printf("El numero real %f es el mayor.\n ",
							num1);
		}
		else if(num2 > num1) {
			System.out.printf("El numero real %f es el mayor.\n ",
							num2);
			
		}
		else {
			System.out.printf("El numero real %f es el mayor.\n ",
							num3);
		}
		
	}

}
