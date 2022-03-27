import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shoppingcart.BaseShoppingCartDecoratorTest;

public class ShoppingCartTestImpl extends BaseShoppingCartDecoratorTest {

	@Override
	protected ShoppingCart getDecoratedShoppingCart(ShoppingCart shoppingCart, double discountRate, double taxRate) {
		return new DecoratedShoppingCart(shoppingCart, discountRate, taxRate);
	}

	@Override
	protected ShoppingCart getDiscountAppliedShoppingCart(ShoppingCart shoppingCart, double discountRate) {
		return new DiscountedCart(shoppingCart, discountRate);
	}

	@Override
	protected ShoppingCart getLockedFromModificationShoppingCart(ShoppingCart shoppingCart) {
		return new LockedShoppingCart(shoppingCart);
	}

	@Override
	protected ShoppingCart getTaxAppliedShoppingCart(ShoppingCart shoppingCart, double taxRate) {
		return new TaxedShoppingCart(shoppingCart, taxRate);
	}

}
