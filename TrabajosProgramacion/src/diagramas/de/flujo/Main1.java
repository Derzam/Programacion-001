package diagramas.de.flujo;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Ingrese un numero");
		n = teclado.nextInt();
		for (int c = n + 1; c <= n + 5; c++) {
			System.out.println("El siguiente numero es:" + c);
		}

	}
}
