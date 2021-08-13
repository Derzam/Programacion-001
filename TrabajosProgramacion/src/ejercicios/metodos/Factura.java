package ejercicios.metodos.zambrano;

public class Factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		
		Mail mail1 = new Mail();
		Mail mail2 = new Mail();
		
		mail1.enviar("Boleteria de CINEMAX", "Ha comprado los boletos exitosamente CINEMAX", "derlymoreira192@gmail.com");
		System.out.println("Factura generada exitosamente");
		mail1.borrar("derlymoreira192@gmail.com");
		
		System.out.println("Ingrese una nueva direccion de correo");
		
		System.out.println("*************************");

		mail2.enviar("Notas de semestre", "Usted ha aprobado la carrera ", "marlontorres123@gmail.com");
		System.out.println("Comprobante generado exitosamente");
		


	}

}
