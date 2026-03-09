package inheritancepolymorpismabstractionlevel2;

import java.util.Scanner;

interface Movable{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();	
}
class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() {
        y += ySpeed;
    }
    public void moveDown() {
        y -= ySpeed;
    }
    public void moveLeft() {
        x -= xSpeed;
    }
    public void moveRight() {
        x += xSpeed;
    }
    public String toString() {
        return "(" + x + "," + y + ") speed=(" + xSpeed + "," + ySpeed + ")";
    }
}

class MovableCircle implements Movable {

    int radius;
    MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {

        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return center.toString() + " radius=" + radius;
    }
}

public class MovableProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x coordinate:");
        int x = sc.nextInt();

        System.out.println("Enter y coordinate:");
        int y = sc.nextInt();

        System.out.println("Enter x speed:");
        int xs = sc.nextInt();

        System.out.println("Enter y speed:");
        int ys = sc.nextInt();

        System.out.println("Enter radius:");
        int r = sc.nextInt();

        MovableCircle c = new MovableCircle(x, y, xs, ys, r);

        System.out.println("Original Position: " + c);

        c.moveUp();
        System.out.println("After Move Up: " + c);

        c.moveRight();
        System.out.println("After Move Right: " + c);

    }
}
