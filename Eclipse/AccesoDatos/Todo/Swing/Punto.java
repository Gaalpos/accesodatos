package Swing;

public class Punto {
	private double X;
	private double Y;
	
	public Punto(double x, double y) {
		this.X = x;
		this.Y = y;
	}
	
	public static double distancia2Puntos(Punto p1, Punto p2) {
		
		return Math.sqrt(Math.pow(p2.X - p1.X, 2) + Math.pow(p2.Y - p1.Y, 2));	
		
	}

	
	
}