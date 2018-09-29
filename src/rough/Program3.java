package rough;

public class Program3 {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.print();
		int z = s1.pop();
		System.out.println("Popped value : " + z);
		s1.print();
	}

}

class Stack {

	Node head;

	void push(int v) {
		if (head == null) {
			head = new Node(v);

		} else {
			head = new Node(v, head);
		}

	}

	int pop() {
		Node temp = head;
		head = head.getNext();
		return temp.getV();
	}

	void print() {

		System.out.println("Prining stack");
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.getV());
			temp = temp.getNext();
		}
	}

}

class Node {
	
	
	private int v;
	private Node next;

	Node(int v) {
		this.v = v;
		next = null;
	}

	Node(int v, Node next) {
		this.v = v;
		this.next = next;
	}

	int getV() {
		return v;
	}

	Node getNext() {
		return next;
	}

	void print() {
		System.out.println("V : " + v);
		System.out.println("Next : " + next);

	}
}
