public class QuickFindUF {
	// Using an array as the datastructure
	private int[] id;

	public QuickFindUF(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++)
			id[i] = i;
	}

	// Find/Connected 
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	} 

	// N^2
	public void union(int p, int q) {
		// Get the id
		int pid = id[p];
		int qid = id[q];

		// Go through entire array and look for entries equal to p 
		for(int i = 0; i < id.length; i++) {
			// Set all entries with id[p] to id[q]
			if(id[i] == pid)
				id[i] = qid;
		}
	}
}

