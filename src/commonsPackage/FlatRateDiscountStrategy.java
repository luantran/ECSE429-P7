package commonsPackage;

public class FlatRateDiscountStrategy implements DiscountStrategy {

	private float amount;

	public FlatRateDiscountStrategy(float amount) {
		if (amount < 0) {
			amount = 0;
		}
		this.amount = amount;
	}

	public float applyDiscount(float price) {
		if (price - this.amount < 0)
			return 0;
		return price - this.amount;
	}
}
