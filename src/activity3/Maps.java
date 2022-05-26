package activity3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Maps {

	public void lambda() {
		Map<String, Double> map = setMap();
		map.forEach((k, v) -> System.out.printf("\nClave: " + k + " Valor: %.2f", v));
		map.computeIfAbsent("Luis", v -> 1000.00);
		map.computeIfPresent("Luis", (k, v) -> v + (v * 0.20));
		map.replaceAll((k, v) -> v + (v * 0.10));

		System.out.println("\n\n resultado final");
		map.forEach((k, v) -> System.out.printf("\nClave: " + k + " Valor: %.2f", v));

	}

	public void inner() {
		Map<String, Double> map = setMap();
		map.forEach(new BiConsumer<String, Double>() {
			@Override
			public void accept(String t, Double u) {
				System.out.println("Clave: " + t + " Valor: " + u);
			}

		});
		map.computeIfAbsent("Luis", new Function<String, Double>() {

			@Override
			public Double apply(String t) {
				return 1000.00;
			}

		});

		map.computeIfPresent("Luis", new BiFunction<String, Double, Double>() {

			@Override
			public Double apply(String t, Double u) {

				return u + (u * 0.20);
			}

		});

		map.replaceAll(new BiFunction<String, Double, Double>() {

			@Override
			public Double apply(String t, Double u) {

				return u + (u * 0.10);
			}

		});

		System.out.println("\n resultado final");
		map.forEach(new BiConsumer<String, Double>() {
			@Override
			public void accept(String t, Double u) {
				System.out.printf("\nClave: " + t + " Valor: %.2f", u);
			}

		});
	}

	private Map<String, Double> setMap() {
		Map<String, Double> map = new HashMap<>();
		map.put("Ana", 2000.96);
		map.put("Rodrigo", 2500.74);
		map.put("Juan", 1000.45);
		map.put("Antonio", 3000.32);
		map.put("Pepe", 1500.58);
		return map;
	}
}
