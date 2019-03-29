package DessertItem;
//Derive cookie class from dessert item
public class Cookie extends DessertItem {
	//Create int for number
	private int number;
	//Create int for price variable
	private int pricePerDozen;
	//Create int for price
	private int cost;
	//private ints are expanded and given value
	public Cookie(String name, int number, int pricePerDozen) {
		super(name);
		//create constructors
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	//int for cost is established to return private int cost
	public int getCost() {
		//
		cost = (int)Math.round(number / 12.0 * pricePerDozen);
		return cost;
	}
	//public int getNumber returns private int number
	public int getNumber() {
		return number;
	}
	//public int getPricePerDozen returns private int pricePerDozen
	public int getPricePerDozen() {
		return pricePerDozen;
	}

}
