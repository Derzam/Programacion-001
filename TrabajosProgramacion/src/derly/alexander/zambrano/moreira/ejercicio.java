package derly.alexander.zambrano.moreira;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Derly Zambrano
		Scanner lector = new Scanner(System.in);
		 int valor =0 , suma = 0, elementos = 1, i = 0;
		float promedio = 0;
		System.out.println("Ingrese un numero entero positivo");
		 valor = lector.nextInt();
		 
		
		while(valor > 0 ) 
		{
		 
			  suma = suma + valor;
				elementos++;
				System.out.println("Ingrese otro numero");
				 valor = lector.nextInt();
				
		}
		
		if(elementos==1) 
		{
			System.out.println("No se puede calcular el promedio");
		}
		else
		{
			promedio = (float) suma/elementos;
			
			System.out.println("La suma total de los numeros es:"+ suma);
			System.out.println("El promedio:"+promedio);
			System.out.println("El total de numeros ingresados es :"+elementos);
	
		}
	
	}

}

