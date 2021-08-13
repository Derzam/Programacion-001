package ejercicios.metodos.zambrano;

public class CuentaJuegos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mail juego1 = new Mail();
		Mail juego2= new Mail();
		
		juego1.enviar("Apertura de Cuenta Steam", "Creacion de cuenta en proceso", "arkalegion123@gmail.com");
		juego1.borrar("arkalegion123@gmail.com");
		System.out.println("Ha ocutrrido un error con el correo");
		
		System.out.println("*********************************");
		
	
		System.out.println("Ingrese una nueva direccion de correo");
		juego2.enviar("Apertura de Cuenta Steam", "Creacion de cuenta en proceso", "maxrocket01@gmail.com");
		System.out.println("Cuenta creada exitosamente");
		
		
		
		

	}

}
