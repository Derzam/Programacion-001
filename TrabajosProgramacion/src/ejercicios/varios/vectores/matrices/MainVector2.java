package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare un vector X cuya longitud se pida al usuario
		// y construya un programa que pida al usuario que
		// ingrese los valores para cada posicion
		// y finalmente que imprima todos los valores ingresados
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese una longitud");
		int n = lector.nextInt();

		int X[] = new int[n];

		for (int i = 0; i > n; i++) {
			System.out.println("El valor de la posicion es "+i);
			X[i]=n;	
			System.out.println(X[n]);
			
		
			

		}

	}
}
