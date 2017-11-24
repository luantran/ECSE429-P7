package commonsPackage;

public class PercentDiscountStrategy implements DiscountStrategy {

	private float pct;

	public PercentDiscountStrategy(float pct) {
		if (pct < 0) {
			pct = 0;
		} else if (pct > 100) {
			pct = 100;
		}
		this.pct = pct;
	}

	public float applyDiscount(float price) {
		return price * (1 - this.pct/100);
	}
} 
