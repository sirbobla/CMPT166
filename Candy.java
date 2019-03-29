//adding a comment for fun
package DessertItem;
//derive candy class from dessert item
public class Candy extends DessertItem {
	//create variables needed for checkout
	private double weight;
	private int pricePerPound;
	private int cost;
	//create candy and define the private variables with constructors
	public Candy(String name, double weight, int pricePerPound) {
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	//calculates cost of candy
	public int getCost() {
		this.cost = (int)Math.round(this.weight * this.pricePerPound);
		return cost;
	}
	//returns the weight of the candy from private int
	public double getWeight() {
		return weight;
	}
	//returns the price per pound of the private int
	public int getPricePerPound() {
		return pricePerPound;
	}
	
}
