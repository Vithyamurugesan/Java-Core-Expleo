package abstraction;
interface Shape{
	double DEFAULT_VALUE=1.0;//Public static final constant 
	double calculateArea();
	double calculatePerimeter();
	default String getDescription() {//Default method
		return "A shape with unspecified dimansions";	
	}
}
abstract class Circle implements Shape{//Implement the shape interface in the circle class
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle() {//Constructor that uses the Default_value
		this.radius=DEFAULT_VALUE;	
	}
	
	
	//We are not writing the override method for area while we using the abstract class 
	//when use normal class we have to define the methods that is in the interface 
	
	
	
	//calculatPerimeter method is implemented
	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	//getDescription method is implemented 
	@Override
	public String getDescription() {
		return "A circle with radius"+radius;
	}
}
//Implement the shape interface in the rectangle class
class Rectangle implements Shape{
	private double length;
	private double width;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;	
	}
	public Rectangle() {
		this.length=DEFAULT_VALUE;
		this.width=DEFAULT_VALUE;
		
	}
	@Override
	public double calculateArea() {
		return length*width;
	}
	@Override
	public double calculatePerimeter() {
		return 2*(length*width);
	}
	@Override
	public String getDescription() {
		return "A rectangle with length " +length+ " and width "+width;
	}
}
public class Interface {
	public static void main(String[]args) {
		//Creating an instance of circle will result in compilation error 
		//Circle circle=new Circle(5);
		
		
	}
}