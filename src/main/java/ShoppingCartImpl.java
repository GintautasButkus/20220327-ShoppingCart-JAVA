import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

public class ShoppingCartImpl implements ShoppingCart {

	private List<ShoppingItem> cart;

	@Override
	public void addShoppingItem(ShoppingItem ashoppingItem) {
		cart.add(ashoppingItem);
		this.cart = new ArrayList<ShoppingItem>();
	}

	@Override
	public double calculateTotalPrice() {
		return cart.stream().mapToDouble(c -> c.getPrice()).sum();
	}

	@Override
	public void clearShoppingCart() {
		cart.clear();
	}

	@Override
	public Collection<ShoppingItem> getShoppingCartItems() {
		return cart;
	}

	@Override
	public void removeShoppingItem(ShoppingItem shoppingItem) {
		cart.remove(cart.indexOf(shoppingItem));
	}
}
