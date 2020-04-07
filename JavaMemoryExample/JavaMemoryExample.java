/**
 * Brief overview of how memroy is allocated in java
 *
 * @author Jason Martinez
 * @version 1.0
 * @since April 5, 2020
 */

public class JavaMemoryExample {
	
	public static void main(String [] args) {
		String string1;
		String string2;
		Tina tina1;
		/*
			Stack									Heap								_________________________
																					   |         <Type>          |
			 ___________															   |_ _ _ _ _ _ _ _ _ _ _ _ _|
			|Tina       |	  						0x2342 : "some string"			   |         <Name>          |
			|_ _ _ _ _ _|							0x2343 : "have a nice day"		   |_ _ _ _ _ _ _ _ _ _ _ _ _|
			|tina1      |	  						0x2344 : Tina					   |<pointer/primitive value>|
			|_ _ _ _ _ _|															   |_________________________|
			|0x2344     |
			|___________|
			|String     |	  
			|_ _ _ _ _ _|
			|strings    |	  
			|_ _ _ _ _ _|
			|0x2343     |
			|___________|
			|String     |	  
			|_ _ _ _ _ _|
			|string1    |	  
			|_ _ _ _ _ _|
			|0x2343     |
			|___________|			
			
			*/

	
		string1 = "some string";
		string2 = "have a nice day";
		tina1 = new Tina();
		string1 = null;
		string1 = string2;
		string2 = string1; 			// wont work
		System.out.prinln(string1);		// output: "have a nice day"
		string1 = tina1; 				// wont work
		
		
		AdultBeverages ab = new Wine();
		Wine wine = new AdultBeverages();  //wont work
		Wine wine2 = new Wine();
		
		/*
			Stack									Heap
			 ___________
			|Wine       |	  						0x2345 : Wine
			|_ _ _ _ _ _|							0x2346 : Wine
			|wine2      |	  
			|_ _ _ _ _ _|
			|0x2346     |
			|___________|
			|AdultBevera|	  
			|_ _ _ _ _ _|
			|ab         |	  
			|_ _ _ _ _ _|
			|0x2345     |
			|___________|
			
		*/
		
		// Primitives in memory
		int someInt = 4;
		char someChar = '@';
		boolean isSomeVar = false;
		Object someObj = null;
		
		/*
			Stack 							*****  Primitives do not have a pointer to the heap,
			 ___________								they have an actual value where the pointer would be
			|int        |	  
			|_ _ _ _ _ _|
			|someInt    |	  
			|_ _ _ _ _ _|
			|4          |
			|___________|
			|char       |	  
			|_ _ _ _ _ _|
			|someChar   |	  
			|_ _ _ _ _ _|
			|@          |
			|___________|
			|boolean    |	  
			|_ _ _ _ _ _|
			|isSomeVar  |	  
			|_ _ _ _ _ _|
			|false      |
			|___________|
			|Object     |	  
			|_ _ _ _ _ _|
			|someObj    |	  
			|_ _ _ _ _ _|
			|null       |
			|___________|
			
		*/
		
		/*
				Arrays in memory
			 ___________________________
			|     <Array Type>          |
			|_ _ _ _ _ _ _ _ _ _ _ _ _ _|
			|     <Variable Name>       |
			|_ _ _ _ _ _ _ _ _ _ _ _ _ _|
			|	  <Array Size>		    |
			|_ _ _ _ _ _ _ _ _ _ _ _ _ _|
			|<Pointer to start of array>|
			|___________________________|
			
		*/
			String[] myStringArray = {"Some string", "some other string", "String number 3", "Finally, one last string"};
			/*
				Stack												Memory
			 _________________________
			|   Type: String		  |			 ----------------->	0x2538 : "Some string"							// myStringArray[0]
			|_ _ _ _ _ _ _ _ _ _ _ _ _|			|					0x2539 : "some other string"					// myStringArray[1]
			|   Name: myStringArray   |			|					0x2540 : "String number 3"						// myStringArray[2]
			|_ _ _ _ _ _ _ _ _ _ _ _ _|			|					0x2541 : "Finally, one last string"     		// myStringArray[3]
			|	Size: 4				  |			|	
			|_ _ _ _ _ _ _ _ _ _ _ _ _|			|
			|   Pointer: 0x2538 	  |_________|
			|_________________________|
			
		*/
	}
}