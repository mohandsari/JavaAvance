package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;
	public Point(int x,int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static Point sameCoordonne(Point p) {
		Point np = new Point(p.x,p.y);
		return np;
	}
	public boolean isSameAs(Point p) {
		if(p.x==p.y) return true;
		return false;
	}
	
	
	public static void main(String[] args) {
		Point[] tab = new Point[100];
		int indice=0;
		Point p = new Point(1,2);
		tab[indice]=p;
		indice++;
		
		/*System.out.println("("+p.getX()+","+ p.getY()+")");
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		System.out.println(p1==p2);// il affiche le resultat du test vraie ou faux de p1=p2
		System.out.println(p1==p3);// il affiche le resultat du test vraie ou faux de p1=p3*/
		
		Point p1=new Point(1,2);
		Point p2=sameCoordonne(p1);
		Point p3=new Point(1,2);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		list.add(p3);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		

	}

}
