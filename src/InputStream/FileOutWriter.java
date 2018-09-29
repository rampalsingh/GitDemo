package InputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOutWriter 
{

	public static void main(String[] args) throws Exception {
/*		FileWriter fw = new FileWriter("D:\\temp0.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
*/		BufferedReader kin = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> arr = new ArrayList<String>();
		PrintWriter fos = new PrintWriter(new BufferedWriter(new FileWriter("D:\\temp0.txt",true)), true);
		
		System.out.println("Enter the keyword");
		String str = kin.readLine();
		
		do {
			System.out.print("Enter the value : ");
			arr.add(kin.readLine());
			str = kin.readLine();
			fos.print(str);
			
		} while (!str.equals("end"));
		
		
		for(String r : arr){
			System.out.println(r);
			fos.println(str);
			
			
		}
		fos.close();
	}

}
