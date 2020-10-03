package labo1;

public class LinkedList {
	//atributuak
	private LinearNode first; //lehenengo adabegia
		
	//eraikitzailea
	public LinkedList() {
		this.first = null;
		}

	public boolean isEmpty() {
		if (this.first==null){     //lista hutsa badago true bueltatuko du.
			return true;
		}
		else {
			return false;
		}
	}
	public void insertFirst(Web w) {
		LinearNode berria = new LinearNode(w,null);
		if (this.isEmpty()){
			this.first = berria;
		}
		else {
			berria = berria.getNext();
			berria = first;
			this.first = berria;
		}	
	}
	public Web deleteFirst() {
		if (this.isEmpty()){
			return null;
		}
		else {
			Web aux = first.getData();
			first = first.getNext();
			return aux;	
		}
	}
	public void display() {
		LinearNode aux = first;
		while (aux!=null){
			System.out.println(aux.getData());
			aux = aux.getNext();			
		}
	}
	public Web find(Web w) {
		boolean aurkitua = false;
		LinearNode aux = first;
		while (aux!= null && aurkitua == false){
			if (w.equals(aux.getData())){
				aurkitua = true;
			}
			else { 
				aux=aux.getNext();
			}	
		}
		if (aurkitua = true){
			return aux.getData();
		}
		else {
			return null;
		}		
	}
	public Web delete(Web w){
		boolean aurkitua = false;
		LinearNode aux = first;
		LinearNode aurrekoa = null;
		while (aurkitua=false && aux!=null){
			if (aux.getData().equals(w)){
				aurkitua = true;
			}
			else {
				aurrekoa = aux;
				aux = aux.getNext();		
			}
			
		}
		if (aurkitua = false) {
			return null;
		}
		else {
			if (aux == first){
				return deleteFirst();				
			}
			else if (aux.getNext()==null) {
				aurrekoa = aurrekoa.getNext();
				aurrekoa = null;
				return aux.getData();
			}
			else {
				aurrekoa = aurrekoa.getNext();
				aurrekoa = aux.getNext();
				return aux.getData();
			}
		}
	}
	
}