




package paquete1;
import java.lang.Math;
public class Puntos {
	private double x;
	private double y;
	
	
	public Puntos(double x, double y) {
		setX(x);
		setY(y);
	}



	public double getX() {
		return x;
	}



	public void setX(double x) {
		this.x = x;
	}



	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}

	
	
	public void desplazaX(double dx) {
		if(dx > 0) {
			this.x += dx;
		}
		else {
			this.x -=dx;
		}
	}
	
	
	public void desplazaY(double dy) {
		if(dy > 0) {
			this.y += dy;
		}
		else {
			this.y -=dy;
		}
	}
	
	
	
	public void desplazaXY(double dx,double dy) {
		if(dx > 0) {
			this.x += dx;
		}
		else {
			this.x -=dx;
		}
		
		if(dy > 0) {
			this.y += dy;
		}
		else {
			this.y -=dy;
		}
	}



	@Override
	public String toString() {
		return "Puntos [x=" + x + ", y=" + y + "]";
	}
	
	
	public void muestra() {
		toString();
	}
	
	
	
	public static double getSquare(double number) {
		return number * number;
	}
	
	//Distancia euclidea..
	
	
	public double distanciaEcludia(Puntos otro) {
		double resultado;
		resultado = Math.sqrt( getSquare( (this.getX() - otro.getX() ) ) + getSquare( (this.getY() - otro.getY()) ) );
		return resultado;
	}
	
	
	
	
	
	
	
	
}
