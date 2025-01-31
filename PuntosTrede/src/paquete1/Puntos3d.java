/*
 Define la clase Punto, que tiene como atributos las coordenadas x e y, 
 de tipo entero, que lo sitúan en el plano. Además del constructor, implementa
  el método

doble distancia(Punto otroPunto), 
que devuelve la distancia a otro punto que se le pasa como parámetro.


A partir de Punto, por herencia, 
implementa la clase Punto3D, 
que representa un punto en tres
 dimensiones y necesita una coordenada adicional z.
  Reimplementa el método distancia() para puntos 3D.

Recuerda que la clase Punto la hicimos en la unidad anterior
 * */


package paquete1;

public class Puntos3d extends Puntos {
	private double z;
	
	
	public Puntos3d(double x, double y, double z) {
		super(x, y);
		setZ(z);
		
	}

	
	
	

	public double getZ() {
		return z;
	}


	public void setZ(double z) {
		this.z = z;
	}





	
	public double distanciaEcludia(Puntos3d otro) {
		double resultado;
		resultado = Math.sqrt( getSquare( (this.getX() - otro.getX() ) ) + getSquare( (this.getY() - otro.getY()) ) + getSquare( (this.getZ() - otro.getZ()) ) );
		return resultado;
	}





	@Override
	public String toString() {
		return "Puntos3d [getZ()=" + getZ() + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}

	





	
	
	
	
	
	
	

}
