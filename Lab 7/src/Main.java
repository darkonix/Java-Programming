package Tkachenko.Lab7;

public class Main {
    public static void main(String[] args)
    {
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 2);

        circle.moveDown();
        circle.moveLeft();
        circle.moveRight();
        circle.moveUp();

        MovableCircle circle1 = (MovableCircle) circle.clone();
        circle1.moveDown();
        circle1.moveLeft();
        circle1.moveRight();
        circle1.moveUp();

        System.out.println(circle.toString());
        System.out.println(circle1.toString());
    }
}
