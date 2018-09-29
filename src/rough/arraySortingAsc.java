package rough;

public class arraySortingAsc {
	static int[] arr = new int[5];

	public static void main(String[] args) {
		arr[0] = 12;
		arr[1] = 23;
		arr[2] = 9;
		arr[3] = 82;
		arr[4] = 29;

		int temp;
		
		for (int i = 0; i < (arr.length)-1; i++) {		//[12, 23, 9, 82, 29]
			int val = arr[i];
			for (int j = 1; j < arr.length; j++) {
				if (val>arr[j-1]) {
					temp = arr[j-1];
					
					
				}
			}
			
		}

		
	}

}
