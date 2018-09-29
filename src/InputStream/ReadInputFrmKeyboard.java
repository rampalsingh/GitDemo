package InputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadInputFrmKeyboard {

	public static void main(String[] args) throws Exception {
		
//		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader kin = new BufferedReader(new InputStreamReader(System.in));
		
		
//		OutputStreamWriter osr = new OutputStreamWriter(System.out);
//		BufferedWriter bw = new BufferedWriter(osr);
		
//		int[] arr = new int[5];
		String[] arr = new String[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number "+(i+1));
			//String rd = br.readLine(); 
			//arr[i] = Integer.parseInt(kin.readLine());
			arr[i] = kin.readLine();
		}
		
		for (String i :arr) {
			System.out.println(i);
		}
	}

}
