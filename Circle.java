package fr.dauphine.javaavance.td1;

public class Circle {
	Point center;
	int radius;
	
	@Override
	public String toString() {
		return "circle de centre "+center+" et de rayon "+radius;
	}
	public void translate(int dx, int dy) {
		center.setX(dy);
		center.setY(dx);
	}
	public Point getCenter(Circle c) {
		return c.center;
	}
}
