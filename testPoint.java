package fr.dauphine.javaavance.td1;

import model.Point;

public class testPoint {
	public static void main(String[] args) {
		Point p = new Point(0, 0);
		System.out.println(p.getX()+" "+ p.getY());
	}
	// we have to set x and y on Point class to private to get an exclusiv access on point.
}
