package OOps;

import javax.swing.JOptionPane;

public class SimpleStack {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to Stack");
		Stack.print();
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		Stack.print();
		int z = Stack.pop();
		Stack.print();
		JOptionPane.showMessageDialog(null, "Last value Popped is " + z);
	}
}

/*

class Stack {
	private static int[] stk = new int[10];
	private static int st = 10;

	static void push(int v) {
		if (st == 0) {
			JOptionPane.showConfirmDialog(null, "Stack Overflow");
		} else {
			st = st - 1;
			stk[st] = v;
		}
	}

	static int pop() {
		int temp = -1;
		if (st == 10) {
			JOptionPane.showConfirmDialog(null, "Stack Underflow");
		} else {
			temp = stk[st];
			st = st + 1;
		}
		return temp;
	}

	static void print() {
		String str = "";
		if (st == 10) {
			JOptionPane.showMessageDialog(null, "Stack is Empty, No content to display");
		} else {
			for (int i = st; i < 10; i++) {
				str = str + stk[i] + "::";
			}
			JOptionPane.showMessageDialog(null, str);
		}
	}
}
*/