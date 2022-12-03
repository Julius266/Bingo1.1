package bingo;

import java.util.Scanner;
import java.util.ArrayList;

public class Tablero {

	private ArrayList<Bola> tablero;
	int x;
	boolean band = true;
	public Tablero() {
		this.tablero = new ArrayList<Bola>();
	}

	
	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese los numeros de la tabla: ");
		x = sc.nextInt();
		
		System.out.println("Inicializando bingo de " + x + "PELOTAS");
		int valorBola = 1;
		

		if (x == 90) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				tablero.add(new Bola(valorBola - 1, valorBola + "", false));
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
				}	
				System.out.println("\n");
			}
		} 
		else if (x == 75){
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					tablero.add(new Bola(valorBola - 1, valorBola + "", false));
					System.out.print(getBola(valorBola - 1) + "\t");
					valorBola++;
					}	
				System.out.println("\n");
				}
			} 
		else {
			System.out.println("Opcion Incorrecta");
		}
}		

	
	
	public void imprimirTablero(Bola bola) {
		
		bola.setValor("[" + bola.getValor() + "]");
		tablero.set(bola.getPosition(), bola);
		int valorBola = 1;
		
		
		if(x == 90) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
		System.out.println("Última bola random: " + bola);
	}
		else if(x == 75) {
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(getBola(valorBola - 1) + "\t");
					valorBola++;
				}
				System.out.println("\n");
			}
			System.out.println("Última bola random: " + bola);
		}
		}
	


	public Bola getBola(int position) {
		return tablero.get(position);
	}

	public ArrayList<Bola> getTablero() {
		return tablero;
	}

	public void setTablero(ArrayList<Bola> tablero) {
		this.tablero = tablero;
	}

	
	
}
