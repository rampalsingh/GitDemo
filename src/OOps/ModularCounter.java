package OOps;

public class ModularCounter {

	public static void main(String[] args) {

		System.out.println("Welcome to Modular Counter");
		Counter.setMax(10);

		Counter.setCyclic(true);
		for (int i = 0; i < 15; i++) {
			Counter.increment();
			Counter.showCounter();
		}

		Counter.setCyclic(false);
		for (int j = 0; j < 15; j++) {
			Counter.decrement();
			Counter.showCounter();
		}

		Counter.setMax(5);
		Counter.setCyclic(true);
		for (int i = 0; i < 15; i++) {
			Counter.increment();
			Counter.showCounter();
		}

		Counter.reset();
		Counter.showCounter();
		System.out.println("The cyclic status is " + Counter.getCyclic());
		System.out.println("The max status is " + Counter.getMax());

	}

}

class Counter {

	private static int count;
	private static int max;
	private static boolean cyclic;

	static void setMax(int value) {
		if (count > value) {
			count = value;
		}
		max = value;
	}

	static int getMax() {
		return max;
	}

	static boolean getCyclic() {
		return cyclic;
	}

	static void reset() {
		count = 0;
	}

	static void increment() {
		if (count < max) {
			count++;
		} else if (cyclic) {
			count = 0;
		}
	}

	static void decrement() {
		if (count > 0)
			count--;
		else if (cyclic)
			count = max;
	}

	static void showCounter() {
		System.out.println("count = " + count);
		System.out.println("cyclic = " + cyclic);
		System.out.println("max = " + max);
		System.out.println();
	}

	static void setCyclic(boolean flag) {
		cyclic = flag;

	}

}
