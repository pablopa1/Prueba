package Pruebas.SimuladorHipoteca;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {

			System.out.println("Elija tipo de inter�s (1/2)");
			System.out.println("1. Tipo fijo");
			System.out.println("2. Tipo variable");
			opcion = sc.nextInt();
			if (opcion != 1 && opcion !=2) {
				System.out.println("Introduce una opci�n v�lida");
				System.out.println();
			}
			
		} while (opcion != 1 && opcion != 2);

		System.out.println("Cantidad total a amortizar:");
		float cantidadTotal = sc.nextFloat();

		System.out.println("N�mero de a�os:");
		int anios = sc.nextInt();

		if (opcion == 1) {

			TipoFijo t = new TipoFijo(cantidadTotal, anios);
			t.calculo(t.getInteres());

		} else if (opcion == 2) {

			TipoVariable t = new TipoVariable(cantidadTotal, anios);
			t.calculo(t.getInteresFijo());
		} 

		sc.close();
	}
}
