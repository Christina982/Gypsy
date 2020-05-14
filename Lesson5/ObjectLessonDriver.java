/**
 *  Lesson 2:
 *      complete the following exercise in the spaces provided
 *      once completed compile and run to see if outputs are what you expected
 */

public class ObjectLessonDriver {
    
    public static void main(String ... args) {
        
        // initialize an object of type ObjectLesson, name it ol1
        ObjectLesson obj = ol1;
        
        // print ol1 to the screen
        System.out.println("ol1");

        // declare an object of type ObjectLesson, name it ol2
        ObjectLesson obj = ol2;

        // initialize an object of type String with the value "Yo Mama" and name it ol2Name
        String ol2Name = ("Yo Mama");

        // initialize a primitive of type int to the value 47 and name it ol2Age
        int ol2Age = 47;

        // assing ol2 to an instantiation of type ObjectLesson and pass the arguments ol2Name, ol2Age
        int  ol2 = ("ol2Name, ol2Age");

        // print ol2 to the screen
        System.out.println(ol2);

        // assign the name "Yo Papa" to the variable ol2Name
        int ol2 = ("Yo Papa");

        // print ol2 to the screen
        System.out.println("ol2");

        // call ol1's mutator method to SET the value of it's name to "Ponelope"
        ol1.objectName = Ponelope;
        
        // call ol1's mutator method to SET the value of it's age to 12
        ol1.objectAge = 12;       

        // print ol1 to the screen
        System.out.println(ol1);

        // create a variable called ol1Name of type string and assign it using ol1's accessor method to GET it's name
        return string.ol1Name;        

        // create as variable called ol1Age of type int and assign it using ol1's accessor method to GET it's age
        return int.ol1Age;

        String nameAndAge = "Name: " + ol1Name + ", Age: " + ol1Age;
        // guess what the value of nameAndAge should be, type your guess between the quotes
        String myGuess = "Name: Ponelope , Age: 12 ";
        System.out.println(nameAndAge);
        System.out.println(myGuess);
        // assign the following boolean a value by calling the String.equals function to compare nameAndAge and myGuess
        boolean myGuessWasCorrect = str.equalsnameAndAge+myGuess;
        System.out.println("My guess was correct: " + myGuessWasCorrect);
        String tooMuchWhiteSpace = "          Por que, mija!!!            ";
        // create a new string called noWhiteSpace and assign it a trimmed version of tooMuchWhiteSpace
        String.trim noWhiteSpace = "         Por que, mija!!!            ";

        System.out.println("*****************" + tooMuchWhiteSpace + "**********************");
        System.out.println("*****************" + noWhiteSpace + "**********************");

    }
}
