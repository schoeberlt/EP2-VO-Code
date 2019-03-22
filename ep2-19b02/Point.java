public class Point {
        private int x = 0, y = 0;  // coordinates of point

    public void set(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // let p be the new origin of this point
    public void origin(Point p) {
        x -= p.x;
        y -= p.y;
    }





/*
    public Point(int initX, int initY) {
        x = initX;
        y = initY;
    }
*/



/*
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this(1, 1);
    }
    public Point(Point p) {
        this(p.x, p.y);
    }

    public Point copy() {
        return new Point(this);
    }
*/

}
