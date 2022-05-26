package activity3;

public class Main {

	public static void main(String[] args) {
		new Main().prueba();
	}

	public void prueba() {
		Maps maps = new Maps();
		System.out.println("\nGestión de mapas con clases inline anónimas");
		maps.inner();
		System.out.println("\n\nGestión de mapas con lambda");
		maps.lambda();

	}

}
