package inheritancepolymorpismabstractionlevel2;
abstract class ShapeName{

    // Instance variable
    String shapeName;

    // Constructor
    ShapeName(String name) {
        shapeName = name;
    }

    // Abstract method
    abstract double area();

    // toString method
    public String toString() {
        return shapeName;
    }

	

	
}
class RectangleShape extends ShapeName {

    double length;
    double width;

    RectangleShape(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}
class SphereShape extends ShapeName {

    double radius;

    SphereShape(double r) {
        super("Sphere");
        radius = r;
    }

    double area() {
        return 4 * Math.PI * radius * radius;
    }

    public String toString() {
        return super.toString() + " [radius=" + radius + "]";
    }
}
class CylinderShape extends ShapeName {

    double radius;
    double height;

    CylinderShape(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public String toString() {
        return super.toString() + " [radius=" + radius + ", height=" + height + "]";
    }
}
public class PaintShapes {

    public static void main(String[] args) {

        ShapeName s1 = new RectangleShape(10, 5);
        ShapeName s2 = new SphereShape(7);
        ShapeName s3 = new CylinderShape(3, 8);

        System.out.println(s1 + " Area = " + s1.area());
        System.out.println(s2 + " Area = " + s2.area());
        System.out.println(s3 + " Area = " + s3.area());
    }
}