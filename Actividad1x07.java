import java.util.Scanner;

public class Actividad1x07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double radio, altura, volumen;
		System.out.println("Escribe radio y altura del cilindro");
		System.out.print("Dame el valor del radio: ");
		radio = teclado.nextDouble();
		System.out.print("Dame el valor de la altura: ");
		altura = teclado.nextDouble();
		
//		Pi = 3.14159265359
//		Formula V= Pi*r^2*h
		volumen = (3.14159265359 * radio)* altura;
		
//		double Volumen = Math.round(volumen * 100.0)/ 100.0;
		System.out.printf("volumen  = %.2f\n", volumen);
		
		System.out.println();
//		System.out.println("Volumen: " + Volumen + " metros cúbicos");
		
		
	
	}

}
