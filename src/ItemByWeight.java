import java.util.Objects;

/** ItemByWeight.java
*
* Subclass of Item, where price is specified by unit weight
*
*/

public class ItemByWeight extends Item {
	public ItemByWeight(String n, double p, double w) {
		super(n, p);
		weight = w;
		}
		
	public double getPrice() {
		return weight*super.getPrice();
	}

	public double getWeight() {
		return this.weight;
	}

	public String toString() {
		return (getName() + " (" + weight + "kg @ "
		+ super.getPrice() + "ukp/kg) = ukp"
		+ getPrice());
	}
	public boolean equals(Object otherObject){
		if(super.equals(otherObject)){
			if (this.getWeight() == ((ItemByWeight)otherObject).getWeight()){
				return true;
			}
			else return false;
		}
		else return false;
	}

	// instance field
	private double weight;
}

