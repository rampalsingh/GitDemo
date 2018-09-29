package rough;

public class fibonacciForLoop {

	public static void main(String[] args) {

		int i, j, k;

		i = 0;
		j = 1;

		int val;
		for (k = 0;  k < 10; k++) {
			val = i+j;
			System.out.println(val+", ");
			i = j;
			j = val;
		}
	}

}
