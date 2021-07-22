package diagramas.de.flujo;

import java.util.Scanner;

public class Mainfiginv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el número de filas:");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();

		for (int f = 1; f <= n; f++) {

			for (int a = n; a >= f; a--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
