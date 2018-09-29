package collectionFramewrokInJava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationInjava {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		v.add(3);
		v.add(3);
		v.add(300);
		v.add(30);
		v.add(3666);
		v.add(3);
		v.add(3);
		
		Enumeration<Integer> enu = v.elements();
		
		/*
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		*/
		Iterator<Integer> itr = v.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println(":::::::::");
		ArrayList<Integer> obj1 = new ArrayList<>();
		obj1.add(3);
		obj1.add(3);
		obj1.add(3);
		
		//Enumeration<Integer> enu1 = obj1.elements();
		
		
	}
	
	
	
	
	
	

}
