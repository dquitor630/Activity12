package activity5;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Alumno> list = new ArrayList<>();
		list.add(new Alumno("Diego", false, 10.0));
		list.add(new Alumno("Diego", false, 9.0));
		list.add(new Alumno("Pepe", true, 7.0));
		list.add(new Alumno("Juan", false, 4.0));

		list.sort(new Comparator<Alumno>() {

			@Override
			public int compare(Alumno o1, Alumno o2) {

				return o1.getNombre().compareTo(o2.getNombre());
			}

		});

		for (Alumno i : list) {
			System.out.println(i.getNombre());
		}
		
		
		list.sort(new Comparator<Alumno>() {

			@Override
			public int compare(Alumno o1, Alumno o2) {
				int result = o2.getNombre().compareTo(o1.getNombre());
				if (result == 0) {
					result = Double.compare(o2.getNota(), o1.getNota());
				}
				return result;
			}
		});
		
		for (Alumno i : list) {
			System.out.println(i.getNombre() + " Nota: " + i.getNota());
		}
		
		
	}
	
	

}
