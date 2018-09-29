package OOps;

public class RoughObject {

	public static void main(String[] args) {
		String str4 = null;
		String str1 = "Cat";
		String str2 = "Cow";
		String str3 = "Cat";
		
		str4 ="Rampal";
		System.out.println(str4.length());
		System.out.println(str4.substring(1,3));
		System.out.println(str4);

		
		if (str1.equals(str3)) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
		
	}

}
