package Ejercicios.En.Java;

import java.util.Scanner;

public class Bonificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el valor del sueldo");
		int S = teclado.nextInt();
		if (S < 300) {

			System.out.println("Su bonificacion es: 40$"); // SI
		} else {
			System.out.println("Su bonificacion es: 0$"); // NO

		}
	}

}
