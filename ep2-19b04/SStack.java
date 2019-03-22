public class SStack {
    private final DEQueue s = new DEQueue();


    public void push(String e) {
        s.addFirst(e);
    }

    public String pop() {
        return s.pollFirst();
    }

    public String peek() {
        return s.peekFirst();
    }
}
