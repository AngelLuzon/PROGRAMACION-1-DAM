import java.util.Scanner;

public class Actividad2x08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double importe, rebaja, descuento;
		
		
		System.out.print("¿Importe de la compra: ? ");
		importe = teclado.nextDouble();
		
		if(importe < 0.0) {
			System.out.println("El importe de la compra debe ser positivo.");
		}	

//		else {(importe > 0.0 && importe < 200.0){
//		System.out.printf("Rebaja %f:  0.00 euros ");
//			System.out.printf("Importe con descuento %f: ", importe);
		
			else {
				if(importe < 200.0) {
					rebaja = 0.0;
				}
				else if(importe <= 800.0) {
					rebaja = importe * 0.10;
				}
				else {
					rebaja = importe * 0.15;
				}
				descuento = importe - rebaja;
				System.out.printf("Rebaja: %f.2f euros\n",
								rebaja);
				System.out.printf("Importe con descuento: %.2f euros \n",
								descuento);
				}
			}
		
	}


