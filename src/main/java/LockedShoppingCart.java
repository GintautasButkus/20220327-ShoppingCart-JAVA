import java.util.Collection;

import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCartModificationException;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

public class LockedShoppingCart implements ShoppingCart {

	private ShoppingCart shoppingCart;

	public LockedShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public void addShoppingItem(ShoppingItem shoppingItem) {
		throw new ShoppingCartModificationException();

	}

	@Override
	public double calculateTotalPrice() {
		return this.shoppingCart.calculateTotalPrice();
	}

	@Override
	public void clearShoppingCart() {
		throw new ShoppingCartModificationException();

	}

	@Override
	public Collection<ShoppingItem> getShoppingCartItems() {
		return this.shoppingCart.getShoppingCartItems();
	}

	@Override
	public void removeShoppingItem(ShoppingItem shoppingItem) {
		throw new ShoppingCartModificationException();

	}

}
