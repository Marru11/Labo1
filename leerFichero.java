package labo1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class leerFichero {
	private static String fichero1 = "src/labo1/Fitxeroak/index.txt";
	private static String fichero2 = "src/labo1/Fitxeroak/pld-arcs-1-N.txt";
	
	public static void main (String[] args) {
		try{
			Scanner entrada = new Scanner(new FileReader(fichero1));
			String linea;
			int i = 1;
			while (entrada.hasNext() && i <=10) {
				linea = entrada.nextLine();
				System.out.println(linea);
				i = i + 1;
			}
			entrada.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
