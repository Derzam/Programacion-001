package juego.de.ajedrez;

public class Reina {
	private String color;
	private String TipoMovimientoPermitido;
	private String numeroDeMovimientoEnLaTabla;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoMovimientoPermitido() {
		return TipoMovimientoPermitido;
	}

	public void setTipoMovimientoPermitido(String tipoMovimientoPermitido) {
		TipoMovimientoPermitido = tipoMovimientoPermitido;
	}

	public String getNumeroDeMovimientoEnLaTabla() {
		return numeroDeMovimientoEnLaTabla;
	}

	public void setNumeroDeMovimientoEnLaTabla(String numeroDeMovimientoEnLaTabla) {
		this.numeroDeMovimientoEnLaTabla = numeroDeMovimientoEnLaTabla;
	}

	

	public void moverseEnLineaRecta() {

	}

	public void moverseDiagonalmente() {

	}

	public void moverseUnaCasilla() {

	}

	public void moverseVariasCasillas() {

	}

	@Override
	public String toString() {
		return "Reina [color=" + color + ", TipoMovimientoPermitido=" + TipoMovimientoPermitido
				+ ", numeroDeMovimientoEnLaTabla=" + numeroDeMovimientoEnLaTabla + "]";
	}
	

}
