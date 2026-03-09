package inheritancepolymorpismabstractionlevel2;

class Paint {

    private double coverage;

    Paint(double c) {
        coverage = c;
    }

    double amount(ShapeName s1) {

        System.out.println("Computing amount for " + s1);

        double area = s1.area();
        double paintNeeded = area / coverage;

        return paintNeeded;
    }
}


public class PaintTest {

    public static void main(String[] args) {

        Paint paint = new Paint(250);

        ShapeName s1 = new SphereShape(5);
        ShapeName s2 = new RectangleShape(10,4);
        ShapeName s3 = new CylinderShape(3,7);

        System.out.println("Paint needed = " + paint.amount(s1));
        System.out.println("Paint needed = " + paint.amount(s2));
        System.out.println("Paint needed = " + paint.amount(s3));
    }
}



