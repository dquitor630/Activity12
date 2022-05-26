package activity1;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class GestionArray {
	int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public void showArray(BiConsumer<Integer, Integer> biconsumer) {
		int index = 0;
		for (Integer i : array) {
			biconsumer.accept(index, i);
			index++;
		}
	}

	private void showArray(Consumer<Integer> consumer) {
		for (Integer i : array) {
			consumer.accept(i);
		}

	}

	public int countArray(Predicate<Integer> predicate) {
		int coincidencias = 0;
		for (Integer i : array) {
			if (predicate.test(i)) {
				coincidencias++;
			}
		}
		return coincidencias;

	}

	public int[] filterArray(Predicate<Integer> predicate) {
		int[] result = new int[array.length];
		int index = 0;
		for (Integer i : array) {
			if (predicate.test(i)) {
				result[index] = i;
				index++;
			}
		}
		return result = Arrays.copyOf(result, index++);
	}

	public int[] transformArray(UnaryOperator<Integer> unaryOper) {
		int[] result = new int[array.length];
		int index = 0;
		for (Integer i : array) {
			result[index] = unaryOper.apply(i);
			index++;
		}
		return result;

	}

	public void showAnonimo() {
		System.out.println("ANONIMO");

		Consumer<Integer> showArray = new Consumer<>() {
			@Override
			public void accept(Integer t) {
				System.out.printf(" %d ", t);
			}
		};
		Consumer<Integer> showArrayLn = new Consumer<>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		BiConsumer<Integer, Integer> anonimoSABiCon = new BiConsumer<>() {
			@Override
			public void accept(Integer t, Integer u) {
				System.out.println("Elemento " + t + ": " + u);
			}

		};
		Predicate<Integer> countArrayPares = new Predicate<>() {

			@Override
			public boolean test(Integer t) {
				if (t % 2 == 0) {
					return true;
				} else {
					return false;
				}
			}

		};
		Predicate<Integer> countArrayImpares = new Predicate<>() {

			@Override
			public boolean test(Integer t) {
				if (t % 2 != 0) {
					return true;
				} else {
					return false;
				}
			}

		};

		Predicate<Integer> countArrayMayor3 = new Predicate<>() {

			@Override
			public boolean test(Integer t) {
				if (t > 3) {
					return true;
				} else {
					return false;
				}
			}

		};
		UnaryOperator<Integer> transformArrayDoble = new UnaryOperator<>() {

			@Override
			public Integer apply(Integer t) {

				return t * 2;
			}

		};
		UnaryOperator<Integer> transformArrayTriple = new UnaryOperator<>() {

			@Override
			public Integer apply(Integer t) {

				return t * 3;
			}

		};
		System.out.print("showArray para mostrar los elementos en la misma línea: ");
		showArray(showArray);
		System.out.println();
		System.out.println("showArray para mostrar los elementos cada uno en una línea:");
		showArray(showArrayLn);
		System.out.println("showArray para mostrar los elementos con su índice");
		showArray(anonimoSABiCon);
		System.out.println("countArray para contar pares: " + countArray(countArrayPares));
		System.out.println("countArray para contar impares: " + countArray(countArrayImpares));
		System.out.println("countArray para contar los mayores de 3: " + countArray(countArrayMayor3));
		System.out.println();
		System.out.println("filterArray para filtrar pares: " + Arrays.toString(filterArray(countArrayPares)));
		System.out.println("filterArray para filtrar impares: " + Arrays.toString(filterArray(countArrayImpares)));
		System.out.println("filterArray para filtrar impares: " + Arrays.toString(filterArray(countArrayMayor3)));
		System.out.println();
		System.out.println(
				"transformArray para obtener el doble: " + Arrays.toString(transformArray(transformArrayDoble)));
		System.out.println(
				"transformArray para obtener el triple: " + Arrays.toString(transformArray(transformArrayTriple)));
	}

	public void showLambda() {
		System.out.println("LAMBDAS");
		Consumer<Integer> showArray = (t) -> System.out.printf(" %d ", t);
		Consumer<Integer> showArrayLn = (t) -> System.out.println(t);

		BiConsumer<Integer, Integer> lambdaSABiCon = (t, u) -> System.out.println("Elemento " + t + ": " + u);

		Predicate<Integer> countArrayPares = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		Predicate<Integer> countArrayImpares = (t) -> {
			if (t % 2 != 0) {
				return true;
			} else {
				return false;
			}
		};
		Predicate<Integer> countArrayMayor3 = (t) -> {
			if (t % 2 != 0) {
				return true;
			} else {
				return false;
			}
		};
		UnaryOperator<Integer> transformArrayDoble = (t) -> t * 2;
		UnaryOperator<Integer> transformArrayTriple = (t) -> t * 3;

		System.out.print("showArray para mostrar los elementos en la misma línea: ");
		showArray(showArray);
		System.out.println();
		System.out.println("showArray para mostrar los elementos cada uno en una línea:");
		showArray(showArrayLn);
		System.out.println("showArray para mostrar los elementos con su índice");
		showArray(lambdaSABiCon);
		System.out.println("countArray para contar pares: " + countArray(countArrayPares));
		System.out.println("countArray para contar impares: " + countArray(countArrayImpares));
		System.out.println("countArray para contar los mayores de 3: " + countArray(countArrayMayor3));
		System.out.println();
		System.out.println("filterArray para filtrar pares: " + Arrays.toString(filterArray(countArrayPares)));
		System.out.println("filterArray para filtrar impares: " + Arrays.toString(filterArray(countArrayImpares)));
		System.out.println("filterArray para filtrar impares: " + Arrays.toString(filterArray(countArrayMayor3)));
		System.out.println();
		System.out.println(
				"transformArray para obtener el doble: " + Arrays.toString(transformArray(transformArrayDoble)));
		System.out.println(
				"transformArray para obtener el triple: " + Arrays.toString(transformArray(transformArrayTriple)));

	}

	public void showReferencia() {
		System.out.println("REFERENCIA A METODOS");
		System.out.print("showArray para mostrar los elementos en la misma línea: ");
		showArray(System.out::print);
		System.out.println();
		System.out.println("showArray para mostrar los elementos cada uno en una línea:");
		showArray(System.out::println);

	}
}
