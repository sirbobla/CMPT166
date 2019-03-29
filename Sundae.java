package DessertItem;
//make sundae derive from ice cream
public class Sundae extends IceCream {
	//create private objects
	private String toppingName;
	private int toppingPrice;
	private int cost;
	//create constructor for the toppings
	public Sundae(String iceCreamName, int iceCreamCost, String toppingName, int toppingPrice) {
		super(iceCreamName, iceCreamCost);
		this.toppingName = toppingName;
		this.toppingPrice = toppingPrice;
	}
	//return private int and create the cost for this int
	public int getCost() {
		cost = this.toppingPrice + super.getCost();
		return cost;
	}
	//return private string for this public string
	public String getTopping() {
		return toppingName;
	}
	//Class for adding toppings to the sundae
	public static void main(String[] args) {
		DessertItem d = new Sundae("Vanilla Ice Cream", 105, "Caramel", 50);
		
		System.out.println(d.getClass().toString().substring(6));
		
		System.out.println(((Sundae)d).getTopping());
	}
}

