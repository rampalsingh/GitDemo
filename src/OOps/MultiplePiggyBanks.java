package OOps;

import javax.swing.JOptionPane;

public class MultiplePiggyBanks {
	public static void main(String[] args) {
		PiggyBank1.deposit(200);
        PiggyBank1.withdraw(40);
        PiggyBank1.statement();

        PiggyBank2.deposit(300);
        PiggyBank2.withdraw(145);
        PiggyBank2.statement();
	}
}

class PiggyBank1 {
	private static int balance;
	private static int lt;

	static void deposit(int v) {
		balance = balance + v;
		lt = v;
	}

	static void withdraw(int v) {
		if (balance >= v) {
			balance = balance - v;
			lt = -v;
		} else {
			JOptionPane.showMessageDialog(null, "Cannot Withdraw more than the Balance");
		}
	}

	static void statement() {
		JOptionPane.showMessageDialog(null, "Balance = " + balance + "\n" + "Last Transaction = " + lt);
	}
}

class PiggyBank2 {
	private static int balance;
	private static int lt;

	static void deposit(int v) {
		balance = balance + v;
		lt = v;
	}

	static void withdraw(int v) {
		if (balance >= v) {
			balance = balance - v;
			lt = -v;
		} else {
			JOptionPane.showMessageDialog(null, "Cannot Withdraw more than the Balance");
		}
	}

	static void statement() {
		JOptionPane.showMessageDialog(null, "Balance = " + balance + "\n" + "Last Transaction = " + lt);
	}
}