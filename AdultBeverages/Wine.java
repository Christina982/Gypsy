/**
 * This class extends the AdultBeverages class. It will describes a wine beverage
 *
 * @author Jason Martinez
 * @version 1.0
 * @since Still durring the great pandemic, Charlie Brown
 */

public class Wine extends AdultBeverages {
	
	private static final String UPDATE_FIELD = "Needs to be updated";
	private static final String[] wineColors = {"red", "white", "pink"};
	private enum NitrateLevel = { REGULAR, LOW, NONE, ERROR }

	private String color;
	private String region;
	private String characteristics;
	private short year;
	private NitrateLevel nitrateLevel;
	private boolean kosher;

	public Wine() {
		super();
		this.color = UPDATE_FIELD;
		this.region = UPDATE_FIELD;
		this.characteristics = UPDATE_FIELD;
		this.year = 0;
		this.nitrateLevel = NitrateLevel.ERROR;
		this.kosher = false;
	}

	public Wine(String name, double abv, String desc, String color, String region,
			String characteristics, short year, String nitrateLevel, boolean Kosher) {
		super(name, abv, desc);
		this.color = this.wineColors.contains(color) ? color : UPDATE_FIELD;
		this.region = region;
		this.characteristics = characteristics;
		this.year = year;
		this.nitrateLevel = getNitrateLeve(nitrateLevel);
		this.kosher = kosher;
	}

}
