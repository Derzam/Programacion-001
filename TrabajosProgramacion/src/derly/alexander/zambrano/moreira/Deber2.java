package derly.alexander.zambrano.moreira;

import java.util.Scanner;

public class Deber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un programa que solicite ingresar un numero(solo psoitivos)
		//, y asi seguira solicitando ingresar un numero hasta que se ingrese el 
		//numero (-1) cuando se ingrese el numero -1 , ya no solcitara mas numeros y en ese momento
		//el programa debera imprimir  la suma los numeros pares ingresados y el promedio solo de 
		// numeros imopares ingresados hasta el momento.
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Programa de prueba");
		System.out.println("------Universidad Central del Ecuador");
		
		int sumap = 0, n=0 , sumai = 0, elementosimpar = 0;
		float promedio;
		
		sumap = sumap + n;
		sumai = sumai + n;
		elementosimpar++;
		promedio = sumai/elementosimpar;
		
		
		
		boolean romper = true;
		while(n != -1) {
		for(int i = 1; i!=-1; i++) {
			System.out.println("Ingrese un numero entero solo positivo");
			n = lector.nextInt();
			
			
			if (n%2==0) {
			sumap= sumap + n;
				
			}else {
				sumai = sumai + n;
				elementosimpar++;
				promedio = sumai/elementosimpar;
				
				
				System.out.println("La suma de numeros pares es:"+sumap);
				System.out.println("El promedio de numeros impares es:"+promedio);
				
				
				
				
	

}
	}
}
	}
}





