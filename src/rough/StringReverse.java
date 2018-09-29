package rough;

public class StringReverse {

	public static void main(String[] args) {
		String text = "Ghungroo Shraddha Mall";

		int len = text.length();
		System.out.println("NAME : " + text);

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + text.charAt(i);
			// System.out.println(rev);
		}

//		System.out.println(rev);
	
		StringBuffer sf = new StringBuffer(text);
		System.out.println(sf.reverse());
		
	
	}

	
}
