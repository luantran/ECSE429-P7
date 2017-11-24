package commonsPackage;

public class Order {

	private String name;
	private float price;
	private DiscountStrategy strategy;

	public Order(String name, float price) {
		this.name = name;
		this.price = price;
		this.strategy = null;
	}

	public String getName() {
		return this.name;
	}

	public float getPrice() {
		return this.price;
	}
	
	public float getDiscountedPrice() {
		if (strategy == null) {
			return price;
		}
		return Math.round((strategy.applyDiscount(price)*100))/100f;
	}
	
	public void setStrategy(DiscountStrategy strategy) {
		this.strategy = strategy;
	}
}
