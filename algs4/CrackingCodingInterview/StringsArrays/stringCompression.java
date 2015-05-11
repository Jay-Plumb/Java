/*
Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string.

Runtime: O(p + k^2) where p = size of input string and k is the number of character sequences (4 in our example). It is k^2 as string concatenation operates in O(n^2) 
*/

class stringCompression {

	public String compressBad(String str) {
		String mystr = "";
		char last = str.charAt(0); 
		int count = 1;
		System.out.println(str.length());

		for(int i=1; i < str.length(); i++) {
			if (str.charAt(i) == last){ // Check for repeat of char
				count++;
			} else { // (new char) Insert char count and update last char
				mystr += last + "" + count;
				last = str.charAt(i);
				count = 1;
			}
		}

		return mystr + last + count; // We add  + last + count as we only concatenate in the else block which may not be the last block executed
	}		

	public static void main(String[] args) {
		stringCompression sc = new stringCompression();
		System.out.println(sc.compressBad("aabcccccaaa"));
			
		
	}
}