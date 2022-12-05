package bingo;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


public class Bingo75 extends Bingo {

	public Bingo75() {
		super(75);
		
	}

	@Override
	protected void jugar() {
		ArrayList array = new ArrayList(75);
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
		for (int i = 1; i <= 75; i++) {
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


