package DessertItem;
public class Checkout {
	//private objects for use with checkout
	private DessertItem[] myDessertItems;
	private int numberOfItems;
	private final int RECEIPT_WIDTH = 30;
	//make public versions of the private objects
	public Checkout() {
		myDessertItems = new DessertItem[100];
		numberOfItems = 0;
	}
	//make the private int return for public int
	public int numberOfItems() {
		return numberOfItems;
	}
	//make private int increase with constructor
	public void enterItem(DessertItem item) {
		this.myDessertItems[numberOfItems] = item;
		numberOfItems++;
	}
	//create clear to empty number of items
	public void clear() {
		for(int i = 0; i < numberOfItems; i++)
			this.myDessertItems[i] = null;
		numberOfItems = 0;
	}
	//create cost int to contain sum of items
	public int totalCost() {
		int sum = 0;
		for(int i = 0; i < numberOfItems; i++) 
			sum += myDessertItems[i].getCost(); 
		return sum;
	}
	//create int to calculate the tax
	public int totalTax() {
		return (int)Math.round(this.totalCost() * DessertShoppe.TAX_RATE / 100.00);
	}
	//create string
	public String toString() {
		String s = "";		// receipt
		
		
		s += "    " + DessertShoppe.STORE_NAME + "\n";
		s += "    " + "--------------------" + "\n";
		
		for(int j = 0; j < numberOfItems; j++){
		
			String l = myDessertItems[j].getName();	
			//price of all the items
			String p = DessertShoppe.cents2dollarsAndCents(myDessertItems[j].getCost());
			//verify price is in length
			if (p.length() > DessertShoppe.COST_WIDTH)		
				p = p.substring(0, DessertShoppe.COST_WIDTH);
			//print if ice cream is in length
			if (myDessertItems[j] instanceof IceCream) {		
				while(l.length() < RECEIPT_WIDTH - p.length()){
					l += " ";
				}
				s += l + p + "\n";
			}
			//print if sundae is in length
			else if (myDessertItems[j] instanceof Sundae) {		
				
				s += ((Sundae)myDessertItems[j]).getTopping() + " Sundae with\n";
				
				while(l.length() < RECEIPT_WIDTH - p.length()){
					l += " ";
				}
				s += l + p + "\n";
			}
			//print if candt is within length
			else if (myDessertItems[j] instanceof Candy){
				s += ((Candy) myDessertItems[j]).getWeight() + " lbs @ " + 
						DessertShoppe.cents2dollarsAndCents(((Candy) myDessertItems[j]).getPricePerPound()) + " /lb.\n";
				
				while(l.length() < RECEIPT_WIDTH - p.length()){
					l += " ";
				}
				s += l + p + "\n";	
			}
			//print if cookie is within length
			else {
				s += ((Cookie)myDessertItems[j]).getNumber() + " @ " + 
						DessertShoppe.cents2dollarsAndCents(((Cookie)myDessertItems[j]).getPricePerDozen()) + " /dz\n";
				
				while(l.length() < RECEIPT_WIDTH - p.length()){
					l += " ";
				}
				s += l + p + "\n";			
			}	
		}
		//print out the tax
		String line = "\nTax";		
		String tax = DessertShoppe.cents2dollarsAndCents(this.totalTax());
		while(line.length() <= RECEIPT_WIDTH - tax.length())
			line += " ";
		s += line + tax;
		//print the total cost
		String totalCost = DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax());	
		line = "\nTotal Cost";
		while(line.length() <= RECEIPT_WIDTH - totalCost.length())
			line += " ";
		s += line + totalCost;
	
		return s;
	}
}
