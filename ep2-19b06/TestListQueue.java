public class TestListQueue {
    public static void main(String[] args) {
        testAddPerformanceSimple();
        testAddPerformance();
        // ListQueue queue = create();
        // manipulate(queue);
    }

    private static void testAddPerformanceSimple() {
        System.out.println("START ListQueueSimple");
        ListQueueSimple queue = new ListQueueSimple();
        for (int i = 0; i < 50000; i++) {
            queue.add("" + (char)i);
        }
        System.out.println("STOP ListQueueSimple");
    }

    private static void testAddPerformance() {
        System.out.println("START ListQueue");
        ListQueue queue = new ListQueue();
        for (int i = 0; i < 50000; i++) {
            queue.add("" + (char)i);
        }
        System.out.println("STOP ListQueue");
    }



    private static ListQueue create() {
        ListQueue queue = new ListQueue();
        for (char c = 'a'; c <= 'z'; c++) {
            queue.add("" + c);
        }
        return queue;
    }

    private static void show(ListQueue queue) {
        String s;
        for (int i = 0; (s = queue.valueAt(i)) != null; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    private static void manipulate(ListQueue queue) {
        show(queue);
        for (char c = 'a'; c <= 'z'; c += 5) {
            System.out.print(queue.indexOf(c + "") + " ");
            queue.insertAt(queue.indexOf(c + ""), (char)(c + ('A' - 'a')) + "");
        }
        System.out.println();
        show(queue);
        queue.add(queue.peek());
        queue.add(queue.poll());
        show(queue);
        for (int i = 0; i <= 30; i += 5) {
            System.out.print(queue.removeAt(i) + " ");
        }
        System.out.println();
        show(queue);
        System.out.println(queue.removeAt(26));
        queue.insertAt(26, "X");
        queue.insertAt(27, "Y");
        queue.add("Z");
        show(queue);
    }
}
