/*
 *Escribe la clase Punto que representa un punto en el plano (con un componente x y un componente y), con los métodos:

-          Punto(double x, double y): construye un objeto con los datos pasados como parámetros.

-          void desplazaX(double dx): incrementa el componente x en la cantidad dx.

-          void desplazaY(double dy): incrementa el componente y en la cantidad dy.

-          void desplaza(double dx, double dy): desplaza ambos componentes según las cantidades dx (en el eje x) y dy (en el componente y).

-          doble distanciaEuclidea(Punto otro): calcula y devuelve la distancia euclídea entre el punto invocante y el punto otro.

-          void muestra(): muestra por consola la información relativa al punto
 *
 *
 **/
package paquete1;
import java.util.*;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		Puntos3d uno = new Puntos3d(5,7,8);
		Puntos3d dos = new Puntos3d(2,6,9);
		System.out.println(uno.getX());
		System.out.println(uno.distanciaEcludia(dos));
		
	}

}
