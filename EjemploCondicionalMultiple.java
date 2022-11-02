import java.util.Scanner;

public class EjemploCondicionalMultiple {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dato;
		System.out.println("Dime un número: ");
		dato = teclado.nextInt();
		teclado.close();
		switch(dato) {
			case 1:
				System.out.println("El número es 1");
				break;
			case 2:
				System.out.println("El número es 2");
				break;
			case 3:
				System.out.println("El número es 3");
				break;
			default:
				System.out.println("El número es menor que 1 o mayor que 3");
		}

	}

}
