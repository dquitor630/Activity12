package activity2;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class GestionList {
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	GestionList(){
		for(int i = 0; i<9;i++) {
			numbers.add(i);
		}
	}
	public void showArray(BiConsumer<Integer, Integer> biconsumer) {
		int index = 0;
		for (Integer i : numbers) {
			biconsumer.accept(index, i);
			index++;
		}
	}

	private void showArray(Consumer<Integer> consumer) {
		for (Integer i : numbers) {
			consumer.accept(i);
		}

	}

	public int countArray(Predicate<Integer> predicate) {
		int coincidencias = 0;
		for (Integer i : numbers) {
			if (predicate.test(i)) {
				coincidencias++;
			}
		}
		return coincidencias;

	}

	public ArrayList<Integer> filterArray(Predicate<Integer> predicate) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (Integer i : numbers) {
			if (predicate.test(i)) {
				result.add(i);
			}
		}
		return result;
	}

	public ArrayList<Integer> transformArray(UnaryOperator<Integer> unaryOper) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (Integer i : numbers) {
			result.add(unaryOper.apply(i));
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
		System.out.println("filterArray para filtrar pares: " + filterArray(countArrayPares));
		System.out.println("filterArray para filtrar impares: " + filterArray(countArrayImpares));
		System.out.println("filterArray para filtrar impares: " + filterArray(countArrayMayor3));
		System.out.println();
		System.out.println(
				"transformArray para obtener el doble: " + transformArray(transformArrayDoble));
		System.out.println(
				"transformArray para obtener el triple: " + transformArray(transformArrayTriple));
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
		System.out.println("filterArray para filtrar pares: " + filterArray(countArrayPares));
		System.out.println("filterArray para filtrar impares: " + filterArray(countArrayImpares));
		System.out.println("filterArray para filtrar impares: " + filterArray(countArrayMayor3));
		System.out.println();
		System.out.println(
				"transformArray para obtener el doble: " + transformArray(transformArrayDoble));
		System.out.println(
				"transformArray para obtener el triple: " + transformArray(transformArrayTriple));

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
