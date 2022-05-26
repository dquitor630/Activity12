package activity4;

public class Main {

	public static void main(String[] args) {
		OrdenarListas ordenarListas = new OrdenarListas();
		System.out.println("orden natural");
		ordenarListas.ordenanNatural();
		ordenarListas.getNombres().forEach(System.out::println);
		System.out.println("orden natural inverso");
		ordenarListas.ordenanNaturalInverso();
		ordenarListas.getNombres().forEach(System.out::println);
		ordenarListas.addNulls();
		System.out.println("orden natural null first");
		ordenarListas.ordenanNaturalInversoNull();
		ordenarListas.getNombres().forEach(System.out::println);
		System.out.println("orden natural inverso null final");
		ordenarListas.ordenanNaturalInversoNullFinal();
		ordenarListas.getNombres().forEach(System.out::println);
	}

}
