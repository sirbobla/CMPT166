package DessertItem;
//make icecream a derived class of dessert item
public class IceCream extends DessertItem {
	//create private cost int for checkout
	private int cost;
	//constructor for ice cream
	public IceCream( ) {
		this("", 0);
	}
	//create constructor for ice cream
	public IceCream(String name, int cost) {
		super(name);
		this.cost = cost;
	}
	//return private cost for getcost
	public int getCost() {
		return cost;
	}
	
}
