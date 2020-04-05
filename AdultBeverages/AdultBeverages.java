/**
 * This is a base class that describes a drink menu
 *
 * @author Jason Martinez
 * @version 1.0
 * @since Sometime durring the greate pandemic of '20
 */

public abstract class AdultBeverages {
	private static final String UPDATE_FIELD = "Need to be updated!";

	private String name;
	private double abv;
	private String desc;

	public AdultBeverages() {
		this.name = UPDATE_FIELD;
		this.abv = 0.0;
		this.desc = UPDATE_FIELD;
	}

	public AdultBeverages(String name, double abv, String desc) {
		this.name = name;
		this.abv = abv;
		this.desc = desc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setABV(double abv) {
		this.abv = abv;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return this.name;
	}

	public double getABV() {
		return this.abv;
	}

	public String getDesc() {
		return this.desc;
	}

	public String toString(String childToString) {
		String divider = 
			"*********************************************************************************************";
		return divider + "\n" 
			+ "\n\tName:\t\t\t\t" + this.name
			+ "\n\tAlcohol By Volume:\t\t" + this.abv
			+ "\n\tDescription:\t\t\t" + this.desc
			+ "\n" + childToString
			+ "\n\n" + divider;
	} 
}
