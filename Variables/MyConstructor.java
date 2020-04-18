package com.lesson2.varfunct;
/**
 * This class gives a brief overview of Constructor in java
 *
 * @author Jason Martinez
 * @version 1.0
 * @since 4/11/2020
 */

public class MyConstructor {

	// instance variables
	private String mcString;
	private double mcDouble;
	private int mcInt;
	private String mcString2;

	// Constructors
	// constructors are methods with a special purpose - to make or "construct" an object
	// we create/construct an instance of a class with the keyword "new"
	// 	- the "new" keyword tells the java compiler to reserve space in the heap for the type being created
	// 	- java knows how much space based on the class definition based on the number and types of instance variables it has
	// 	- in this example:
	// 		- MyConstructor needs space for:
	// 			- two strings
	// 			- one double
	// 			- one int
	// 	- once the space is reserved the Constructor is called
	// 	- the final construction statement looks like: "new <Class>();", in our case "new MyConstructor();"
	public MyConstructor() {
		// ** notice there is no type in the declaration, constructors have the type of the class
		//     - they "construct" an instance of the class(this is called instantiation)
		// every line of code in this block will be executed in order
		System.out.println("Called \"no args\" constructor, this is the first line to be executed");
		System.out.println("this is the second line ...");
		System.out.println("... and so on ....");
		System.out.println("... and so forth!");
	}

	// we can have multiple constructors for one class, the one above has no parameters(params), the one below does
	public MyConstructor(String mcString) {
		System.out.println("Called constructor with one parameter of type string, this is the first line of execution");
		System.out.println("This is the second line of execution, the third line of execution assigns the " +
				"\nargument passed(" + mcString + ") in to the instance variable \"mcString\" " +
				"\n**** this is still the second line of execution ****");
		this.mcString = mcString;
	}

	public MyConstructor(double mcDouble) {
		System.out.println("Called constructor with one parameter of type double, this is the first line of execution");
		System.out.println("This is the second line of execution, the third line of execution assigns the " +
				"\nargument passed(" + mcDouble + ") in to the instance variable \"mcString\" " +
				"\n**** this is still the second line of execution ****");
		this.mcDouble = mcDouble;
	}

	public MyConstructor(int mcInt) {
		System.out.println("Called constructor with one parameter of type int, this is the first line of execution");
		System.out.println("This is the second line of execution, the third line of execution assigns the " +
				"\nargument passed(" + mcInt + ") in to the instance variable \"mcString\" " +
				"\n**** this is still the second line of execution ****");
		this.mcInt = mcInt;
	}

	public MyConstructor(String mcString, double mcDouble, int mcInt) {
		System.out.println("Called \"all args\" constructor, first line of execution");
		System.out.println("This is the second line of exeution\nline 3 of execution assigns the string passed in to mcString, " +
				"\nline 4 of execution assigns the double passed in to mcDouble, " + 
				"\nline 5 of execution assigns the int passed in to mcInt" );
		this.mcString = mcString;
		this.mcDouble = mcDouble;
		this.mcInt = mcInt;
	}

	// **** although you can have any number of params in your constructor it is usually best to only use a "no args" or an "all args" ****
	// the compiler will check each constructor in the order they appear in the class until it finds the first constructor that matches the arguments passed in
	// public MyConstructor(String mcString2) {
		// this constructor will never run
		// if you try to call with the following code: 		
		// 		
		// 		String mcString2Param = "This is some string that I want to pass to a constructor to assign to mcString2 in the MyConstructor class";
		// 		MyConstructor mc = new MyConstructor(mcString2Pram);
		//
		// the compiler will look for the first constructor with a single String parameter and use it, in the case of our class it 
		// 	finds the constructor with the heading "public MyConstructor(String mcString), this means that this constructor will never be called
	//	this.mcString2 = mcString2;	// this is dead code(meaning it will never run)
	// }  after trying to compile I learned that java will not let you compile this for the reasons stated above

	public MyConstructor(MyConstructor myConstructor) {
		// this is a copy constructor, it copies all the values of the one passed in and assigns it to the one being constructed(this)
		this.mcString = myConstructor.getMcString();
		this.mcDouble = myConstructor.getMcDouble();
		this.mcInt = myConstructor.getMcInt();
	}

	// recap:
	// constructors are called to instantiate objects
	// they reserve memory space in the heap that can fit all the instance vars of this class
	// when you call a constructor you have to you use the java keyword "new" before the constructor
	// you can have many constructors, java will use the first one that matches the list of arguents you passed to the constructor

	
	// below is code needed to make the copy constructor work
	public String getMcString() {
		return this.mcString;
	}

	public double getMcDouble() {
		return this.mcDouble;
	}

	public int getMcInt() {
		return this.mcInt;
	}

	public String mcToString() {
		return "\tMyConstructor:\n\t\tmcString: " + this.mcString + "\n\t\tmcDouble: " +
			"\n\t\tmcInt: " + this.mcInt + "\\n\t\tmcString2: " + this.mcString2;
	}
}
