package labo1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Web {
	
	//atributuak
	private LinkedList estekatuak;
	private LinkedList gakoak;
	private String izena;
	private int index;
	
	//eraikitzailea
	public Web(String pIzena, int pIndex) {
		this.estekatuak = new LinkedList();
		this.gakoak = new LinkedList();
		this.izena = pIzena;
		this.index = pIndex;
	}
	
	//metodoak
	public static void main(String[] args) {
		try{
			Scanner entrada = new Scanner(new FileReader("src/labo1/Fitxeroak/pld-arcs-1-N.txt"));
			String linea;
			String[] hitzZerrenda;
			String url;
			String web = null;
			String[] webEstekatuak;
			int i = 0;
			while (entrada.hasNext() && i <11) {
				linea = entrada.nextLine();
				hitzZerrenda=linea.split(" -->");
				url=hitzZerrenda[0];
				System.out.println(url);
				if (hitzZerrenda.length!=1) {
					web=hitzZerrenda[1];
					webEstekatuak=web.split(" ");
					int j = 0;
					while(j<=webEstekatuak.length-1) {
						
						System.out.println(webEstekatuak[j]);
						j++;
					}

				}
				
				
			
				
				
				
				i = i + 1;
			}
			entrada.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public void txertatuGako() {
		
	}
	
	public void ezabatuWeb() {
		
	}
	
	public void ezabatuGako() {
		
	}
	
	public void getWebLista(){
		
	}
	
	public void getGakoLista(){
		
	}
}
