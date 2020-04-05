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
			 ___________
			|Tina       |	  
			|_ _ _ _ _ _|
			|tina1      |	  
			|_ _ _ _ _ _|
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
			
			
			
			0x2342 : "some string"
			0x2343 : "have a nice day"
			0x2344 : Tina
			
			*/

	
		string1 = "some string";
		string2 = "have a nice day";
		tina1 = new Tina();
		string1 = null;
		string1 = string2;
		string2 = string1; 			// wont work
		System.out.prinln(string1);		// output: "have a nice day"
		string1 = tina1; 				// wont work
		
		
		//////////////////////////////////////////////////////////////////////////
		AdultBeverages ab = new Wine();
		Wine wine = new AdultBeverages();  //wont work
		Wine wine2 = new Wine();
		
		/*
			 ___________
			|Wine       |	  
			|_ _ _ _ _ _|
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

			0x2345 : Wine
			0x2346 : Wine
		*/
		
		int someInt = 4;
		char someChar = '@';
		boolean isSomeVar = false;
		Object someObj = null;
		
		/*
			 ___________
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
	}
}
