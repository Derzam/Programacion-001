package juego.de.ajedrez;

public class Peon extends Tablero {

	private String color;
	private String TipoMovimientoPermitido;
	private String numeroDeMovimientoEnLaTabla;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoMovimiento() {
		return TipoMovimientoPermitido;
	}

	public void setTipoMovimientoPermitido(String tipoMovimientoPermitido) {
		TipoMovimientoPermitido = tipoMovimientoPermitido;
	}

	public String getNumeroDeMovimiento() {
		return numeroDeMovimientoEnLaTabla;
	}

	public void setNumeroDeMovimientoEnLaTabla(String numeroDeMovimientoEnLaTabla) {
		this.numeroDeMovimientoEnLaTabla = numeroDeMovimientoEnLaTabla;
	}

	public void moverseUnaCasilla() {

	}

	public void moverseDosCasillas() {

	}

	public void matarFichaEnDiagonal() {

	}

	@Override
	public String toString() {
		return "Peon [color=" + color + ", TipoMovimientoPermitido=" + TipoMovimientoPermitido
				+ ", numeroDeMovimientoEnLaTabla=" + numeroDeMovimientoEnLaTabla + "]";
	}

}
