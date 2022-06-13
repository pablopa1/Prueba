package Pruebas.SimuladorHipoteca;

public abstract class Hipoteca {

	float cantidadTotal;
	int anios;
	
	float cuotaAmortizacion;
	float totalAmortizado;
	float porAmortizar;
	
	float cantidadIntereses;
	float anualidad;

	abstract void calculo(float interes);
	
	public float getCantidadTotal() {
		return cantidadTotal;
	}

	public void setCantidadTotal(float cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

	
	public float getCuotaAmortizacion() {
		return cuotaAmortizacion;
	}

	public void setCuotaAmortizacion(float cuotaAmortizacion) {
		this.cuotaAmortizacion = cuotaAmortizacion;
	}

	public float getTotalAmortizado() {
		return totalAmortizado;
	}

	public void setTotalAmortizado(float totalAmortizado) {
		this.totalAmortizado = totalAmortizado;
	}

	public float getPorAmortizar() {
		return porAmortizar;
	}

	public void setPorAmortizar(float porAmortizar) {
		this.porAmortizar = porAmortizar;
	}

	public Hipoteca() {
		
	}

	public float getCantidadIntereses() {
		return cantidadIntereses;
	}

	public void setCantidadIntereses(float cantidadIntereses) {
		this.cantidadIntereses = cantidadIntereses;
	}

	public float getAnualidad() {
		return anualidad;
	}

	public void setAnualidad(float anualidad) {
		this.anualidad = anualidad;
	}

	public Hipoteca(float cantidadTotal, int anios) {
		this.cantidadTotal = cantidadTotal;
		this.anios = anios;
	}


}
