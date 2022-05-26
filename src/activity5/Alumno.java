package activity5;

import java.util.Objects;

public class Alumno {
	private String nombre;
	private boolean repetidor;
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
