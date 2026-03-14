package third_Question_Cart;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cart c = new Cart();
		
		c.addProduct();
		c.addProduct();
	
		
		
		c.calculateCartTotal();
		
		c.displayCart();
		c.removeProduct();

	}

}
