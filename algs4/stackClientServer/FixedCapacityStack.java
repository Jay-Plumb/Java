// Item is generics. Read this as String/Double etc that the client defines when creating an object
public class FixedCapacityStack<Item>{
	private Item[] a; // Stack entries
	private int N = 0; // Size

	public FixedCapacityStack(int cap) {
		a = (Item[]) new Object[cap];
	}
	public void push(Item item) {
		// Double the space when full
		if(N == a.length)
			resize(2*a.length);
		a[N++] = item;
	}

	public Item pop() {
		Item item = a[--N];
		a[N] = null; // Avoid loitering 
		if((N > 0) && (N ==a.length/4))
			resize(a.length/2);
		return item;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	private void resize(int max) {
		// Used to grow sing int max
		Item[] temp = (Item[]) new Object[max];
		// Copy date from Item a[] into Item temp[]
		for(int i=0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp; //asign reference of temp to a
	}

	
}


