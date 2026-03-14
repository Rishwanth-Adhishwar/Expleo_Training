package third_Question_Cart;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	Product(int productId,String productName,double price)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	
	public void getProductDetails()
	{
		System.out.println("Product ID: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+price);
		System.out.println("Product Quantity: "+quantity);
	}
	
	public int getProductId()
	{
		return productId;
	}
	public void setProductId(int productId)
	{
		this.productId=productId;
	}
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public double calculateTotal()
	{
		return price*quantity;
	}
	
	

}
