package labo1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class WebKatalogo {
	
	//atributuak
	private static WebKatalogo nireWebKatalogo;
	private HashMap<String, Web> webLista;
	
	//eraikitzailea
	private WebKatalogo() {
		this.webLista = new HashMap<String, Web>();
	}
	
	//metodoak
	public static WebKatalogo getNireWebKatalogo() {
		if(nireWebKatalogo == null) {
			nireWebKatalogo = new WebKatalogo();
		}
		return nireWebKatalogo;
	}
	
	public void datuakKargatu() {
		try{
			Scanner lerroa = new Scanner(new FileReader("index.txt"));
			String[] hitzZerrenda;
			String url;
			String indizea;
			Web web;
			while (lerroa.hasNext()) {
				hitzZerrenda = lerroa.nextLine().split(" ");
				url = hitzZerrenda[0];
				indizea = hitzZerrenda[1];
				web = new Web(url,indizea);
				this.webLista.put(url, web);
			}
			lerroa.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void txertatuWeb(Web pWeb) {
		this.webLista.put(pWeb.getIzena(), pWeb);
	}
	
	public Web bilatuWeb(String pUrl) {
		return this.webLista.get(pUrl);
	}
	
	public void ezabatuWeb(String pUrl) {
		this.webLista.remove(pUrl);
	}
	
	//public Web bilatuIzenaz(String a) {
		
	//}
	
	//public ArrayList<Web> estekatuakItzuli(Web pWeb){
			
	//}
	
	public void fitxategietanGorde() {
		
	}
	
	public void alfabetikokiOrdenatu() {
		
	}
	
	public void erreseteatu() {
		this.webLista.clear();
	}
	
	public HashMap<String,Web> getWebLista(){
		return this.webLista;
	}
}
