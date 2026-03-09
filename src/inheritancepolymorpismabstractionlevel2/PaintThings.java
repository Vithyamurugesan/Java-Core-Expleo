package inheritancepolymorpismabstractionlevel2;



public class PaintThings {

    public static void main(String[] args) {

        Paint paint = new Paint(250);   // 1 liter covers 250 sq ft

        ShapeName deck, bigBall, tank;

        double deckAmt, ballAmt, tankAmt;

        // Instantiate objects
        deck = new RectangleShape(20, 35);
        bigBall = new SphereShape(15);
        tank = new CylinderShape(10, 30);

        // Calculate paint required
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        // Print results
        System.out.println("\nPaint needed for deck = " + deckAmt);
        System.out.println("Paint needed for bigBall = " + ballAmt);
        System.out.println("Paint needed for tank = " + tankAmt);
    }
}