/**
 *
 */

public class ObjectLesson {

	// instance variables
	// also called properties, fields, members
	// thier purpose is to hold data
	private String objectName;
	private int objectAge;	

	// methods
	// 	constructors - you can have as many as you want
	public ObjectLesson() {
		this.objectName = "some Name";
		this.objectAge = 100;
	}

	public ObjectLesson(String objectName, int objectAge) {
		this.objectName = objectName;
		this.objectAge = objectAge;
	}
	

	// setters, also called mutator methods
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public void setObjectAge(int objectAge) {
		this.objectAge = objectAge;
	}
	
	// getters, also called accessor methods
	public String getObjectName() {
		return this.objectName;
	}

	public int getObjectAge() {
		return this.objectAge;
	}

	// other methods
	public String toString() {
		return "Hello, my name is " + this.objectName + 
			", and I am " + this.objectAge + " days old!";
	}

}
