package commonsPackage;

import java.util.Random;

public class RandomDiscountStrategy implements DiscountStrategy {

	private Random rng;

	public RandomDiscountStrategy() {
		this.rng = new Random();
	}

	public float applyDiscount(float price) {
		return price * (rng.nextFloat() + 1);
	}
}
