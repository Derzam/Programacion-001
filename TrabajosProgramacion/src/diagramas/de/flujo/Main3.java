package diagramas.de.flujo;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero de filas ");
		n = teclado.nextInt();
		for (int f = 1; f <= n; f = f + 1) {
			for (int a = 1; a <= f; a = a + 1) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
