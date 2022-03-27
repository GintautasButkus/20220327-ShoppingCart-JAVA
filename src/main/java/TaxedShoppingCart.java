import java.util.Collection;

import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

public class TaxedShoppingCart implements ShoppingCart {

	private ShoppingCart shoppingCart;
	private double taxRate;

	public TaxedShoppingCart(ShoppingCart shoppingCart, double taxRate) {
		this.shoppingCart = shoppingCart;
		this.taxRate = taxRate;
	}

	@Override
	public void addShoppingItem(ShoppingItem shoppingItem) {
		this.shoppingCart.addShoppingItem(shoppingItem);
	}

	@Override
	public double calculateTotalPrice() {
		return this.shoppingCart.calculateTotalPrice() * (1 + this.taxRate);
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
