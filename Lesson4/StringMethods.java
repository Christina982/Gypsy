/**
 *
 */

public class StringMethods {
	
	public static void main(String [] args) {
		
		String str1 = "       Hello World       ";
		str1.trim();
		System.out.println(str1);
		// output should = "       Hello World       "
		str1 = str1.trim();
		System.out.println(str1);
		//  output should  = "Hello World"
		int str1Length = str1.length();
		System.out.println(str1Length);
		// output should = 11
		char thirdChar = str1.charAt(2);
		System.out.println(thirdChar);
		// should output = 'l'
		//  0  1  2  3  4  5  6  7  8  9  10
		// [H][e][l][l][o][ ][W][o][r][l][d]
		char sixthChar = str1.charAt(5);
		System.out.println(sixthChar);
		// output should = ' '
		String subString = str1.substring(5);
		System.out.println(subString);
		// output should = " World"
		String subString2 = str1.substring(2, 8);
		System.out.println(subString2);
		// output should = "llo Wo"
		String concatenatedString = str1.concat("add this to str1ing");
		System.out.println(concatenatedString);
		// output should = "Hello Worldadd this to str1ing"
		System.out.println(str1);
		// output should = "Hello World"
		boolean isSameString = str1.equals("hello world");
		System.out.println(isSameString);
		// output should = false
		isSameString = "Hello World".equals(str1);
		System.out.println(isSameString);
		// output should = true
		boolean isSameStringWithoutCase = str1.equalsIgnoreCase("hello world");
		System.out.println(isSameStringWithoutCase);
		// output should = true
		int compare = "a".compareTo("b");
		System.out.println(compare);
		// "a" compared to "b", a comes before b, or is less than b, so...
		// output should = -1
		compare = "b".compareTo("a");
		System.out.println(compare);
		// "b" compared to "a", b comes after a, or is greater than, so ...
		// output should = 1
		compare = "a".compareTo("a");
		System.out.println(compare);
		// output should = 0
		int indexOfWorld = str1.indexOf("World");
		System.out.println(indexOfWorld);
		// output should = 6
		int indexDoesNotExist = str1.indexOf("goodbye");
		System.out.println(indexDoesNotExist);
		// output should = -1
		String changedString = str1.replace('o', '?');
		System.out.println(changedString);
		// output should = "Hell? W?rld"
		String [] str1Array = "Hello World and Goodbye".split(" ");
		// will break up the string into seperate strings and store them in an array: ["Hello"]["World"]["and"]["Goodbye"]
		// 	**** removes the string that you are splitting by, in our case " "
		for (String s : str1Array) {
			System.out.println(s);
		}
		// output should = 
		// 	"Hello"
		// 	"World'
		// 	"and"
		// 	"Goodbye"

	}
}
