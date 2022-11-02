import java.util.Scanner;

public class Actividad2x06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tiempoSegundos;
		int horas ,minutos, segundos;
		
		System.out.print("¿Tiempo en Segundos?: ");
		tiempoSegundos = teclado.nextInt();
		teclado.close();
		if(tiempoSegundos < 0) {
			System.out.println("El tiempo en segundos debe ser mayor o igual que");
		}
		
		else {
			horas = tiempoSegundos / 3600;
			minutos = (tiempoSegundos - horas * 3600) / 60;
			segundos = (tiempoSegundos - horas * 3600) - minutos * 60;
			System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos");
		}
		
	}

}



