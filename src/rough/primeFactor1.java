package rough;

public class primeFactor1 {
	public static void main(String[] args) {
		primeFactor(26);
		System.out.println();
		primeFactor(325);
		System.out.println();
		primeFactor(8789);
		System.out.println();
		primeFactor(101148);
	}

	public static void primeFactor(int no) {
		for (int i = 2; i <= (no / 2); i++) {
			if (no % i == 0 && isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int no) {
		if (no % 2 == 0)
			return false;
		for (int i = 3; i < no / 2; i = i + 2) {
			if (no % i == 0)
				return false;
		}
		return true;
	}
}
