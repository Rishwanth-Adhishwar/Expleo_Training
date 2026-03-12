package Interfaces;

interface Shape
{
	double DEFAULT_VALUE=1.0;
	
	double calculateArea();
	double calculatePerimeter();
	 default String getDescription()
	{
		return "A shape with unspecified Dimension";
	}
}

 class Circle implements Shape
{
	private double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	Circle()
	{
		this.radius=DEFAULT_VALUE;
	}
	
	public double calculateArea()
	{
		return 3.14*radius*radius;
	}
	
	public double calculatePerimeter()
	{
		return 2*3.14*radius;
	}
	
	public String getDescription()
	{
		return "Circle Radius is: "+radius;
	}
}

class Rectangle implements Shape
{
	private double length,breadth;
	
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	Rectangle()
	{
		this.length=DEFAULT_VALUE;
		this.breadth=DEFAULT_VALUE;
		
	}
	
	public double calculateArea()
	{
		return length*breadth;
	}
	
	public double calculatePerimeter()
	{
		return 2*(length+breadth);
	}
	public String getDescription()
	{
		return "Rectangle Length: "+length+" Rectangle Breadth: "+breadth;
	}
	
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c=new Circle(5); //error because Circle class is abstract if we remove it it will be solved
		System.out.println(c.calculateArea());
		System.out.println(c.calculatePerimeter());
		
		Rectangle r=new Rectangle(5,4);
		System.out.println(r.calculateArea());
		System.out.println(r.calculatePerimeter());
		

	}

}
