package derly.alexander.zambrano.moreira;

import java.util.Scanner;

public class ejercicio2 { 
	// Crear un programa que solicite ingresar un numero(solo psoitivos)
			//, y asi seguira solicitando ingresar un numero hasta que se ingrese el 
			//numero (-1) cuando se ingrese el numero -1 , ya no solcitara mas numeros y en ese momento
			//el programa debera imprimir  la suma los numeros pares ingresados y el promedio solo de 
			// numeros impares ingresados hasta el momento.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calculo de suma");
		System.out.println("--------Universidad Central del Ecuador---------");
		Scanner lector = new Scanner(System.in);
		
		int n = 0, sumapar = 0, elementosimpar = 0, sumaimpar = 0;
		float promedioimpar = 0;

		do
		{
			System.out.println("Ingrese un numero: ");
			n = lector.nextInt();
			if(n%2==0) {
				sumapar= (sumapar+n);
			}else  {
				elementosimpar++;
				sumaimpar = (sumaimpar + n);
				promedioimpar = (float) sumaimpar/elementosimpar;
			}
		
		}while(n !=-1 ) ;
		
		System.out.println("La suma total de los numeros pares es:"+ sumapar);
		System.out.println("El promedio de los numeros impares es  :"+promedioimpar);
}



	}


