package MyFunctions;

/**
 * This is a brief overview of Functions and how they work in java
 *
 * @author Jason Martinez
 * @version 1.0
 * @since 4/11/2020
 */

public class MyFunctions {
	
	int mfInt;
	String mfString;
	// many languages have functions
        // in java functions are called methods, it means almost the same thing
        //      - a method is what we call functions when we are using object oriented programming
        //      **** Java is an Object Oriented Programming(OOB), more on that later ****
        // a method/function is a set of instructions to be run sequentially
        // in java they must be declared and defined in a class, ie:
        //
        //              public class MyClass {
        //                      <all my functions go here>
        //              }
	// methods must have a heading that declares it's scope, return type and a parameter list(this can be empty):
	//
	// 		public String getInfoFromSomewhere(int arg1, String arg2) {
	//			// any number of instructions to be executed
	// 		}
	// 	- scope - how visible this method is, or who can see it(we will learn more about this later)
	// 		- four options:
	// 			1. public - most visible
	// 			2. package - a little less visible
	// 			3. protected - even less visible
	// 			4. private - least visible
	// 		**** the above explination is has been reduced from true meanings, again, will cover later ****
	// 	- return type
	// 		- a method must return a value
	// 		- the value returned can be an object, a primitive or a void(nothing)
	// 	- the parameter list is contained in "()"
	// 		- you can have any number of parameters/params
	// methods must have the three componenets listed above, additionally they can have some other things in the 
	// 	heading, we will learn about these later
	// some of the most common methods are Constructors, getters, setters and toString methods
	// 	- almost every class has these methods
	
	// this is a method that does absolutely nothing
	public void doNothing() {
		// this method has no lines to execute so it does nothing
		// notice it has a retrun value of void, when this is the case you do not need a retrun statement
		// it has an empyt parameters list, so when it is called you cannot pass any arguments
		// 	myFunctions1.doNothing("hello"); will not work, the arg list must be empyt cuz the param list is empty
		// 		** the arg list must match the param list when calling **
	}

	// this method has one line of execution, no params, no return type
	public void doOneThing() {
		System.out.println("This is the first and only line of execution for the method doOneThing()");
	}

	// this method has multiple lines of instructions, they will execute in order
	public void doMoreThanOneThing() {
		System.out.println("First intruction");
		System.out.println("Second intruction");
		System.out.println("Third intruction");
		System.out.println("Fourth intruction");
		System.out.println("Fifth intruction");
	}

	// the following has one instruction, that is to return an int
	public int returnAnInt() {
		// has return type in heading so we must retrun a value of that type, in this case an int
		return 1;
	}

	// the following method has no return type but it does have a parameter
	public void printArgs(String arg1) {
		// again, when we call this method the arg list must match the param list
		System.out.println("First line of execution is to print arg1: " + arg1);
	}

	// method can have both a return type and param list
	public int add5ToProductOfArgs(int x , int y) {
		return 5 + (x * y); // this method has one line to execute, a retrun statement
	}

	// getters
	public int getMfInt() {
		return this.mfInt;
	}

	public String getMfString() {
		return this.mfString;
	}

	// setters
	public void setMfInt(int mfInt) {
		this.mfInt = mfInt;
	}

	public void setMfString(String mfString) {
		this.mfString = mfString;
	}

	// toString - used to display all your instande variables in a meaningful way
	public String toString() {
		return "\tMyFunctions:\n\t\tmfInt: " + mfInt + "\t\tmfString: " + mfString;
	}

	// a method can hava any amount of args and any amount of statements(instructions)
	// it is best to try to keep each of these smaller to reduce complexity
	// one of the statement options in a function is to call another function
	// this method takes no args, it just calls other methods
	public void callAnotherMethod() {
		System.out.println("callAnotherMethod() envoked");
		System.out.println("next calling a someOtherMethod()");
		someOtherMethod();
		System.out.println("returned from someOtherMethod(), back in callAnotherMethood()");
		System.out.println("exiting callAnotherMethod()");
	}

	public void someOtherMethod() {
		System.out.println("in someOtherMethod()");
		System.out.println("this method will run to completion before returning to callAnotherMethod()");
		System.out.println("someOtherMethod hhas has completed, exiting someOtherMethod()");
	}
}
