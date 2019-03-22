public class TestPoint {
    public static void main(String[] args) {

        Point p = new Point();
        Point q = new Point();

        p.set(3, 4);
        q.set(5, 6);

        System.out.println("(" + p.getX() + "," + p.getY()+")");
        System.out.println("(" + q.getX() + "," + q.getY()+")");

        p.origin(q);

        System.out.println("(" + p.getX() + "," + p.getY()+")");
        System.out.println("(" + q.getX() + "," + q.getY()+")");

    }
}
