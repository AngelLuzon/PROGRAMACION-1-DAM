import java.util.Scanner;

public class Actividad4x15_2Intento {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		double notateoria,notapracticas,notaexamen;
		double media, suma=0, mediasfinales;
		int contalumnos=1, sumasuspensos=0, alumnosaprobados=10,notafinal=10,sinNotafinal;
		double sumateoria=0, sumapractica=0, sumaexamen=0;
		boolean aprobado=true, error=false, finbucle=false;

		while (contalumnos<=10 ) {

			error= false;

			System.out.println("Nota del alumno " + contalumnos + " en la teoría? ");
			notateoria = teclado.nextDouble();

			if (notateoria>10 || notateoria<0 ) {
				System.out.println("La nota debe estar comprendida entre el 0 y el 10");
				error=true;
			}
			if (error == false) {
				System.out.println("Nota en la teoría: " + notateoria);
			}

			System.out.println("Nota del alumno " + contalumnos + " en las prácticas? ");
			notapracticas =teclado.nextDouble();

			if (notapracticas>10 || notapracticas<0 ) {
				System.out.println("La nota debe estar comprendida entre el 0 y el 10");
				error=true;
			}

			if (error==false) {
				System.out.println("Nota en las prácticas: " + notapracticas);
			}


			System.out.println("Nota del alumno " + contalumnos + " en los exámenes? ");
			notaexamen = teclado.nextDouble();

			if (notaexamen>10 || notaexamen<0 ) {
				System.out.println("La nota debe estar comprendida entre el 0 y el 10");
				error=true;
			}
			if (error==false) {
				System.out.println("Nota en el examen: " + notaexamen);
			}

			media= notateoria*0.3+notapracticas*0.5+notaexamen*0.2;

			System.out.println("La nota final del alumno " + contalumnos + " es igual a " + media );

			if (error==true) {
				notafinal=notafinal-1;
			}

			if (media < 5 ) {
				aprobado = false;
				sumasuspensos++;
				alumnosaprobados=alumnosaprobados-1;
			}
			contalumnos++;
			suma = suma+media;
		}
		finbucle=true;
		if (finbucle==true) {
			mediasfinales=suma/notafinal;
			sinNotafinal = 10-notafinal;
			System.out.println("El total de alumnos con nota final es :" + notafinal);
			System.out.println("El total de alumnos aprobados es :" + alumnosaprobados);
			System.out.println("La media aritmética de alumnos aprobados es :" + mediasfinales);
			System.out.println("El total de alumnos sin nota final es :" + sinNotafinal);
			System.out.println("El total de alumnos suspendidos es :" + sumasuspensos);
		}

	}

}