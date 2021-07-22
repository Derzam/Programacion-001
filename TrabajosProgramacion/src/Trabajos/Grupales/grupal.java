package Trabajos.Grupales;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class grupal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se ingresa por teclado 3 números correspondientes a la fecha de nacimiento de la persona,
		//el primer número es el día, el segundo número es el mes y el tercero número es el año de nacimiento,
		//de la misma manera se debe ingresar la fecha actual.
		//Se asume que las fechas ingresadas están correctas, es decir que son fechas reales.
		//El programa debe calcular la edad de la persona. Ejemplo de la impresión final del programa:
		//"Su edad es: 21 años, 3 meses, 15 días"

	
			
			Scanner Entrada = new Scanner(System.in);
			Calendar cal = new GregorianCalendar();
			
			System.out.println("Calculo de la edad exacta");
			System.out.println("=========================");
			
			System.out.println(">> Ingrese fecha de nacimiento << ");
			int dianacimiento, mesnacimiento, añonacimiento ;
			System.out.print("Introduzca día nacimiento: ");
			dianacimiento=Entrada.nextInt();
			System.out.print("Introduzca mes nacimiento: ");
			mesnacimiento=Entrada.nextInt();						
			System.out.print("Introduzca año nacimiento: ");
			añonacimiento=Entrada.nextInt();
			
			if(añonacimiento ==0) {									// el único año que no existe es el 0 //anio % 4 == 0
				System.out.println("Fecha incorrecta");
			}
			else if(mesnacimiento==2 && (dianacimiento>=1 && dianacimiento<=28)) {
				System.out.println(dianacimiento + "/" + mesnacimiento + "/" + añonacimiento+": Fecha correcta");
			}
			else if((mesnacimiento==4 || mesnacimiento==6 || mesnacimiento==9 || mesnacimiento==11) && (dianacimiento>=1 && dianacimiento<=30)) {
				System.out.println(dianacimiento + "/" + mesnacimiento + "/" + añonacimiento+": Fecha correcta");
			}
			else if((mesnacimiento==1 || mesnacimiento==3 || mesnacimiento==5 || mesnacimiento==7 || mesnacimiento==8 || mesnacimiento==10 || mesnacimiento==12) && (dianacimiento>=1 && dianacimiento<=31)) {
				System.out.println(dianacimiento + "/" + mesnacimiento + "/" + añonacimiento+": Fecha correcta");
			}	
			else
				System.out.println("Fecha incorrecta");
				
			System.out.println(">> Ingrese fecha actual << ");
			int diaactual, mesactual, añoactual ;
			System.out.print("Introduzca día actual: ");
			diaactual=Entrada.nextInt();
			System.out.print("Introduzca mes actual: ");
			mesactual=Entrada.nextInt();
			System.out.print("Introduzca año actual: ");
			añoactual=Entrada.nextInt();
			
			if(añonacimiento==0 || añoactual==0) {
				System.out.println("Fecha incorrecta");
			}
		
			else if(mesactual==2 && (diaactual>=1 && diaactual<=28)) {
				System.out.println(diaactual + "/" + mesactual + "/" + añoactual+": Fecha correcta");
			}
			else if((mesactual==4 || mesactual==6 || mesactual==9 || mesactual==11) && (diaactual>=1 && diaactual<=30)) {
				System.out.println(diaactual + "/" + mesactual + "/" + añoactual+": Fecha correcta");
			}
			else if((mesactual==1 || mesactual==3 || mesactual==5 || mesactual==7 || mesactual==8 || mesactual==10 || mesactual==12) && (diaactual>=1 && diaactual<=31)) {
				System.out.println(diaactual + "/" + mesactual + "/" + añoactual+": Fecha correcta");
			}	
			else
				System.out.println("Fecha incorrecta"); 
			
			int A=0;
			int M=0;
			int D=0;
			
		
		
			if(añoactual>=añonacimiento) {
				A= añoactual - añonacimiento;
				System.out.println("AÑO:"+A);
			
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
			
			System.out.println("Su edad es: " +A+ " años, " +M+ " meses, " +D+ " dias."); 
			
			
		}


	}

