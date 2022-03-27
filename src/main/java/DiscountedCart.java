import java.util.Collection;

import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

public class DiscountedCart implements ShoppingCart {
	private ShoppingCart shoppingCart;
	private double discountRate;

	public DiscountedCart(ShoppingCart shoppingCart, double discountRate) {
		this.shoppingCart = shoppingCart;
		this.discountRate = discountRate;
	}

	@Override
	public void addShoppingItem(ShoppingItem shoppingCart) {
		this.shoppingCart.addShoppingItem(shoppingCart);

	}

	@Override
	public double calculateTotalPrice() {
		return this.shoppingCart.calculateTotalPrice() * (1 - this.discountRate);
	}

	@Override
	public void clearShoppingCart() {
		this.shoppingCart.clearShoppingCart();

	}

	@Override
	public Collection<ShoppingItem> getShoppingCartItems() {
		return this.shoppingCart.getShoppingCartItems();
	}

	@Override
	public void removeShoppingItem(ShoppingItem shoppingItem) {
		this.shoppingCart.removeShoppingItem(shoppingItem);
	}

}
