/**
 * Driver to show function call ouput of functions class through an interactive ui
 *
 * @author Jason Martinez
 * @version 1.0
 * @since 4/11/2020
 */
import MyFunctions.MyFunctions;
import java.util.Scanner;

public class FunctionsDriver {
	
	public static void main(String [] args) {
		// initialize a Scanner object to get user input
		Scanner scanner = new Scanner(System.in);
		// initialize an object of type MyFunctions
		MyFunctions mf1 = new MyFunctions();

		System.out.println("This program will let you call methods by selecting a number");
		System.out.println("After each statement press any key to continue");
		waitForEnter();
		System.out.println("I have already initialized an Object of type MyFunctions");
		waitForEnter();
		System.out.println("You will be asked to make a selection to see one of the functions run");
		waitForEnter();
		String response;
		boolean run = true;
		while (run) {
			System.out.println("Select a function to see it's output, compare it to the code in MyFunctions.java");
			displayFunctionHeadings();
			response = scanner.nextLine();
			if(isBadResponse(response)) {
				System.out.println("The value you entered is invalid, please try again");
				continue;
			}
			if ("9".equals(response)) {
				run = false;
				continue;
			}
			System.out.println();
			callMethod(response, mf1);			
			waitForEnter();
		}
		System.out.println("Good bye!");
	}

	public static void waitForEnter() {
		try {
			System.in.read();
		} catch (Exception e) {}
	}

	public static void displayFunctionHeadings() {
		System.out.println("\n\t1. doNothing();" +
				"\n\t2. doOneThing();" + 
				"\n\t3. doMoreThanOneThing();" +
				"\n\t4. returnAnInt();" +
				"\n\t5. printArgs(String args);\t\t\tcalled with args = \"Hello from MyFunctions.printArgs\"" +
				"\n\t6. add5toProductOfArgs(int x, int y);\t\tcalled with the args 3 and 8" + 
				"\n\t7. callAnotherMethod();" +
				"\n\t8. someOtherMethod();" +
				"\n\t9. exit program");
	}

	public static boolean isBadResponse(String response) {
		return !"123456789".contains(response) || response.length() != 1;
	}

	public static void callMethod(String response, MyFunctions mf) {
		switch (response) {
			case "1" :
				mf.doNothing();
				break;
			case "2" : 
				mf.doOneThing();
				break;
			case "3" : 
				mf.doMoreThanOneThing();
				break;
			case "4" : 
				int retVal = mf.returnAnInt();
				System.out.println("Method retruned value of: " + retVal);				
				break;
			case "5" :
				String arg = "Hello from MyFunctions.printArgs";
				mf.printArgs(arg);
				break;
			case "6" :
				retVal = mf.add5ToProductOfArgs(3,8);
				System.out.println("Method returned value of: " + retVal);
				break;
			case "7" :
				mf.callAnotherMethod();
				break;
			case "8" :
				mf.someOtherMethod();
				break;
			default :
				System.out.println("invalid entry");
		}
	}
}
