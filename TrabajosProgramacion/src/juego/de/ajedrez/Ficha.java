package juego.de.ajedrez;

public  abstract class Ficha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Peon peonNegro = new Peon();
		peonNegro.setColor("Negro");
		peonNegro.setNumeroDeMovimientoEnLaTabla("2 inicial y uno en Adelante");
		peonNegro.setTipoMovimientoPermitido("Diagonal y en linea hacia arriba");
		System.out.println("PeonNegro ");
		System.out.println(peonNegro);

		Alfil alfilNegro = new Alfil();
		alfilNegro.setColor("Negro");
		alfilNegro.setNumeroDeMovimientosEnLaTabla("Todo un rrecorrido en diagonal");
		alfilNegro.setTipoDeMovimientoPermitido("Diagonal");
		System.out.println("Peon Negro");
		System.out.println(alfilNegro);

		Torre torreNegra = new Torre();
		torreNegra.setColor("Negra");
		torreNegra.setNumeroDeMovimientosEnLaTabla(" 8 espacios en linea recta");
		torreNegra.setTipoDeMovimientoPermitido("En linea recta");
		System.out.println("Torre Negra");
		System.out.println(torreNegra);

		Caballo caballoNegro = new Caballo();
		caballoNegro.setColor("Negro");
		caballoNegro.setNumeroDeMovimientoEnLaTabla(" 3 en la Tabla");
		caballoNegro.setTipoMovimientoPermitido("En forma de L");
		System.out.println("Caballo Negro");
		System.out.println(caballoNegro);

		Reina reinaNegra = new Reina();
		reinaNegra.setColor("Negra");
		reinaNegra.setNumeroDeMovimientoEnLaTabla(" Movimientos libres en la Tabla");
		reinaNegra.setTipoMovimientoPermitido("Movimientos librez");
		System.out.println("Reina Negra");
		System.out.println(reinaNegra);

		Rey reyNegro = new Rey();
		reyNegro.setColor("Negro");
		reyNegro.setNumeroDeMovimientoEnLaTabla("Un movimiento en la tabla");
		reyNegro.setTipoMovimientoPermitido("En diagonal");
		System.out.println("Rey Negro");
		System.out.println(reyNegro);

		Ficha tablero[][] = new Ficha[8][8];

		tablero[1][0] = peonNegro;
		tablero[1][1] = peonNegro;
		tablero[1][2] = peonNegro;
		tablero[1][3] = peonNegro;
		tablero[1][4] = peonNegro;
		tablero[1][5] = peonNegro;
		tablero[1][6] = peonNegro;
		tablero[1][7] = peonNegro;

		tablero[0][2] = alfilNegro;
		tablero[0][5] = alfilNegro;

		tablero[0][0] = torreNegra;
		tablero[0][7] = torreNegra;

		tablero[0][1] = caballoNegro;
		tablero[0][6] = caballoNegro;
		tablero[0][3] = reinaNegra;

		tablero[0][4] = reyNegro;
		
		for(int fila =0; fila<8; fila++) {
			for(int columna =0; columna<8; columna++) {
				if (fila == columna) {
				tablero[fila][columna]= reyNegro;
				}else {
					tablero [fila][columna]= reyNegro;
					} 
				
				System.out.print(tablero[fila][columna] + " ");
					
				}
			System.out.println();
			
			};


		System.out.println("Tablero de Ajedrez");

	}

}
