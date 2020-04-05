/**
 * Driver class that lets the user select a drink from a drink list
 *
 * @author Jason Martinez
 * @version 1.0
 * @since I became nocturnal due to the plauge
 */

public class BarMenu {

	public static void main(String ... args) {
		
		// create an Array of type AdultBeverages
		AdultBeverages[] abList = new AdultBeverages[20];
		
		// create a Wine object of type Wine
		Wine wine1 = new Wine("B.V. Coastal", 13.9, "Really good red wine", "Cabernet", "Red", "Napa", "Fruit forward with a lot of body and a subtle nose",  2017, "Regular", false);

		// create a Wine object of type AdultBeverages
		AdultBeverages ab1 = new Wine("Napa Ridge Reserve", 14.3, "Really really good red wine", "Cabernet", "Red", "Napa", "Bold red with hints of cherry and butt", 2017, "Regular", false);

		// try to create an AdultBeverages object of type AdultBeverages
		// AdultBeverages ab1 = new AdultBeverages();
		
		// more wines to add to the array
		Wine wine2 = new Wine("Kendall Jackson", 13.2, "Good for a white wine", "Chardonnay", "White", "Sonoma County", "Oaky with traces of grapefruit and pair",  2018, "Regular", false);
		AdultBeverages ab2 = new Wine("Barefoot Cellars", 13.4, "Consistently good white wine", "Sauvigon Blanc", "White", "The River Junction", "Pairs great with fish", 2018, "Regular", true);
		AdultBeverages wine3 = new Wine("Red Truck", 14.1, "Kosher and Nitrate free", "Cabernet & Merlot", "Blend", "Paso Robles", "It's like malto-meal, it's good for ya!", 2018, "None", true);

		abList[0] = wine1;
		abList[1] = ab2;
		abList[2] = wine2;
		abList[3] = ab2;
		abList[4] = wine3;

		for (AdultBeverages ab : abList) {
			if (ab == null) return;
			System.out.println(ab.toString());
		}
	}
}
