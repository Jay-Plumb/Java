/*
Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end of the string to hold the additional characters, and that you are given the 'true' length of the string. Please use a character array so that you can perform this operation in place.  
*/

// We have to pass the array twice as we are using a char[] array
// Note that %20 as a char requires 3 spots. 
public class replaceStringInPlace {

	public char[] replaceSpaces(char[] str, int length) {
		// System.out.println(str);
		// System.out.println("length is:" + length);
		int spaceCount = 0, newLength, i;
		// First loop through the string to count how many spaces we have
		for(i = 0; i < length; i++) {
			if(str[i] == ' ')
				spaceCount++;
		}
	
	newLength = length + spaceCount * 2; // spaceCount*2 because in terms of space we want to fill up occupied space + current empty space + 2*spaceCount.
    // We are working backwards. 
	System.out.println(newLength);
	str[newLength] = '\0';

		// Looping over original data 
		for(i = length - 1; i>=0; i--) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			}else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}

		return str;
	}

	public static void main(String[] args) {
		replaceStringInPlace rsip = new replaceStringInPlace();
		/*
		String input = "hel o";
		char[] inputChar = new char[input.length()];
		for(int i=0; i < input.length(); i++){
			inputChar[i] = input.charAt(i);
		}
		*/
		// Assumption: sufficient space at the end of the character array
		char[] input = {'t', ' ','h', 'e', ' ', 'd', 'o', 'g',' ',' ',' ',' ',' ',' ',' ',' ',' ', ' '};

		//System.out.println(ch.length);
		char[] output = rsip.replaceSpaces(input,8);
		System.out.println(output);
	}
}