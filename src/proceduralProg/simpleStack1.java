package proceduralProg;
import javax.swing.JOptionPane;

public class simpleStack1 {

	static int[] stk = new int[10];
	static int st = 10;

	public static void main(String[] args) {
		print();
		push(10);

	}

	static void push(int v) {
		if (st == 0) {
			JOptionPane.showConfirmDialog(null, "Stack Overflow");
		} else {
			st = st - 1;
			stk[st] = v;

		}
	}

	static void print() {
		String str = "";
		if (st == 10) {
			JOptionPane.showMessageDialog(null, "No Stack to Display");
			//System.out.println("No Stack to Display");
		} else {
			for (int i = st; i < 10; i++) {
				str = str + stk[i] + "::";
			}
		}

	}
}
