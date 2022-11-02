import java.util.Scanner;
	public class Actividad3x09 {
		public static void main(String[] args){
			Scanner teclado = new Scanner(System.in);
			
//			3 numeros reales
			double numA,numB, numC;
//			saber cual es el mínimo y el mayor
			
			System.out.print("¿Número Real  A? ");
			numA = teclado.nextDouble();
			System.out.print("¿Número Real B? ");
			numB = teclado.nextDouble();	
			System.out.print("¿Número Real C? ");
			numC = teclado.nextDouble();
//			<
			if (numA < numB) {
				System.out.print(numA + " < " + numB);
//				< <
				if (numC < numB) {
					System.out.print(" > " + numC);
//					< >
				}
				else {
					System.out.print(" < " + numC);
				}
			}
//			>
			else {
				System.out.print(numA + " > " + numB);
			
//			> >
				if (numC > numB) {
					System.out.print(" < " + numC);
				}
//				> <
				else {
				System.out.print(" > " + numC);
				}
			 	
			}	
			
			
		}
	
	
		

}
