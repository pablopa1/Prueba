package Pruebas.SimuladorHipoteca;

public class TipoVariable extends Hipoteca{

	public float interesFijo;
	public float interesVariable;
	public float interesTotal;

	public float getInteresVariable() {
		return interesVariable;
	}

	public void setInteresVariable(float interesVariable) {
		this.interesVariable = interesVariable;
	}

	public float getInteresTotal() {
		return interesTotal;
	}

	public void setInteresTotal(float interesTotal) {
		this.interesTotal = interesTotal;
	}

	public float getInteresFijo() {
		return interesFijo;
	}

	public void setInteresFijo(float interesFijo) {
		this.interesFijo = interesFijo;
	}

	public TipoVariable() {

	}

	public TipoVariable(float cantidadTotal, int anios) {
		super(cantidadTotal, anios);
		this.interesFijo = (float)(Math.round(Math.random()*5+1));
		this.cuotaAmortizacion = cantidadTotal/anios;
		this.totalAmortizado = 0;
		this.porAmortizar = cantidadTotal;
	}

	@Override
	public String toString() {
		return "Hipoteca tipo variable ==> cantidad a amortizar: "+cantidadTotal+", años: "+anios+" ,interés: " + interesFijo + " %";
	}

	@Override
	void calculo(float interes) {
		
		float aux = cantidadTotal;
		
		for(int i = 1; i<=anios;i++) {
			this.interesVariable = (float)(Math.random()*1-1);
			this.interesTotal = this.interesFijo + this.interesVariable;
			this.totalAmortizado += this.cuotaAmortizacion;
			this.porAmortizar -= this.cuotaAmortizacion;
			if(porAmortizar<0) {
				this.porAmortizar = 0;
			}
			this.cantidadIntereses = aux*(interes/100);
			this.anualidad = this.cuotaAmortizacion+this.cantidadIntereses;
			aux = porAmortizar;
			System.out.println("Año "+i+" (interés "+this.interesTotal+"%): "
					+ "\n\tCapital por amortizar: "+this.porAmortizar
					+"\n\tTotal amortizado: "+this.totalAmortizado
					+"\n\tIntereses: "+this.cantidadIntereses
					+"\n\tAnualidad: "+this.anualidad);
		}
		
	}

}
