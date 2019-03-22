public class TestQueueAndStack {

    public static void main(String[] args) {
        testQueueAndStack();
    }

    private static void testQueueAndStack() {
        final SQueue q = new SQueue();
        final SStack s = new SStack();
        for (char c = 'A'; c <= 'Z'; c++) {
            q.add("" + c);
            s.push("" + c);
        }
        for (int i = 0; i < 27; i++) {
            System.out.print(q.peek() + s.peek());
            System.out.println(q.poll() + s.pop());
        }
    }

}
