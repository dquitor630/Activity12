package activity4;

import java.util.ArrayList;
import java.util.Comparator;

public class OrdenarListas {
	ArrayList<String> nombres = new ArrayList<String>();
	public OrdenarListas() {
		nombres.add("Diego");
		nombres.add("Pepe");
		nombres.add("Juan");
	}
	public void addNulls() {
		nombres.add(null);
		nombres.add(null);
	}
	public void ordenanNatural() {
		nombres.sort(Comparator.naturalOrder());
	}
	
	public void ordenanNaturalInverso() {
		nombres.sort(Comparator.reverseOrder());
	}
	public void ordenanNaturalInversoNull() {
		nombres.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
	}
	
	public void ordenanNaturalInversoNullFinal() {
		nombres.sort(Comparator.nullsLast(Comparator.reverseOrder()));
	}
	public ArrayList<String> getNombres() {
		return nombres;
	}
	
}