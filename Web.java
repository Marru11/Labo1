package labo1;

import java.util.ArrayList;

public class Web {
	
	//atributuak
	private ArrayList<Web> estekatuak;
	private ArrayList<Gako> gakoak;
	private String izena;
	private int index;
	
	//eraikitzailea
	public Web(String pIzena, int pIndex) {
		this.estekatuak = new ArrayList<Web>();
		this.gakoak = new ArrayList<Gako>();
		this.izena = pIzena;
		this.index = pIndex;
	}
	
	//metodoak
	public void txertatuWeb() {
		
	}

	public void txertatuGako() {
		
	}
	
	public void ezabatuWeb() {
		
	}
	
	public void ezabatuGako() {
		
	}
	
	public ArrayList<Web> getWebLista(){
		return this.estekatuak;
	}
	
	public ArrayList<Gako> getGakoLista(){
		return this.gakoak;
	}
}
