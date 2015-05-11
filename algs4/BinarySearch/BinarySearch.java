import java.util.Arrays;
public class BinarySearch {

	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;

		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) 
				hi = mid - 1;
			else if(key > a[mid]) 
				lo = mid + 1;
			else
				return mid; //found the value 
		}
		return -1;
	}


	public static void main(String[] args) {
		int [] whitelist = In.readInts(args[0]); // tinyT
		Arrays.sort(whitelist); // Sort the input as required for binary search
		// While not empty
		while(!StdIn.isEmpty()) {
			int key = StdIn.readInt(); // Will read tinyT.txt
			if(rank(key, whitelist) < 0)
				StdOut.println(key);
		}
	}
}