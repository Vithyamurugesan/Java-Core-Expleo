package inheritancepolymorpismabstractionlevel2;

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
public class MovableProblem {
	public static void main(String[]args) {
		
	}

}
