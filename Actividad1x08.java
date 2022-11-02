import java.util.Scanner;

public class Actividad1x08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double velocidadInicial, aceleracionCohete, tiempo, distancia;
		System.out.println("Escribe la velocidad inicial, la aceleración y el tiempo");
		System.out.print("¿Velocidad Inicial (en mentros/segundo)? ");
		velocidadInicial = teclado.nextDouble();
		System.out.print("¿Aceleración (en metros/segundos*segundo)? ");
		aceleracionCohete = teclado.nextDouble();
		System.out.print("¿Tiempo transcurrido (en segundos)? ");
		tiempo = teclado.nextDouble();
		
		distancia = (velocidadInicial * tiempo) + (1/2 * aceleracionCohete) * (tiempo * tiempo);
		double Distancia = Math.round(distancia * 1000.0)/ 1000.0;
		
		System.out.println();
		System.out.print("Distancia recorrida: " + Distancia + " metros");

	}

}
