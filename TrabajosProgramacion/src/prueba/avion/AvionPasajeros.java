package prueba.avion;

public class AvionPasajeros extends Avion {

	public String nombre;
	public String apellido;
	public int edad;
	public String codigoDeMembresia;
	public String codigoDeDescuento;

	public String getCodigoDeMembresia() {
		return codigoDeMembresia;
	}

	public void setCodigoDeMembresia(String codigoDeMembresia) {
		this.codigoDeMembresia = codigoDeMembresia;
	}

	public String getCodigoDeDescuento() {
		return codigoDeDescuento;
	}

	public void setCodigoDeDescuento(String codigoDeDescuento) {
		this.codigoDeDescuento = codigoDeDescuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "AvionPasajeros [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", codigoDeMembresia="
				+ codigoDeMembresia + ", codigoDeDescuento=" + codigoDeDescuento + "]";
	}
	

}
