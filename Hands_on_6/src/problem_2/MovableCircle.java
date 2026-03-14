package problem_2;

class MovableCircle implements Movable {

    int radius;
    MovablePoint centre;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.centre = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        centre.moveUp();
    }

    public void moveDown() {
        centre.moveDown();
    }

    public void moveLeft() {
        centre.moveLeft();
    }

    public void moveRight() {
        centre.moveRight();
    }

    public String toString() {
        return "Radius=" + radius + ", Centre=" + centre;
    }
}

