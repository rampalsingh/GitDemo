package proceduralProg;
public class Counter {

	private static int count;

	static void increment(){
		if(count<100){
			count++;
		}
	}
	
	static void decrement(){
		if(count>0){
			count--;
		}
	}
	
	static int getdata(){
		return count;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Counter initial value is : "+ count);
		
		increment();
		increment();
		increment();
		increment();
		increment();
		
		System.out.println("Counter value after Increment : "+ count);
		
		decrement();
		decrement();
		
		System.out.println("Counter value after Decrement : "+ count);
	}


}