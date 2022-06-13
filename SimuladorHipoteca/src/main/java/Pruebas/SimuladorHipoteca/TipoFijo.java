package Pruebas.SimuladorHipoteca;

public class TipoFijo extends Hipoteca{

	public float interes;
	
	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}

	public TipoFijo() {

	}

	public TipoFijo(float cantidadTotal, int anios) {
		super(cantidadTotal, anios);
		this.interes = (float)(Math.round(Math.random()*5+1));
		this.cuotaAmortizacion = cantidadTotal/anios;
		this.totalAmortizado = 0;
		this.porAmortizar = cantidadTotal;
	}

	@Override
	public String toString() {
		return "Hipoteca tipo fijo ==> cantidad a amortizar: "+cantidadTotal+", años: "+anios+" ,interés: " + interes + " %";
	}

	@Override
	void calculo(float interes) {
		
		float aux = cantidadTotal;
		
		for(int i = 1; i<=anios;i++) {
			this.totalAmortizado += this.cuotaAmortizacion;
			this.porAmortizar -= this.cuotaAmortizacion;
			if(porAmortizar<0) {
				this.porAmortizar = 0;
			}
			this.cantidadIntereses = aux*(interes/100);
			this.anualidad = this.cuotaAmortizacion+this.cantidadIntereses;
			aux = porAmortizar;
			System.out.println("Año "+i+" (interés "+this.interes+"%): "
					+ "\n\tCapital por amortizar: "+this.porAmortizar
					+"\n\tTotal amortizado: "+this.totalAmortizado
					+"\n\tIntereses: "+this.cantidadIntereses
					+"\n\tAnualidad: "+this.anualidad);
		}
		
	}

}
