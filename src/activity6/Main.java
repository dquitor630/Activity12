package activity6;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {
	ArrayList<Alumno> list = new ArrayList<>();
	public static void main(String[] args) {
		new Main().prueba();
		
	}
	
	public void prueba() {
		list.add(new Alumno("Diego", false, 10.0));
		list.add(new Alumno("Diego", false, 9.0));
		list.add(new Alumno("Pepe", true, 7.0));
		list.add(new Alumno("Juan", false, 4.0));

		Optional<Alumno> opcional = findRepeaterStudent("Pepe");
		if(opcional.isPresent()) {
			System.out.println(opcional.get().toString());
		}
		opcional.get().setNota(opcional.orElseThrow().getNota() + 1.0);
		
		if(opcional.orElseThrow().getNota() > 4.9) {
			System.out.println("Alumno aprobado");
		}else {
			throw new NoSuchElementException();
		}
	}
	Optional<Alumno> findRepeaterStudent(String nombre){
		for (Alumno i : list) {
			if(i.getNombre().equals(nombre) && i.isRepetidor()) {
				return Optional.of(i);
			}
		}
		return Optional.empty();
	}
	

}
