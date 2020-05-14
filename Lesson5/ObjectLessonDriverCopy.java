/**
 *	Lesson 2:
 *		complete the following exercise in the spaces provided
 *		once completed compile and run to see if outputs are what you expected
 */

public class ObjectLessonDriver {
	
	public static void main(String ... args) {
		
		// initialize an object of type ObjectLesson, name it ol1
	 	ObjectLesson ol1 = new ObjectLesson();		

		// print ol1 to the screen
		System.out.println(ol1);

		// declare an object of type ObjectLesson, name it ol2
		ObjectLesson ol2;

		// initialize an object of type String with the value "Yo Mama" and name it ol2Name
		String ol2Name = "Yo Mama";

		// initialize a primitive of type int to the value 47 and name it ol2Age
		int ol2Age = 47;

		// assing ol2 to an instantiation of type ObjectLesson and pass the arguments ol2Name, ol2Age
		ol2 = new ObjectLesson(ol2Name, ol2Age);

		// print ol2 to the screen
		System.out.println(ol2.toString());

		// assign the name "Yo Papa" to the variable ol2Name
		ol2Name = "Yo Papa";

		// print ol2 to the screen
		System.out.println(ol2);

		// call ol1's mutator method to SET the value of it's name to "Ponelope"
		ol1.setObjectName("Ponelope");
		
		// call ol1's mutator method to SET the value of it's age to 12
		ol1.setObjectAge(12);

		// print ol1 to the screen
		System.out.println(ol1.toString());

		// create a variable called ol1Name of type string and assign it using ol1's accessor method to GET it's name
		String ol1Name = ol1.getObjectName();

		// create as variable called ol1Age of type int and assign it using ol1's accessor method to GET it's age
		int ol1Age = ol1.getObjectAge();

		String nameAndAge = "Name: " + ol1Name + ", Age: " + ol1Age;
		// guess what the value of nameAndAge should be, type your guess between the quotes
		String myGuess = "Name: Ponelope, Age: 12";
		System.out.println(nameAndAge);
		System.out.println(myGuess);
		// assign the following boolean a value by calling the String.equals function to compare nameAndAge and myGuess
		boolean myGuessWasCorrect = nameAndAge.equals(myGuess);
		System.out.println("My guess was correct: " + myGuessWasCorrect);
		String tooMuchWhiteSpace = "          Por que, mija!!!            ";
		// create a new string called noWhiteSpace and assign it a trimmed version of the varialbe tooMuchWhiteSpace
		String noWhiteSpace = tooMuchWhiteSpace.trim();

		System.out.println("*****************" + tooMuchWhiteSpace + "**********************");
		System.out.println("*****************" + noWhiteSpace + "**********************");

	}
}
