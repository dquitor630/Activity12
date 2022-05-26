package activity6;

import java.util.Objects;

public class Alumno {
	private String nombre;
	private boolean repetidor;
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", repetidor=" + repetidor + ", nota=" + nota + "]";
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	private double nota;

	Alumno(String nombre, boolean repetidor, double nota) {
		this.nombre = nombre;
		this.repetidor = repetidor;
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, nota, repetidor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota) && repetidor == other.repetidor;
	}

	public String getNombre() {
		return nombre;
	}

	public double getNota() {
		return nota;
	}
}
