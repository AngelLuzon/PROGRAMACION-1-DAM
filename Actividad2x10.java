import java.util.Scanner;

public class Actividad2x10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int diaSemana;
		
		System.out.print("¿Día de la semana?: " );
		diaSemana = teclado.nextInt();
		
		teclado.close();
		switch(diaSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("El día de la semana debe estar comprendido entre el 1 y 7");
		}
	}

}
