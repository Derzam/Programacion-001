package ejercicios.metodos.zambrano;

public class Mail {

	
		public String asunto;
		public String mensaje;
		public String destinatario;

		public Mail() {
			// TODO Auto-generated constructor stub
		}

		public void enviar(String asunto, String mensaje, String destinatario) {
			System.out.println("Se está enviando mail a:");
			System.out.println(destinatario);
			System.out.println("Con asunto:");
			System.out.println(asunto);
			System.out.println("El mensaje es");
			System.out.println(mensaje);
			System.out.println("Se ha enviado el mail correctamente");
		}

		public void borrar(String codigoMail) {
			System.out.println("Se ha eliminado el mail: " + codigoMail);
		}
	}

