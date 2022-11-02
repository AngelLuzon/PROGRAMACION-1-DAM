import java.util.Scanner;
public class Actividad4x15 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		double notaTeoria, notaProblemas, notaPracticas, notaFinal, contador, sumaNotaFinal = 0.0;
		
		System.out.print("¿Nota de Teoría? ");
		notaTeoria = teclado.nextDouble();
		System.out.print("¿Nota de Problemas? ");
		notaProblemas = teclado.nextDouble();
		System.out.print("¿Nota de Practicas? ");
		notaPracticas = teclado.nextDouble();

		
		for ( contador = 1 ; contador == 10 ; contador++) {
			System.out.println(" ");
		
		
			if (notaTeoria < 0 || notaTeoria > 10) {
				System.out.println("La nota de teoría debe estar comprendida entre 0 y 10");
				
			}
			
			else if (notaProblemas < 0 || notaProblemas > 10) {
				System.out.println("La nota de problemas debe estar comprendida entre 0 y 10");
			
			}
			
			else if (notaPracticas < 0 || notaPracticas > 10) {
				System.out.println("La nota de practicas debe estar comprendida entre 0 y 10");
				
			}	
			
			else {
				System.out.printf("Nota de Teoría: %.2f\n" , notaTeoria);
				System.out.printf("Nota de Problemas: %.2f\n" , notaProblemas);
				System.out.printf("Nota de Prácticas: %.2f\n" , notaPracticas);
	//			notaTeoria = notaTeoria * 0.3; notaProblemas = notaProblemas * 0.2; notaPracticas = notaPracticas * 0.5;
				notaFinal = ((notaTeoria * 0.3) + (notaProblemas * 0.2 )+ (notaPracticas * 0.5));
				System.out.printf("Nota final = %.2f\n" , notaFinal);
			
			
			}
//		sumaNotaFinal = 
		
//		System.out.printf("Alumnos con nota final ");
//		System.out.printf("Suma de Notas Finales %2.f" , sumaNotaFinal);
//		System.out.println("Media Aritmética de Notas Finales: ");
		}
	}

}
