package bingo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bingo90 extends Bingo {

	public Bingo90() {
		super(90);
	}

	@Override
	protected void jugar() {
		ArrayList array = new ArrayList(90);
		Scanner sc = new Scanner(System.in);
		int times = 1;
		getTablero().inicializar();
		while (times != 91) {
			System.out.println("Pulse una tecla para generar la bola:");
			String x = sc.next();
			while(true) {
				Bola bola = new Bola();
				bola = sacarBola();
				if (array.contains(bola.getValor())) {
					continue;
				} else {
					array.add(bola.getValor());
					getTablero().imprimirTablero(bola);
					times++;
					break;
					
				}
			}
		}
		
		for (int i = 1; i <= 90; i++) {
			System.out.println("Pulse enter para sacar bola..");
			Bola bola = new Bola();
			try {
				System.in.read();
				bola = sacarBola();
			} catch (IOException e) {
				e.printStackTrace();
			}
			getTablero().imprimirTablero(bola);
		}

	}

}
