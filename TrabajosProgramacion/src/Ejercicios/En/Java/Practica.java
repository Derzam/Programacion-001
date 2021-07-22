package Ejercicios.En.Java;

import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese 2 numeros:");  //lectura de teclado 
		int A=teclado.nextInt();
		//System.out.println("Numero ingresado:"+A);
		int B=teclado.nextInt();		
		//System.out.println("Numero ingresado 2:"+B);
		int S=A+B;
		int R=A-B; 
		int P=A*B;
		System.out.println("La Suma es: "+S);
		System.out.println();
		System.out.println("La Resta es: "+R);
		System.out.println("El producto es: "+P);
		
	}

}



