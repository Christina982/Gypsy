
import java.util.Scanner;
/**
 * Driver to explain how blocks work in java
 *
 * @author Jason Martinez
 * @version 1.0
 * @since April 8, 2020
 */

public class BlockDriver
{
    public static void main(String ... args) {
        Scanner scanner = new Scanner(System.in);
        BlocksLesson bl = new BlocksLesson();
        
        System.out.println("BlocksLesson class has to instance variables, age(int) and name(string)");
        System.out.println("(press enter after each line to continue)");
        waitForEnter();
        System.out.println("Age is defaulted to 5 and name is an empty string");
        waitForEnter();
        
        boolean run = true; 
        while (run) {
            System.out.println("Make a selection from the optins below to run a method from the class");
            String response = "";
            printOptions();
            response = scanner.nextLine();
            
            if (isBadResponse(response)) {
                System.out.println("Invalid selection, try again");
                continue;
            }
            
            if ("8".equals(response)) {
                run = false;
                continue;
            }
            
            System.out.println();
            callMethod(response, bl);
            waitForEnter();
        }
        
        System.out.println("Good bye!!");
    }
    
    
    public static boolean isBadResponse(String response) {
    	return !"12345678".contains(response) || response.length() != 1;
    }

    public static void waitForEnter() {
    	try {
    	    System.in.read();
    	} catch (Exception e) {}
    }
    
    public static void printOptions() {
        System.out.println("\n\t1. setAge(int agePassedIn);" +
				"\n\t2. setName(String name);" + 
				"\n\t3. getAge();" +
				"\n\t4. getName();" +
				"\n\t5. whoCanSeeMe(String args);" +
				"\n\t6. whoCanGetOut();" + 
				"\n\t7. watchMeAge();" +
				"\n\t8. exit program");
    }
    
    public static void callMethod(String response, BlocksLesson bl) {
        Scanner scanner = new Scanner(System.in);
        switch (response) {
            case "1" :
                System.out.println("What age do you want to assign");
                response = scanner.nextLine();
                int newAge = 0;
                try {
                    newAge = Integer.parseInt(response);
                } catch (Exception e) {
                    System.out.println("Invalid input, must enter a number");
                    return;
                }
                bl.setAge(newAge);
                break;
            case "2" : 
                System.out.println("What name do you want to assign");
                response = scanner.nextLine();
                bl.setName(response);
                break;
            case "3" : 
                int myAge = bl.getAge();
                System.out.println("getting age -> " + myAge);
                break;
            case "4" : 
                String myName = bl.getName();
                System.out.println("getting name -> " + myName);				
                break;
            case "5" :
                System.out.println("What string do you want to pass to the method");
                response = scanner.nextLine();
                bl.whoCanSeeMe(response);
                break;
	    case "6" :
	       bl.whoCanGetOut();
	       break;
	    case "7" :
	       bl.watchMeAge();
	       break;
	    default :
	       System.out.println("invalid entry");
    	}
    }
}
