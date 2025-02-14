




package paquete1;
import java.lang.Math;
import java.util.Objects;
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



	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Puntos other = (Puntos) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	
	
	
	
	
	
	
	
}
