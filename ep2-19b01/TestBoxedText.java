public class TestBoxedText {

    public static void main(String[] args) {
        testBoxedText();
        // testBoxedText2();
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
