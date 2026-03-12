package abstraction;

abstract class Shape
{
	void draw()
	{
		System.out.println("Drawing!..");
	}
	
	abstract void area();
	abstract void perimeter();
}

class Rectangle extends Shape
{
	private int length,breadth;
	
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void area()
	{
		System.out.println("Area of Rectangle : "+(length*breadth));
	}
	
	void perimeter()
	{
		System.out.println("Perimeter of Rectangle : "+2*(length+breadth));
	}
}

class Square extends Shape
{
	private int side;
	
	Square(int side)
	{
		this.side=side;
	}
	
	void area()
	{
		System.out.println("Area of Square: "+(side*side));
	}
	
	void perimeter()
	{
		System.out.println("Perimeter of Square: "+(4*side));
	}
}

class Circle extends Shape
{
	private double radius;
	final double pi=3.14;
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	void area()
	{
		System.out.println("Area of Circle: "+(pi*radius*radius));
	}
	void perimeter()
	{
		System.out.println("Perimeter of Circle: "+(2*pi*radius));
	}
	
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s;
		
		s = new Rectangle(3,5);
		s.area();
		s.perimeter();
		System.out.println();
		s = new Square(5);
		s.area();
		s.perimeter();
		System.out.println();
		s = new Circle(4.5);
		s.area();
		s.perimeter();

	}

}
