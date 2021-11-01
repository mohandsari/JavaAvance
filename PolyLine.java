package fr.dauphine.javaavance.td1;

public class PolyLine {
	private int maxPoint;
	private Point[] tabPoint = new Point[maxPoint];
	public PolyLine() {
		maxPoint=0;
		tabPoint=null;
	}
	public PolyLine(int maxPoint, Point[] tabPoint) {
		this.maxPoint=maxPoint;
		this.tabPoint=tabPoint;
	}
	public void add(Point p) {
		
		int i=0;
		while(tabPoint[i] != null) {
			i++;
		}
		if(i==maxPoint) throw new IllegalStateException("le tab est plein");
		else tabPoint[i]=p;			
	}
	public int pointCapacity() {
		return maxPoint;
	}
	public int nbPoints() {
		int i=0;
		while(tabPoint[i] != null) {
			i++;
		}
		return i;
	}
	public boolean isIn(Point p) {
		
		return false;
	}
}
