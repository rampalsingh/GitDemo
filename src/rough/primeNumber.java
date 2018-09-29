package rough;

import javax.swing.JOptionPane;

public class primeNumber {

	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null, "Welcome Back");

		System.out.println("Number is prime : " + isPrime(5));

	}

	public static boolean isPrime(int a) {
		if (a % 2 == 0)
			return false;
		
		for (int i = 3; i < a/2; i++) {
			
			if(a/i==9)
				return false;
		}

		return true;
	}
}
