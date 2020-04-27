
public class CardClass {
	
	public CardClass() 
	{
			value = "";
			family = "";
	}
	public String GetDescription ( String descript) {
		value = descript.substring(0,1);
		family = descript.substring(1);
		
		if (value.equalsIgnoreCase("2")) value = "Two";
		else if (value.equalsIgnoreCase("3")) value = "three of";
		else if (value.equalsIgnoreCase("4")) value = "Four of";
		else if (value.equalsIgnoreCase("5")) value = "Five of";
		else if (value.equalsIgnoreCase("6")) value = "Six of";
		else if (value.equalsIgnoreCase("7")) value = "Seven of";
		else if (value.equalsIgnoreCase("8")) value = "Eight of";
		else if (value.equalsIgnoreCase("9")) value = "Nine of";
		else if (value.equalsIgnoreCase("10")) value = "Ten of";
		else if (value.equalsIgnoreCase("A")) value = "Ace";
		else if (value.equalsIgnoreCase("Q")) value = "Queen of";
		else if (value.equalsIgnoreCase("J")) value = "Jack of";
		else if (value.equalsIgnoreCase("K")) value = "King of";
		else value = "invalid value";

		if (family.equalsIgnoreCase("D")) family = "diamods";
		else if (family.equalsIgnoreCase("H")) family = "hearts";
		else if (family.equalsIgnoreCase("S")) family = "Spades";
		else if (family.equalsIgnoreCase("C")) family = "Clubs";
		else if (family.equalsIgnoreCase("K")) family = "Kings";
		else if (family.equalsIgnoreCase("A")) family = "Ace";
		else family = "invalid value";
		
		if(value != "invalid value" && family != "invalid value") return value + " of " + family;
		else if (value == "Ace ") return "Ace";
		// How would I get the Ace to work?
		else return "invalid value";
	}
			String value;
			String family;
			String numbers;
}

