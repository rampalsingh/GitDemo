package rough;

import javax.swing.JOptionPane;

public class findingHighest {
	public static void main(String[] args) {
		int x;
		String s;
		s = JOptionPane.showInputDialog("How many values you want to enter?");
		int y = Integer.parseInt(s);
		int[] a = new int[y];
		for (int i = 0; i < a.length; i++) {
			s = JOptionPane.showInputDialog("Enter number " + i);
			x = Integer.parseInt(s);
			a[i] = x;
		}
		for (int v : a) {
			System.out.println(v);
		}
		int max = a[0];
		for (int j = 1; j < a.length; j++) {
			if (max < a[j]) {
				max = a[j];
			}
		}
		JOptionPane.showMessageDialog(null, "The highest number is = " + max);

	}
}
