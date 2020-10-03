package labo1;

public class LinearNode {
	//atributuak
	private Web data; //datuak adabegian
	private LinearNode next; //hurrengo adabegia
	
	//eraikitzaile
	public LinearNode(Web pdata,LinearNode pnext) {
		this.data=pdata;
		this.next=pnext;
	}
	

	public Web getData() {
		return data;
	}
	public void setData(Web pdata) {
		this.data= pdata;
	}
	public LinearNode getNext() {
		return next;
	}
	public void setNext(LinearNode pnext) {
		this.next = pnext;
	}
}

	
