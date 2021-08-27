package juego.de.ajedrez;

public class Caballo {
	private String color;
	public String getTipoMovimientoPermitido() {
		return TipoMovimientoPermitido;
	}
	public void setTipoMovimientoPermitido(String tipoMovimientoPermitido) {
		TipoMovimientoPermitido = tipoMovimientoPermitido;
	}
	private String TipoMovimientoPermitido;
	private String numeroDeMovimientoEnLaTabla;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumeroDeMovimientoEnLaTabla() {
		return numeroDeMovimientoEnLaTabla;
	}
	public void setNumeroDeMovimientoEnLaTabla(String numeroDeMovimientoEnLaTabla) {
		this.numeroDeMovimientoEnLaTabla = numeroDeMovimientoEnLaTabla;
	}
	public void recorrerDosEspaciosaLaDerechayUnoHaciaArriba() {
		
	}
	public void recorrerDosEspaciosaLaIzquierdayUnoHaciaAbajo() {
		
	}
	public void recorrerDosEspaciosHaciaArribayUnoALaDerecha() {
		
	}
	public void recorrerDosEspaciosHaciaAbajoyUnoALaIzquierda() {
		
	}
	@Override
	public String toString() {
		return "Caballo [color=" + color + ", TipoMovimientoPermitido=" + TipoMovimientoPermitido
				+ ", numeroDeMovimientoEnLaTabla=" + numeroDeMovimientoEnLaTabla + "]";
	}

}
