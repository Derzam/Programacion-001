package Trabajos.Grupales;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class grupal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se ingresa por teclado 3 n�meros correspondientes a la fecha de nacimiento de la persona,
		//el primer n�mero es el d�a, el segundo n�mero es el mes y el tercero n�mero es el a�o de nacimiento,
		//de la misma manera se debe ingresar la fecha actual.
		//Se asume que las fechas ingresadas est�n correctas, es decir que son fechas reales.
		//El programa debe calcular la edad de la persona. Ejemplo de la impresi�n final del programa:
		//"Su edad es: 21 a�os, 3 meses, 15 d�as"

	
			
			Scanner Entrada = new Scanner(System.in);
			Calendar cal = new GregorianCalendar();
			
			System.out.println("Calculo de la edad exacta");
			System.out.println("=========================");
			
			System.out.println(">> Ingrese fecha de nacimiento << ");
			int dianacimiento, mesnacimiento, a�onacimiento ;
			System.out.print("Introduzca d�a nacimiento: ");
			dianacimiento=Entrada.nextInt();
			System.out.print("Introduzca mes nacimiento: ");
			mesnacimiento=Entrada.nextInt();						
			System.out.print("Introduzca a�o nacimiento: ");
			a�onacimiento=Entrada.nextInt();
			
			if(a�onacimiento ==0) {									// el �nico a�o que no existe es el 0 //anio % 4 == 0
				System.out.println("Fecha incorrecta");
			}
			else if(mesnacimiento==2 && (dianacimiento>=1 && dianacimiento<=28)) {
				System.out.println(dianacimiento + "/" + mesnacimiento + "/" + a�onacimiento+": Fecha correcta");
			}
			else if((mesnacimiento==4 || mesnacimiento==6 || mesnacimiento==9 || mesnacimiento==11) && (dianacimiento>=1 && dianacimiento<=30)) {
				System.out.println(dianacimiento + "/" + mesnacimiento + "/" + a�onacimiento+": Fecha correcta");
			}
			else if((mesnacimiento==1 || mesnacimiento==3 || mesnacimiento==5 || mesnacimiento==7 || mesnacimiento==8 || mesnacimiento==10 || mesnacimiento==12) && (dianacimiento>=1 && dianacimiento<=31)) {
				System.out.println(dianacimiento + "/" + mesnacimiento + "/" + a�onacimiento+": Fecha correcta");
			}	
			else
				System.out.println("Fecha incorrecta");
				
			System.out.println(">> Ingrese fecha actual << ");
			int diaactual, mesactual, a�oactual ;
			System.out.print("Introduzca d�a actual: ");
			diaactual=Entrada.nextInt();
			System.out.print("Introduzca mes actual: ");
			mesactual=Entrada.nextInt();
			System.out.print("Introduzca a�o actual: ");
			a�oactual=Entrada.nextInt();
			
			if(a�onacimiento==0 || a�oactual==0) {
				System.out.println("Fecha incorrecta");
			}
		
			else if(mesactual==2 && (diaactual>=1 && diaactual<=28)) {
				System.out.println(diaactual + "/" + mesactual + "/" + a�oactual+": Fecha correcta");
			}
			else if((mesactual==4 || mesactual==6 || mesactual==9 || mesactual==11) && (diaactual>=1 && diaactual<=30)) {
				System.out.println(diaactual + "/" + mesactual + "/" + a�oactual+": Fecha correcta");
			}
			else if((mesactual==1 || mesactual==3 || mesactual==5 || mesactual==7 || mesactual==8 || mesactual==10 || mesactual==12) && (diaactual>=1 && diaactual<=31)) {
				System.out.println(diaactual + "/" + mesactual + "/" + a�oactual+": Fecha correcta");
			}	
			else
				System.out.println("Fecha incorrecta"); 
			
			int A=0;
			int M=0;
			int D=0;
			
		
		
			if(a�oactual>=a�onacimiento) {
				A= a�oactual - a�onacimiento;
				System.out.println("A�O:"+A);
			
			}if(mesactual>=mesnacimiento) {
				M= (mesactual - mesnacimiento);
				System.out.println("MES:"+M); 
				
			}else if(mesactual<=mesnacimiento) {
				M= ((mesactual - mesnacimiento)*-1);
				System.out.println("MES:"+M); 
		
			}if (diaactual<=dianacimiento){
				D= ((diaactual+dianacimiento)-29);
				System.out.println("DIAS:"+D); 
			}else if (diaactual>=dianacimiento){
				D= ((diaactual-dianacimiento));
				System.out.println("DIAS:"+D); 
			}
			
			System.out.println("Su edad es: " +A+ " a�os, " +M+ " meses, " +D+ " dias."); 
			
			
		}


	}

