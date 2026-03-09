package inheritancepolymorpismabstractionlevel2;

abstract class Figure {

    String figureName;

    Figure(String name) {
        figureName = name;
    }

    abstract double area();

    public String toString() {
        return figureName;
    }
}

class Ball extends Figure {

    double radius;

    Ball(double r) {
        super("Ball");
        radius = r;
    }

    double area() {
        return 4 * Math.PI * radius * radius;
    }

    public String toString() {
        return super.toString() + " with radius " + radius;
    }
}

class BoxShape extends Figure {

    double length;
    double width;

    BoxShape(double l, double w) {
        super("BoxShape");
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }

    public String toString() {
        return super.toString() + " with length " + length + " and width " + width;
    }
}

class Pipe extends Figure {

    double radius;
    double height;

    Pipe(double r, double h) {
        super("Pipe");
        radius = r;
        height = h;
    }

    double area() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}
public class ShapesTest {

    public static void main(String[] args) {

        Ball b = new Ball(5);
        BoxShape rect = new BoxShape(10, 4);
        Pipe cyl = new Pipe(3, 7);

        System.out.println(b);
        System.out.println("Area = " + b.area());

        System.out.println(rect);
        System.out.println("Area = " + rect.area());

        System.out.println(cyl);
        System.out.println("Area = " + cyl.area());
    }
}

