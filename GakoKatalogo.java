package labo1;

import java.util.ArrayList;
import java.util.Iterator;

public class GakoKatalogo {

	//atributuak
	private static GakoKatalogo nireGakoKatalogo; 
	private ArrayList<Gako> gakoLista;
	
	//eraikitzailea
	private GakoKatalogo() {
		this.gakoLista = new ArrayList<Gako>();
	}
	
	//metodoak
	public static GakoKatalogo getNireGakoKatalogo() {
		if(nireGakoKatalogo == null) {
			nireGakoKatalogo = new GakoKatalogo();
		}
		return nireGakoKatalogo;
	}
	
	private Iterator<Gako> getIteradorea(){
		return this.gakoLista.iterator();
	}
	
	public void txertatuGakoa(Gako pGakoa) {
		
	}
	
	public void ezabatuGakoa() {
		
	}
	
	//public ArrayList<Gako> gakoaDute(Gako pGakoa){

	//}
	
}
