package labo1;

import java.util.ArrayList;

public class Gako {
	
	//atributuak
	private String gakoa;
	private ArrayList<Web> webLista;
	
	//eraikitzailea
	public Gako (String pGakoa) {
		this.gakoa = pGakoa;
		this.webLista = new ArrayList<Web>();
	}
	
	//metodoak
	public ArrayList<Web> getWebLista(){
		return this.webLista;
	}
}
