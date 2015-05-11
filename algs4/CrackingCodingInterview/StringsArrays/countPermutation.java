/*
 * Given two strings, write a method to decide if one is a permutation of the other 
*/

/*
Assumptions:
1) Case sensitive? Is the anagram God the same as dog? (assume it is case sensitive God != dog)
2) Is whitespace significant? Is "god   " the same as "dog" ? (assumes whitespace is significant)


Performance:
Clean, easy to understand
Not that efficient
*/

import java.util.Arrays;
// Solution 2: Definition of an anagram: Two words with the same character count.
// NOTE: A char can be accessed by the char value. 

class countPermutation {

	public boolean permutation(String a, String b) {
		// If the length of strings are not the same then we cant have an anagram
		if(a.length() != b.length()) {
			return false;
		}

		// Assumption: ASCII letters
		int[] letters = new int[256];

		// Take the first String input and convert to char
		char[] aCharArray = a.toCharArray();
		// For each given char input, index on that value and increment the count
		for(char value : aCharArray) {
			//System.out.println("value " + value);
			letters[value]++;
			
		}
		//System.out.println("this: "+letters[111] + letters[103] + letters[102]);

		// Now loop through the second String input (b)
		for (int i = 0; i < b.length(); i++) {
			// We can access the location using the ASII int value
			int c = (int) b.charAt(i); // check
			// System.out.println(b.charAt(i) + ":" + c);
			// System.out.println(letters[c]);
			if(--letters[c] < 0) {
				return false;
			}	
		}
		return true;
	}

	
	public static void main (String args []){
		countPermutation cp = new countPermutation();
		System.out.println(cp.permutation("dog","god"));
		

	}
}