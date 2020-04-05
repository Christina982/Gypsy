/**
 * This class extends the AdultBeverages class. It will describes a wine beverage
 *
 * @author Jason Martinez
 * @version 1.0
 * @since Still durring the great pandemic, Charlie Brown
 */

public class Wine extends AdultBeverages {
	
	private static final String UPDATE_FIELD = "Needs to be updated";
	private static final String[] wineColors = {"red", "white", "pink", "blend"};
	private enum NitrateLevel { REGULAR, LOW, NONE, ERROR };

	private String grape;
	private String color;
	private String region;
	private String characteristics;
	private short year;
	private NitrateLevel nitrateLevel;
	private boolean kosher;

	public Wine() {
		super();
		this.grape = UPDATE_FIELD;
		this.color = UPDATE_FIELD;
		this.region = UPDATE_FIELD;
		this.characteristics = UPDATE_FIELD;
		this.year = 0;
		this.nitrateLevel = NitrateLevel.ERROR;
		this.kosher = false;
	}

	public Wine(String name, double abv, String desc, String grape, String color, String region,
			String characteristics, short year, String nitrateLevel, boolean Kosher) {
		super(name, abv, desc);
		this.grape = grape;
		this.color = this.getValidColor(color);
		this.region = region;
		this.characteristics = characteristics;
		this.year = year;
		this.nitrateLevel = getValidNitrateLevel(nitrateLevel);
		this.kosher = kosher;
	}

	public void setGrape(String grape) {
		this.grape = grape;
	}

	public void setColor(String color) {
		this.color = this.getValidColor(color);
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public void setNitrateLevel(String nitrateLevel) {
		this.nitrateLevel = this.getValidNitrateLevel(nitrateLevel);			
	}

	public void setKosher(boolean kosher) {
		this.kosher = kosher;
	}

	public String getGrape() {
		return this. grape;
	}

	public String getColor() {
		return this.color;
	}

	public String getRegion() {
		return this.region;
	}

	public String getCharacteristics() {
		return this.characteristics;
	}

	public short getYear() {
		return this.year;
	}

	public NitrateLevel getNitrateLevel() {
		return this.nitrateLevel;
	}

	public boolean isKosher() {
		return this.kosher;
	}

	private String getValidColor(String color) {
		for (String wineColor : wineColors) {
			if (wineColor.equalsIgnoreCase(color)) {
				return wineColor;
			}
		}
		return UPDATE_FIELD;
	}

	private NitrateLevel getValidNitrateLevel(String nitrateLevel) {	
		for (NitrateLevel nL : NitrateLevel.values()) {
			if (nL.toString().equalsIgnoreCase(nitrateLevel)) {
				return nL;
			}
		}
		return NitrateLevel.ERROR;
	}

	private String stringifyNitrateLevel(NitrateLevel nl) {
		String returnString = nl.toString().substring(0,1) 
			+ nl.toString().substring(1).toLowerCase();
		return returnString;
	}

	public String toString() {
		String kosher = (this.kosher) ? "Yes" : "No";
		return "\tGrape:\t\t\t\t\t" + this.grape
			+ "\tColor:\t\t\t\t\t" + this.color
			+ "\tRegion:\t\t\t\t" + this.region
			+ "\tCharacteristics:\t\t\t" + this.characteristics
			+ "\tNitrates:\t\t\t\t" + this.stringifyNitrateLevel(this.nitrateLevel)
			+ "\tKosher:\t\t\t\t" + kosher;
				
	}
}
