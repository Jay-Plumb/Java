public class Stack<Item> { // Implements Iterable<Item>
	private Node first; // Top of the stack most recently added node.
	private int N; // Number of items

	
	private class Node {
		// Nested class to define nodes 
		Item item; 
		Node next;
	}

	public boolean isEmpty() {
		return first == null; // Or N == 0
	}

	public int size() {
		return N;
	}

	public void push(Item item) {
		// Add item to top of stack
		Node oldfirst = first; 
		first = new Node();
		first.item = item;
		first.next = oldfirst; 
		N++;
	}

	public Item pop() {
		// Remove item from top of stack
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

}