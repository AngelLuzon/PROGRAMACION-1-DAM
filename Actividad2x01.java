import java.util.Scanner;

public class Actividad2x01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Escribe un número entero: ");	
		num = teclado.nextInt();
		teclado.close();
		if(num%2==0) {
		System.out.println("El número: " + num + " es par");
//		código si es par
		}
		else {
		System.out.println("El número: " + num + " es impar");	
		
		}
	}

}
