package rough;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class sPiggyBank {
	static int balance, lastTransaction;
	static int[] lasttran = new int[5];
	static int count;

	public static void main(String[] args) {
		boolean flag = true;
		JOptionPane.showMessageDialog(null, "Welcome to Piggy Bank");
		String ch = "Q";

		while (flag) {
			ch = readValue("D : Deposit\n" + "W : Withdrawl\n" + "S : Statement\n" + "Q : Quit");

			switch (ch) {
			case "d":
			case "D":
				deposit(amount("Enter the Amount to Deposit"));
				break;
			case "w":
			case "W":
				withdrawl(amount("Enter the Amount to Withdrawl"));
				break;
			case "s":
			case "S":
				statement();
				break;
			case "q":
			case "Q":
				JOptionPane.showMessageDialog(null, "Thankyou for using PiggyBank");
				flag = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "You have given wrong command");
				break;
			}

		}
	}

	static String readValue(String val) {
		String input = JOptionPane.showInputDialog(val);
		return (input==null)?"Q":input;
	}

	static int amount(String val) {
		String in = JOptionPane.showInputDialog(val);
		int value = Integer.parseInt(in);
		return value;
	}

	static void deposit(int val) {
		balance = balance + val;
		lastTransaction = val;
		saveTransaction(val);
	}

	static void withdrawl(int val) {
		balance = balance - val;
		lastTransaction = val;
		saveTransaction(val);
	}

	static void statement() {
		String message = "";
		for (int i : lasttran) {
			message = message+i+":";
		}
		JOptionPane.showMessageDialog(null, "Balance : " + balance + " | Last Transaction : " + message);
	}

	static void saveTransaction(int val) {
		if (count == 5) {
			for (int i = 0; i < lasttran.length-1; i++) {
				lasttran[i] = lasttran[i + 1];
			}
			lasttran[4] = val;
		} else {
			lasttran[count++] = val;
		}

	}

}
