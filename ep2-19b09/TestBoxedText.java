public class TestBoxedText {

    public static void main(String[] args) {
        // testAbstrBoxed();
        // testSetBoxed();
        // testSetPrintBoxed();
        testBoxedTextReset();
        // testBoxedText();
        // testBoxedText2();
    }


    private static void testAbstrBoxed() {
        AbstrBoxed ab = new BoxedText();
        BoxedText bt = new BoxedText();

        ab.newDimensions(10, 3);
        bt.newDimensions(20, 1);
        ab.setLine(1, "Das ist ein Text");
        bt.setLine(0, "Anderer Text");
        ab.print();
        bt.print();
        System.out.println("======================");
        // bt = ab; ERROR
        ab = bt;
        ab.print();
        bt.print();
    }


    /*
    private static void testSetBoxed() {
        SetBoxed sb = new BoxedText();
        BoxedText bt = new BoxedText();

        sb.newDimensions(10, 3);
        bt.newDimensions(20, 1);
        sb.setLine(1, "Das ist ein Text");
        bt.setLine(0, "Anderer Text");
        // sb.print(); ERROR
        bt.print();
        System.out.println("======================");
        // bt = ab; ERROR
        sb = bt;
        // sb.print(); ERROR
        bt.print();
    }
    */

    /*
    private static void testSetPrintBoxed() {
        BoxedText bt = new BoxedText();
        set(bt);
        print(bt);
    }

    private static void set(SetBoxed sb) {
        sb.newDimensions(10, 3);
        sb.setLine(1, "Das ist ein Text");
        // sb.print(); ERROR
    }

    private static void print(Print p) {
        p.print();
        // p.setLine(2, "neuer Text");
    }
    */

    private static void testBoxedTextReset() {
        BoxedTextReset btr = new BoxedTextReset();

        btr.newDimensions(10, 3);
        btr.setLine(1, "Das ist ein Text");
        btr.print();
        btr.reset();
        btr.print();
        BoxedText bt = btr;
        bt.newDimensions(10, 1);
        bt.setLine(0, "Neuer Text");
        bt.print();

    }




    private static void testBoxedText() {
        BoxedText t = new BoxedText();

        t.newDimensions(10, 3);
        t.setLine(1, "Das ist ein Text");
        t.print();
    }

    private static void testBoxedText2() {
        BoxedText x = new BoxedText();
        BoxedText y = new BoxedText();

        x.newDimensions(10, 3);
        y.newDimensions(20, 1);
        x.setLine(1, "Das ist ein Text");
        y.setLine(0, "Anderer Text");
        x.print();
        y.print();
    }
}
