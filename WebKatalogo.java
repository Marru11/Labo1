package labo1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class WebKatalogo {
	
	//atributuak
	private static WebKatalogo nireWebKatalogo;
	private ArrayList<Web> webLista;
	
	//eraikitzailea
	private WebKatalogo() {
		this.webLista = new ArrayList<Web>();
	}
	
	//metodoak
	public WebKatalogo getNireWebKatalogo() {
		if(nireWebKatalogo == null) {
			nireWebKatalogo = new WebKatalogo();
		}
		return nireWebKatalogo;
	}
	
	private Iterator<Web> getIteradorea(){
		return this.webLista.iterator();
	}
	
	public void datuakKargatu() {
		try{
			Scanner entrada = new Scanner(new FileReader("index"));
			String linea;
			while (entrada.hasNext()) {
				linea = entrada.nextLine();
				System.out.println(linea);
			}
			entrada.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void txertatuWeb(Web pWeb) {
		this.webLista.add(pWeb);
	}
	
	public void ezabatuWeb(Web pWeb) {
		this.webLista.remove(pWeb);
	}
	
	//public Web bilatuIzenaz(String a) {
		
	//}
	
	//public ArrayList<Web> estekatuakItzuli(Web pWeb){
			
	//}
	
	public void fitxategietanGorde() {
		
	}
	
	public void alfabetikokiOrdenatu() {
		
	}
}
