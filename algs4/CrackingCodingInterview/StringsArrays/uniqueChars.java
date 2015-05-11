/*
	Implement am algorithm to determine if a string has all unique characters. 
	What if you cannot use additional datastructures ?
*/

/*
	Questions to ask:
	1) Is this string ASCII or unicode ?
	Lets assume this is ASCII. 8 bits = 2^8 = 256
	If it was unicode then increase the storage size (logic is all the same).	
*/

class uniqueChars {

	// O(n) where n is the length of the string. Space complexity: O(1)
	public boolean isUniqueChars(String str) {
		// 256 is the maximum number of unique chars for ASCII 
		if(str.length() > 256) 
			return false;
		// Store the state of each char 
		boolean[] charSet = new boolean[256];

		// Loop through all chars within the string 
		for (int i = 0; i < str.length(); i++) {
			// grab the index 
			int asciiNumberRepresentation = str.charAt(i); //str[i]
			//System.out.println(asciiNumberRepresentation);
			// We use the asciiNumberRepresentation as an index. Note that this array is sparse and has gaps
			if(charSet[asciiNumberRepresentation] == true) {
				return false;
			}
			// This inde
			charSet[asciiNumberRepresentation] = true;
		}
		return true;
	}  

	// Test code
	public static void main (String args[]){
		// Input strings: abcdefghijklmnopqrstuvwxyz = 26 characters
		uniqueChars uc = new uniqueChars();
		System.out.println(uc.isUniqueChars("HELoo"));
	}

};