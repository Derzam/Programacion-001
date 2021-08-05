package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Declare una matriz de A [3][4] de tipo char y desarrolle
		// un programa que vaya solicitando cada una de sus posiciones

		Scanner lector = new Scanner(System.in);

		char A[][] = new char[3][4];

		for (int fila = 0; fila < 3; fila++) {

			for (int columna = 0; columna < 4; columna++) {
				System.out.println("Ingrese el valor fila:" + fila + "columna: " + columna);

				char n = lector.next().charAt(0);

				A[fila][columna] = n;
			}
		}

		for (int fila = 0; fila < 3; fila++) {

			for (int columna = 0; columna < 4; columna++) {
				System.out.println("El valor de la fila: "+ fila + " y columna"+columna+ "es: "+ A[fila][columna] );

			}

		}
	}
}
