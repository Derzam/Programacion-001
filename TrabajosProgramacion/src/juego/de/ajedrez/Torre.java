package juego.de.ajedrez;

public class Torre extends Tablero {

	private String color;
	private String tipoDeMovimientoPermitido;
	private String numeroDeMovimientosEnLaTabla;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoDeMovimientoPermitido() {
		return tipoDeMovimientoPermitido;
	}

	public void setTipoDeMovimientoPermitido(String tipoDeMovimientoPermitido) {
		this.tipoDeMovimientoPermitido = tipoDeMovimientoPermitido;
	}

	public String getNumeroDeMovimientosEnLaTabla() {
		return numeroDeMovimientosEnLaTabla;
	}

	public void setNumeroDeMovimientosEnLaTabla(String numeroDeMovimientosEnLaTabla) {
		this.numeroDeMovimientosEnLaTabla = numeroDeMovimientosEnLaTabla;
	}

	

	public void moverseEnLineaRectaHaciaArriba() {

	}

	public void moverseEnLineaRectaHaciaAbajo() {

	}

	public void moverseEnLineaRectaHaciaLaderecha() {

	}

	public void moverseEnLineaRectaHaciaLaIzquierda() {

	}

	@Override
	public String toString() {
		return "Torre [color=" + color + ", tipoDeMovimientoPermitido=" + tipoDeMovimientoPermitido
				+ ", numeroDeMovimientosEnLaTabla=" + numeroDeMovimientosEnLaTabla + "]";
	}
	

}
