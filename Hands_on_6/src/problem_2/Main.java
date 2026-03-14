package problem_2;

public class Main {

    public static void main(String[] args) {

        MovableCircle c = new MovableCircle(10, 20, 5, 3, 15);

        System.out.println("Before Move:");
        System.out.println(c.toString());

        c.moveUp();
        c.moveRight();

        System.out.println("\nAfter Move:");
        System.out.println(c.toString());
    }
}