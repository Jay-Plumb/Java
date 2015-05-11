/*
Client use of a stack. Prints out in the reverse. 
*/
public class stackClient {
	public static void main(String[] args) {
		Stack<Integer> stack;
		stack = new Stack<Integer>();
		while(!StdIn.isEmpty())
			stack.push(StdIn.readInt());
		
		for(int i : stack){
			StdOut.println(i);
		} 
	}
 }