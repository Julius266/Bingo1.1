package bingo;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Bingo bingo90 = new Bingo90();
		bingo90.jugar(); 
		
		Bingo bingo75 = new Bingo75();
		bingo75.jugar();
		
	}

}

