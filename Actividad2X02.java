import java.util.Scanner;

public class Actividad2X02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Escribe un número entero: ");	
		num = teclado.nextInt();
		teclado.close();
		if(num>0) {
			System.out.println(num + " = es positvo ");
		}
		else if(num<0) {
			System.out.println(num + " = es negativo ");
		}
//		solo else sin grupo pq sino sobra informacion y sale error
		else{
			System.out.println(num + " = es neutro ");
		}	
	}

}
