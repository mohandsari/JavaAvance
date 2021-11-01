package fr.dauphine.javaavance.td3;

public class Cell {
	String info;
	Cell next;
	
	public Cell(String s, Cell n) {
		next = n;
		info = s;
	}
	public Cell getNext() {
		return next;
	}
	public void setNext(Cell cell) {
		this.next=cell;
		
	}
	public String getValeur() {
		
		return this.info;
	}
	

}
