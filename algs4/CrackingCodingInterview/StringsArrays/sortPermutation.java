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
class sortPermutation {


// Solution 1: Sort the strings
	public String sort(String s) {
		// Creates a char array with the content inside of s
		char[] content = s.toCharArray();
		// Use the java.util.Arrays sort function that takes in a char[] array
		Arrays.sort(content);
		return new String(content);
	}

	public boolean permutation(String a, String b) {
		// If the lengths are not equivalent then 
		if(a.length() != b.length()) {
			return false;
		}
		return sort(a).equals(sort(b));
	}

	public static void main (String args []){
		sortPermutation p = new sortPermutation();
		System.out.println(p.permutation("Gog","god"));
	}
}