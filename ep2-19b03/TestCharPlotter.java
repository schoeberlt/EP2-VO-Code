public class TestCharPlotter {
    public static void main(String[] args) {
        CharPlotter p = new CharPlotter(80, 24);

        p.print();

        p.xMove(2);
        p.yMove(2);
        p.changeDraw('|');
        for (int i = 0; i < 19; i++) {
            p.penDown();
            p.yMove(20);
            p.penUp();
            p.yMove(-20);
            p.xMove(4);
        }

        p.print();

        p.xMove(-10000);
        p.yMove(-10000);

        p.xMove(2);
        p.yMove(2);
        p.changeDraw('-');
        for (int i = 0; i < 3; i++) {
            p.penDown();
            p.xMove(72);
            p.penUp();
            p.yMove(4);
            p.penDown();
            p.xMove(-72);
            p.penUp();
            p.yMove(4);
        }

        p.print();

    }
}
