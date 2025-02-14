package paquete1;

import java.util.Objects;

public class Suceso extends Puntos3d {

	private int tiempo;
	private String descripcion;
	public Suceso(double x, double y, double z, int tiempo, String descripcion ){
		super(x, y, z);
		this.tiempo = tiempo;
		this.descripcion = descripcion;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Suceso [tiempo=" + tiempo + ", descripcion=" + descripcion + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(descripcion, tiempo);
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suceso other = (Suceso) obj;
		return Objects.equals(descripcion, other.descripcion) && tiempo == other.tiempo;
	}

	
	
	
	
	
	
	
	
}
