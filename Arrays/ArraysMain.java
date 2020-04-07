/**
 * Lesson: To gain a basic understanding of Arrays and how they work in Java
 *
 * @author Jason Martinez
 * @version 1.0
 * @since That morning during the pandemic that I woke up at 5am and could not got back to sleep
 */

public class ArraysMain {
	
	public static void main(String[] args) {
		
		// How to declare an array, must have a type, a name, and "[]"
		int[] intArray;			// most traditional declaration
		int [] whatEverNameYouWant;	// there can be a space after type and "[]"
		String[] stringArray;		
		String shabado[];		// the "[]" can be after the variable name

		// How to instantiate an array, multiple ways
		intArray = new int[10];		// instantiates an array of size 10 and
						//	assigns it to the variable "intArray"
						//	each element will be some default value
		
		whatEverNameYouWant = new int[] {3, 0, -4, 75, 10101010};
						// also instantiates an array but assigns values
						// 	to each element of the array, in this
						// 	case, since we added 5 ints it will be
						// 	size 5
		
		// stringArray = new String[];	this will not work because you did not declare
						// 	a size, it wont compile
		
		stringArray = new String[] {"These", "must", "match", "the", "array type"};
						// the elements of the array must be of the 
						// same type as the declaration or must be a
						// descendent of the declaration type
		
		shabado = stringArray;		// you can assign as array to another array as
						// long as it is of the same type or a type 
						// that is a descendant from the declaration type
		
		// How to refernece element of the array

		// you reference an element of an array by it's index, ie: varName[<index>]
		// 	note: in java arrays are zero indexed, this means the first index is 0
		// 	also: no "new char[]" needed if initialized(declared and instantiated)
		char [] charArray = {'d', '4', '$', '{', 'J'};
		System.out.println(charArray[0]);	// output: d
		System.out.println(charArray[1]);	// output: 4
		System.out.println(charArray[2]);	// output: <your guess here>
		System.out.println(charArray[3]);	// output: <your guess here>
		System.out.println(charArray[4]);	// output: <your guess here>

		// you can assign and re-assign value to an array index
		charArray[0] = '5';		// charArray now =
							//   {'5', '4', '$', '{', 'J'}
		System.out.println(charArray[0]);	// output: 5
		charArray[0] = '>';
		System.out.println(charArray[0]);	// output: <your guess here>

		// you can substitute variables for indexes or values		
		int cIndex = 3;
		char cValue = 'h';
		charArray[cIndex] = cValue;		// same as: charArray[3] = 'h';
		System.out.println(charArray[cIndex]);	// output: <your guess here>
		cIndex = 4;
		cValue = '*';
		charArray[cIndex] = cValue;
		System.out.println(charArray[cIndex]);	// output: <your guess here>
		int var1 = 5;
		int var2 = 1934;
		int someOtherVar = -24;
		int theHashSlingingSlasher = 7;
		int[] anotherIntArray = {var1, var2, someOtherVar, var2, theHashSlingingSlasher};
		
		System.out.println(anotherIntArray[0]);	// output: <your guess here>
		System.out.println(anotherIntArray[1]);	// output: <your guess here>
		System.out.println(anotherIntArray[2]);	// output: <your guess here>
		System.out.println(anotherIntArray[3]);	// output: <your guess here>
		System.out.println(anotherIntArray[4]);	// output: <your guess here>

	}
}

