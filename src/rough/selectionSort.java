package rough;

import javax.swing.JOptionPane;

public class selectionSort {
	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog("How many values you want to enter?");
		int[] a = new int[Integer.parseInt(s)];
		
		for (int i = 0; i < a.length; i++)
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter number " + i));
		System.out.println("User Inputs");
		
		
		for (int v : a) {
			System.out.println(v);
		}
		int max;
		int index;
		for (int i = a.length; i > 1; i--) {
			max = a[0];
			index = 0;
			for (int j = 0; j < i; j++) {
				if (max < a[j]) {
					max = a[j];
					index = j;
				}
			}
			a[index] = a[i - 1];
			a[i - 1] = max;
		}
		System.out.println("Sorted Array");
		for (int v : a) {
			System.out.println(v);
		}
	}
}
