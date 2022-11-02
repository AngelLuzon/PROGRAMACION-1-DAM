import java.util.Scanner;

public class Actividad3x02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		//Leer un numero entero del 1-12 que sea el mes
		int diasMes;
		
		System.out.println("¿Mes? ");
		diasMes = teclado.nextInt();
		
			switch(diasMes) {
			case 1:
				System.out.println("31 días");
				break;
			case 2:
				System.out.println("28 días");
				break;
			case 3:
				System.out.println("31 días");
				break;
			case 4:
				System.out.println("30 días");
				break;
			case 5:
				System.out.println("31 días");
				break;
			case 6:
				System.out.println("30 días");
				break;
			case 7:
				System.out.println("31 días");
				break;
			case 8:
				System.out.println("31 días");
				break;
			case 9:
				System.out.println("30 días");
				break;
			case 10:
				System.out.println("31 días");
				break;
			case 11:
				System.out.println("30 días");
				break;
			case 12:
				System.out.println("31 días");
				break;
			default:
				System.out.println("El mes debe estar comprendido entre el 1 y 12");
			}
	}

}
