package third_Question_Cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
	
	private List<Product> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void addProduct()
	{
		System.out.print("Enter the Product Id: ");
		int id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter the Product Name: ");
		String name=sc.next();
		
		System.out.print("Enter the Product price: ");
		double price=sc.nextInt();
		
		System.out.print("Enter the Product Quantity: ");
		int quantity=sc.nextInt();
		
		Product pd = new Product(id,name,price);
		pd.setQuantity(quantity);
		
		list.add(pd);
		
	}
	
	public void removeProduct()
	{
		System.out.print("Enter the Product Id to Remove: ");
		int removeId=sc.nextInt();
		
		for(Product obj : list)
		{
			if(obj.getProductId()==removeId)
			{
				list.remove(obj);
			}
		}
		displayCart();
	}
	
	public void calculateCartTotal()
	{
		double cal=0;
		
		for(Product obj:list)
		{
			cal+=obj.calculateTotal();
		}
		
		System.out.println("Cart Total Price: "+cal);
	}
	
	public void displayCart()
	{
		for(Product obj:list)
		{
			obj.getProductDetails();
		}
	}

}
