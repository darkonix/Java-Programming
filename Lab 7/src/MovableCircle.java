package Tkachenko.Lab7;

public class MovableCircle extends MovablePoint implements Movable {
    int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public Object clone() {
        return new MovableCircle(x, y, xSpeed, ySpeed, radius);
    }

    @Override
    public String toString() {
        return "MovableCircle {" +
                "radius = " + radius + ", " +
                super.toString() + '}';
    }
}
