package abstraction;

abstract class Shapes{
	void draw() {    //Contrete method
		System.out.println("Drawing");
	}
	abstract void area();     //contract method 
	abstract void perimeter();  
}
class Rectangles extends Shapes{
	private int length,breadth;
	Rectangles(int length,int breadth) {  
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	void area() {
		System.out.println("Area of rectangle : "+(length*breadth));
	}
	@Override
	void perimeter() {
		System.out.println("Perimeter of rectangle : "+(2*(length+breadth)));
	}
}
class Square extends Shapes{
	private int side;
	Square(int side) {
		this.side=side;
	}
	@Override
	void area() {
		System.out.println("Area of Square : "+(side*side));
	}
	@Override
	void perimeter() {
		System.out.println("Perimeter of Square : "+(4*side));
	}
}

class Circles extends Shapes{
	private int radius;
	final static double PI=3.14;
	Circles(int radius) {
		this.radius=radius;
	}
	@Override
	void area() {
		System.out.println("Area of Circle : "+(PI*radius*radius));
	}
	@Override
	void perimeter() {
		System.out.println("Perimeter of circle : "+(2*PI*radius));
	}
}
public class Main {
	public static void main(String[]args) {
		Shapes s;
		s=new Rectangles(3, 5);
		s.area();
		s.perimeter();
		s=new Square(3);
		s.area();
		s.perimeter();
		s=new Circles(3);
		s.area();
		s.perimeter();	
	}
}
