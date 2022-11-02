import java.util.Scanner;

public class Actividad2x03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num, result, cuadrado;
		System.out.print("Escribe un número real: ");	
		num = teclado.nextDouble();
		teclado.close();
		result = Math.sqrt(num);
		cuadrado = num * num;
		if(num>0) {
//			Si escribo println escribe decimal con .
//			Si escribo printf escribe decimal con ,
			System.out.println("Raíz Cuadrada de " + num + " = " + result);
			System.out.println("Cuadrado de " + num + " = " + cuadrado);
		}
		
		else if(num<0) {
			System.out.println(num + " = es negativo, debe ser 0 o positivo ");
		}	
		else {
			System.out.println("Raíz Cuadrada de " + num + " = " + result);
			System.out.println("Cuadrado de " + num + " = " + cuadrado);
		}
	}

}
