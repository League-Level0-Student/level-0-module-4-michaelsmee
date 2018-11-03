package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

public class StringMethods1 {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to whatever you want
		String str = "string";
		// 2. Print the 3rd char of your String to the console.
		System.out.println(str.charAt(3));
		// HINT: .charAt
		System.out.println(str);
		// 3. Print the length of your String to the console.
		// HINT: .length()
		System.out.println(str.length());
		// 4. Using a for loop, print one char at time to the console.
		// HINT: use .length() to determine how many loops
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		// 5. Pick a char inside your String, and use a loop to determine
		// what position/index in the String the char is located.
		// Print the char's position to the console.
		// EXAMPLE: if your string is "abc" and you are searching
		// for char 'b', then print "b is at index 1"
		char t = 'n';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == (t)) {
				System.out.println("your character " + t + " is at " + i);

			}
		}
	}
}
