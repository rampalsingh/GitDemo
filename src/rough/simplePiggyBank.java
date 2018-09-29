package rough;

import javax.swing.JOptionPane;

public class simplePiggyBank {

	static int balance, lastTrans;

	public static void main(String[] args) {
		String ch = "Q";
		boolean flag = true;

		while (flag) {
			ch = read("D - Deposit\n" + "W - Withdrawl\n" + "S - Statement\n" + "Q - Quit");

			switch (ch) {
			case "d":
			case "D":
				deposit(readValue("Enter amount to be Deposit"));
				break;

			case "w":
			case "W":
				withdrawl(readValue("Enter amount to be Withdraw"));
				break;

			case "s":
			case "S":
				statement();
				break;

			case "q":
			case "Q":
				 JOptionPane.showMessageDialog(null,"Thankyou for using PiggyBank");
				 flag=false;
				break;

			default:
				JOptionPane.showMessageDialog(null,"Wrong Command");
				break;
			}
		}
	}

	static void deposit() {

	}

	static String read(String s) {
		String input = JOptionPane.showInputDialog(s);
		return (input == null) ? "Q" : input;
	}

	static int readValue(String s) {
		String str1 = JOptionPane.showInputDialog("Enter Amount");
		int val = 0;
		try {
			val = Integer.parseInt(str1);
		} catch (Exception e) {
			JOptionPane.showInputDialog("Invalid input");
		}

		return val;
	}

	static void deposit(int val) {
		balance = balance + val;
		lastTrans = val;
	}

	static void withdrawl(int val) {
		if (balance >= val) {
			balance = balance - val;
			lastTrans = val;
		}else {
			JOptionPane.showMessageDialog(null, "Cannot Withdraw more than the Balance");
		}
	}

	static void statement() {
		System.out.println("Balance : " + balance);
		System.out.println("Last Transaction : " + lastTrans);
		JOptionPane.showMessageDialog(null, "Balance : "+balance+ " | Last Transaction : "+lastTrans);
	}
}
