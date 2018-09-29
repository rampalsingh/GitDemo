package rough;

import javax.swing.JOptionPane;

public class InteractiveQueue1 {

	static int[] q;
	static int last = 0;
	static int first = 0;
	static int size;

	public static void main(String[] args) {

		boolean flag = true;
		String ch = "Q";
		size = readValue(" Welcome to Queue\n" + "Enter the size of Queue\n");
		q = new int[size];
		while (flag) {
			ch = read(" Welcome to Queue\n" + " E - Enqueue" + "\n" + " D - Dequeue" + "\n" + " S - Show Content" + "\n"
					+ " Q - Quit" + "\n");
			switch (ch) {
			case "e":
			case "E":
				enqueue(readValue("Enter value to be Enqueued"));
				break;
			case "d":
			case "D":
				JOptionPane.showMessageDialog(null, "The last value dequeued is " + dequeue());
				break;
			case "s":
			case "S":
				print();
				break;
			case "q":
			case "Q":
				JOptionPane.showMessageDialog(null, "Thankyou for using Queue");
				flag = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Wrong Command");

			}
		}
	}

	static String read(String s) {
		String r = JOptionPane.showInputDialog(s);
		return (r == null) ? "Q" : r;
	}

	static int readValue(String s) {
		String v1 = JOptionPane.showInputDialog(s);
		int v = 0;
		try {
			v = Integer.parseInt(v1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
		return v;
	}

	static void enqueue(int v) {
		int newlast = (last + 1) % size;
		if (newlast == first) {
			JOptionPane.showConfirmDialog(null, "Queue Full");
		} else {
			last = newlast;
			q[last] = v;
		}
	}

	static int dequeue() {
		int temp = -1;
		if (last == first) {
			JOptionPane.showConfirmDialog(null, "Queue Empty");
		} else {
			first = (first + 1) % size;
			temp = q[first];
		}
		return temp;
	}

	static void print() {
		String str = "";
		if (first == last) {
			JOptionPane.showMessageDialog(null, "Queue is Empty");
		} else {
			int i = first;
			do {
				i = (i + 1) % size;
				str = str + q[i] + "::";
			} while (i != last);
			JOptionPane.showMessageDialog(null, str);
		}
	}

}