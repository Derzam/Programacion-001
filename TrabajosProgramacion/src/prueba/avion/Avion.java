package prueba.avion;

import java.util.Scanner;

public class Avion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		int filas = 0;
		int columnas = 0;
		
		//Pasajeros VIP
		
		AvionPasajeros andrew = new AvionPasajeros();
		andrew.setNombre("Andrew");
		andrew.setApellido("Garcia");
		andrew.setEdad(20);
		andrew.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Andrew ");
		System.out.println(andrew);
		
		AvionPasajeros deymar = new AvionPasajeros();
		deymar.setNombre("Deymar");
		deymar.setApellido("Valles");
		deymar.setEdad(18);
		deymar.setCodigoDeDescuento("QWIOEO-QWDKLO");
		System.out.println("Deymar ");
		System.out.println(deymar);
		
		AvionPasajeros vanessa = new AvionPasajeros();
		vanessa.setNombre("Vanessa");
		vanessa.setApellido("Mejia");
		vanessa.setEdad(32);
		vanessa.setCodigoDeDescuento("TUCNU-ODMDOMAM");
		System.out.println("Vanessa VIP");
		System.out.println(vanessa);
		
		AvionPasajeros carlos = new AvionPasajeros();
		carlos.setNombre("Carlos");
		carlos.setApellido("Carmona");
		carlos.setEdad(34);
		carlos.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Carlos VIP");
		System.out.println(carlos);
		
		AvionPasajeros karen = new AvionPasajeros();
		karen.setNombre("Karen");
		karen.setApellido("Moran");
		karen.setEdad(40);
		karen.setCodigoDeDescuento("QWIOEO-POVIDEL");
		System.out.println("karen VIP");
		System.out.println(karen);
		
		AvionPasajeros ana = new AvionPasajeros();
		ana.setNombre("Ana");
		ana.setApellido("Martinez");
		ana.setEdad(20);
		ana.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Ana VIP");
		System.out.println(ana);
		
		AvionPasajeros andres = new AvionPasajeros();
		andres.setNombre("Andres");
		andres.setApellido("Cayambe");
		andres.setEdad(20);
		andres.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Andres VIP");
		System.out.println(andres);
		
		AvionPasajeros karla = new AvionPasajeros();
		karla.setNombre("Karla");
		karla.setApellido("Benitez");
		karla.setEdad(20);
		karla.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Karla VIP");
		System.out.println(karla);
		
		AvionPasajeros jandry = new AvionPasajeros();
		jandry.setNombre("Jandry");
		jandry.setApellido("Benitez");
		jandry.setEdad(20);
		jandry.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Jandry VIP");
		System.out.println(jandry);
		
		AvionPasajeros edison = new AvionPasajeros();
		edison.setNombre("Edison");
		edison.setApellido("Cayambe");
		edison.setEdad(20);
		edison.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Edison VIP");
		System.out.println(edison);
		
		//Pasajeros Economicos
		AvionPasajeros andrea = new AvionPasajeros();
		andrea.setNombre("Andrea");
		andrea.setApellido("Cayambe");
		andrea.setEdad(20);
		andrea.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Andrea");
		System.out.println(andrea);
		
		AvionPasajeros caren = new AvionPasajeros();
		caren.setNombre("Karen");
		caren.setApellido("Mejia");
		caren.setEdad(20);
		caren.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Karen");
		System.out.println(caren);
		
		AvionPasajeros alexander = new AvionPasajeros();
		alexander.setNombre("Alexander");
		alexander.setApellido("Cedeño");
		alexander.setEdad(20);
		alexander.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Alexander");
		System.out.println(alexander);
		
		AvionPasajeros janet = new AvionPasajeros();
		janet.setNombre("Janet");
		janet.setApellido("Cayambe");
		janet.setEdad(20);
		janet.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Edison VIP");
		System.out.println(janet);
		
		AvionPasajeros madison = new AvionPasajeros();
		madison.setNombre("Madison");
		madison.setApellido("moreira");
		madison.setEdad(20);
		madison.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Edison VIP");
		System.out.println(edison);
		
		AvionPasajeros sofia = new AvionPasajeros();
		sofia.setNombre("Edison");
		sofia.setApellido("Cayambe");
		sofia.setEdad(20);
		sofia.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Edison VIP");
		System.out.println(sofia);
		
		AvionPasajeros martha = new AvionPasajeros();
		martha.setNombre("Martha");
		martha.setApellido("Cayambe");
		martha.setEdad(20);
		martha.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Martha VIP");
		System.out.println(martha);
		
		AvionPasajeros andreina = new AvionPasajeros();
		andreina.setNombre("Andreina");
		andreina.setApellido("Vaca");
		andreina.setEdad(20);
		andreina.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Andreina");
		System.out.println(andreina);
		
		AvionPasajeros alberto = new AvionPasajeros();
		alberto.setNombre("Alberto");
		alberto.setApellido("Bomba");
		alberto.setEdad(20);
		alberto.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Alberto");
		System.out.println(alberto);
		
		AvionPasajeros alejandra = new AvionPasajeros();
		alejandra.setNombre("Alejandra");
		alejandra.setApellido("Zambrano");
		alejandra.setEdad(20);
		alejandra.setCodigoDeDescuento("QWIOEO-POVIDERL");
		System.out.println("Alejandra");
		System.out.println(alejandra);
		
		System.out.println("Ingrese el numero de asiento en formato matriz");
		
		Avion pasajeros [][]=  new Avion [filas][columnas];
		
		pasajeros[0][0]= andrew;
		pasajeros[0][1]= deymar;
		pasajeros[0][2]= vanessa;
		pasajeros[0][3]= carlos ;
		pasajeros[0][4]= karen;
		pasajeros[0][0]= ana;
		pasajeros[0][1]= andres;
		pasajeros[0][2]= karla;
		pasajeros[0][2]= jandry;
		pasajeros[0][3]= edison;
		
		
		
		
		
		
		


		
		
		

}

}