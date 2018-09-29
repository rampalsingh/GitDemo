package OOps;
/*
import javax.swing.JOptionPane;

public class Module_Piggybankintereactive {

	public static void main(String[] args) {
		Controller.eventloop();
	}

}

class View {
	static void write(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
}

class Controller1 {

	static void eventloop() {
		boolean flag = true;
		String ch = "Q";

		while (flag) {
			ch = read(" Welcome to PiggyBank\n" + " D - Deposit" + "\n" + " W - Withdraw" + "\n" + " S - Statement"
					+ "\n" + " Q - Quit" + "\n");

		switch (ch) {

		case "d":
		case "D":
			PiggyBan1k.deposit(readValue("Enter Amount to be Deposited"));
			break;

		case "w":
		case "W":
			PiggyBan1k.withdraw(readValue("Enter Amount to be Withdrawn"));
			break;

		case "s":
		case "S":
			PiggyBan1k.statement();
			break;

		case "q":
		case "Q":
			View.write("Thankyou for using PiggyBank");
			flag = false;
			break;

		default:
			break;
		}
		
	}
	}

	static int readValue(String string) {
		String rd = JOptionPane.showInputDialog(string);
		int v = 0;
		try {
			v = Integer.parseInt(rd);
		} catch (Exception e) {
			View.write("Invalid Input");
		}
		return v;
	}

	static String read(String string) {
		String r = JOptionPane.showInputDialog(string);
		return (r == null) ? "Q" : r;
	}

}

class PiggyBan1k {
	private static int balance;
	private static int lt;

	static void deposit(int v) {
		balance = balance + v;
		lt = v;
	}

	static void statement() {
		System.out.println("Balance : " + balance);
		System.out.println("Last Trnsaction : " + lt);
	}

	static void withdraw(int v) {
		if (balance >= 0) {
			balance = balance - v;
			lt = -v;
		} else {
			View.write("Cannot Withdraw more than the Balance");
		}

	}
}
*/