package Pruebas.SimuladorHipoteca;

import java.util.Scanner;
 
public class Main {
    public static void main( String[] args ){
    	  	
    	Scanner sc = new Scanner(System.in);
        System.out.println( "Elija tipo de interés (1/2)" );
        System.out.println("1. Tipo fijo");
        System.out.println("2. Tipo variable");
        int opcion = sc.nextInt();
        
        System.out.println("Cantidad total a amortizar:");
        float cantidadTotal = sc.nextFloat();
        
        System.out.println("Número de años:");
        int anios = sc.nextInt();
        
        if (opcion == 1) { 
        	
        	TipoFijo t = new TipoFijo(cantidadTotal,anios);
        	t.calculo(t.getInteres());
        	
        } else if (opcion == 2) {
        	
        	TipoVariable t = new TipoVariable(cantidadTotal,anios);
        	t.calculo(t.getInteresFijo());
        }
        
        sc.close();
    }
}
