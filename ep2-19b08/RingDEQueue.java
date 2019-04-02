public class RingDEQueue {
    private DLNode nil;

    public RingDEQueue() {
        nil = new DLNode(null);
    }

    public void addFirst(String v) {
        nil.add(v);
    }

    public void addLast(String v) {
        nil.setValue(v);
        nil = nil.add(null);
    }

    public String pollFirst() {
        return nil.next().remove().value();
    }

    public String pollLast() {
        return nil.previous().remove().value();
    }

    public String peekFirst() {
        return nil.next().value();
    }

    public String peekLast() {
        return nil.previous().value();
    }

    public boolean isEmpty() {
        return nil.next() == nil;
    }
}
