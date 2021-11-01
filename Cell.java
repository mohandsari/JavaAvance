package fr.dauphine.javaavance.td3;

public class Cell {
	Object info;
	Cell next;
	
	public Cell(Object s, Cell n) {
		next = n;
		info = s;
	}
	public Cell getNext() {
		return next;
	}
	public void setNext(Cell cell) {
		this.next=cell;
		
	}
	public Object getValeur() {
		
		return this.info;
	}
	

}
