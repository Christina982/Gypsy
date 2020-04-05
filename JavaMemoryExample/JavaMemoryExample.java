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
			______
			|Wine  |  
			|______|
			|tina1 |
			|______|
			|0x2344|
			|______|
			______
			|Wine|  
			|______|
			|string2|
			|______|
			|0x2343|
			|______|
			 _____
			|AdultBev|  
			|______|
			|string1|
			|______|
			|0x2343  |
			|______|
			
			0x2342 : "some string"
			0x2343 : "have a nice day"
			0x2344 : Tina
			
*			*/

	
		string1 = "some string";
		string2 = "have a nice day";
		tina1 = new Tina();
		string1 = null;
		string1 = string2;
		string2 = string1; 			// wont work
		System.out.prinln(string1);		// output: "have a nice day"
		string1 = tina1;
		AdultBeverages ab = new Wine();
		Wine wine = new AdultBeverages();  //wont work
	}
}
