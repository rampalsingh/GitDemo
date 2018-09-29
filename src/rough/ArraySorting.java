package rough;

import javax.swing.JOptionPane;

public class ArraySorting {

	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog("Enter the length of the Array");
		int[] array = new int[Integer.parseInt(s)];

		for (int i = 0; i < array.length; i++) {
			String s1 = JOptionPane.showInputDialog("Enter number " +(i+1));
			array[i] = Integer.parseInt(s1);
		}
		
		for (int j : array) {
			System.out.println(j);
		}
		
		int max;
        int index;
        for (int i = array.length; i > 1; i--) {
            max = array[0];
            index = 0;
            for (int j = 0; j < i; j++) {
                if (max < array[j]) {
                    max = array[j];
                    index = j;

                }
                
            }
            array[index] = array[i - 1];
            array[i - 1] = max;
        }
        System.out.println("Sorted Array");
        for (int v : array) {
            System.out.println(v);
        }	
		
	}
	
	

}
