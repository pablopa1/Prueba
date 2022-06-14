package Pruebas.SimuladorHipoteca;

import java.util.Scanner;
 
public class Main {
    public static void main( String[] args ){
    	  	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Cambio para probar rama");
        System.out.println( "Elija tipo de interï¿½s (1/2)" );
        System.out.println("1. Tipo fijo");
        System.out.println("2. Tipo variable");
        int opcion = sc.nextInt();
        
        System.out.println("Cantidad total a amortizar:");
        float cantidadTotal = sc.nextFloat();
        
        System.out.println("Nï¿½mero de aï¿½os:");
        int anios = sc.nextInt();
        
        do {
	        if (opcion == 1) { 
	        	
	        	TipoFijo t = new TipoFijo(cantidadTotal,anios);
	        	t.calculo(t.getInteres());
	        	
	        } else if (opcion == 2) {
	        	
	        	TipoVariable t = new TipoVariable(cantidadTotal,anios);
	        	t.calculo(t.getInteresFijo());
	        } else {
	        	
	        	System.out.println("Introduce una opción válida");
	        	System.out.println();
	        	
	        }
        }while (opcion!=1 && opcion !=2);
        
        sc.close();
    }
}
