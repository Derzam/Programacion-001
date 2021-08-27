package juego.de.ajedrez;

public class Alfil {

	private String color;
	private String TipoDeMovimientoPermitido;
	private String numeroDeMovimientosEnLaTabla;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoDeMovimientoPermitido() {
		return TipoDeMovimientoPermitido;
	}

	public void setTipoDeMovimientoPermitido(String tipoDeMovimientoPermitido) {
		TipoDeMovimientoPermitido = tipoDeMovimientoPermitido;
	}

	public String getNumeroDeMovimientosEnLaTabla() {
		return numeroDeMovimientosEnLaTabla;
	}

	public void setNumeroDeMovimientosEnLaTabla(String numeroDeMovimientosEnLaTabla) {
		this.numeroDeMovimientosEnLaTabla = numeroDeMovimientosEnLaTabla;
	}

	

	public void moverseDiagonalmente() {

	}

	@Override
	public String toString() {
		return "Alfil [color=" + color + ", TipoDeMovimientoPermitido=" + TipoDeMovimientoPermitido
				+ ", numeroDeMovimientosEnLaTabla=" + numeroDeMovimientosEnLaTabla + "]";
	}
	

}
