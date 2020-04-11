package Gypsy.Variables;
/**
 * General explanation of how variables work in java
 *
 * @author Jason Martinez
 * @version 1.0
 * @since April 8, 2020
 */
import Gypsy.TinaDriver.Tina;

public class VariablesDriver {
	
		public static void main(String ... args) {
			
		// variables must have a type:
		// 	some that we have seen: int, boolean, short, double, String, Object
		// variables need to be declared with a type or a name
		// 	ie: 
		int myInt;
		String myString;
		Tina tina;
		
		//  you can name variables whatever you want as long as they follow a few 
		//  	syntax rules:
		//  		1. can contain letters, numbers, '_' or '$'
		//  		2. CANNOT start with a number
		//  		3. if starting with a letter it SHOULD be lower case
		//  		4. can be any legnth
		//  		5. SHOULD be descriptive of what it is holding
		//  		6. should use camelCase
		//  		7. variable names are case sensitive, varname not equal to varName
		int validName;
		String _also_a_valid_name;
		double $doubleDouble;
		Tina Tina;	// is legal but bad practice, should be tina to differentiate
				// 	between "Tina" the variable and "Tina" the type
		char under_$core;
		// boolean 1NotValid;	// this will not compile
		// String not^Valid;	// this will not compile

		// variables are used to store a value or a pointer
		// if the variable is a primitive type then it holds a value(4, -5. 3.2, c, ^, true, false, null)
		int someInt = 4;		// creates an element in the stack that looks like: 	[ int | someInt | 4 ]
		boolean _bool = false;		//	"	[ boolean | _bool | false ]
		boolean isValid = true; 	//	"	[ boolean | isValid | true ]
		char myChar$$ = '%';		//	"	[ char | myChar$$ | % ]
		float $float1of2 = (float)1.1; 	//	"	[ float | $float1of2 | 1.1 ]
		float $float2of2 = 3.14f;	// 	" 	[ float | $float2of2 | 3.14 ]

		// if the variable is not a primitive type then it holds a pointer
		Tina tina2 = new Tina();	// creates an element in the stack that looks like this:  [ Tina | tina2 | 0x4356 ]
						// also creates an element in the heap: 		  [ 0x4356 | < Some Tina object > ]
		Object obj1 = new Tina();	//  	in stack   -	[ Object | obj1 | 0x4357 ]
						//	in heap	   - 	[ 0x4357 | < Some Tina object > ]
		String string1 = "My string";	//	in stack   - 	[ String | string1 | 0x4358 ]
						//	in heap    - 	[ 0x4358 | "My string" ]
		
		// we can declare a variable: <type/class> <name>
		float myVar;
		float myOtherVar;
		Tina tina3;

		// we can assign a variable to a primitive value, another variable or an instantiation: 
		// <variable name> = <primitive value> | <variable name> | <instantiation>   ( '|' means "or" )
		myVar = 9.3f; 			// myVar = primitive value
		myOtherVar = 4.321f;
		myVar = myOtherVar;		// myVar = another variable
		tina3 = new Tina();		// tina3 = instantiation

		// the purpose of variables is to use the value we assign to them
		// we use the value by placing the variable where the value is needed
		int x = 3;
		int y = 4;
		int sum = x + y;		// this is the same as saying "int sum = 3 + 7;"
		System.out.println("x + y = " + sum);
			
	}

}
