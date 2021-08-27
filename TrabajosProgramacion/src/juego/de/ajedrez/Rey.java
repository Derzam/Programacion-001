package juego.de.ajedrez;

public class Rey extends Tablero {

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

	public void moverseDiagonalmenteUnEspacio() {

	}

	public void moverseUnEspacio() {

	}

	@Override
	public String toString() {
		return "Rey [color=" + color + ", TipoMovimientoPermitido=" + TipoMovimientoPermitido
				+ ", numeroDeMovimientoEnLaTabla=" + numeroDeMovimientoEnLaTabla + "]";
	}
	

}
