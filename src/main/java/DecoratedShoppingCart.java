import java.util.Collection;

import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

public class DecoratedShoppingCart implements ShoppingCart {

	private ShoppingCart shoppingCart;
	private double discountRate;
	private double taxRate;

	public DecoratedShoppingCart(ShoppingCart shoppingCart, double discountRate, double taxRate) {
		this.shoppingCart = shoppingCart;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
	}

	@Override
	public void addShoppingItem(ShoppingItem shoppingCart) {
		this.shoppingCart.addShoppingItem(shoppingCart);

	}

	@Override
	public double calculateTotalPrice() {
		double priceWithDiscount = this.shoppingCart.calculateTotalPrice() * (1 - this.discountRate);

		return priceWithDiscount * (1 + this.taxRate);
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
