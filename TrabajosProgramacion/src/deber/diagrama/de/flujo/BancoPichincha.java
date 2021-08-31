package deber.diagrama.de.flujo;

import java.util.Scanner;

public class BancoPichincha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);

		int opcion = 0;
		int valor;
		String clave = "Derzam23";

		do {
			System.out.println("Banco Pichincha seleccione una opcion");
			System.out.println("1- Retirar Dinero");
			System.out.println("2-Cambiar de clave");
			System.out.println("3- Bloquear Cuenta");
			System.out.println("4-Salir");
			System.out.println("****************************************");
			opcion = lector.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese el valor a retirar");
				valor = lector.nextInt();
				System.out.println("El valor a retirar es :" + valor);
			} else if (opcion == 2) {
				System.out.println("Ingrese una nueva clave");
				System.out.println("Su nueva clave es:" + clave);
				clave = lector.nextLine();

			} else if (opcion == 3) {
				System.out.println("Su cuenta ha sido bloqueada");
			}

		} while (opcion != 4);

	}

}
