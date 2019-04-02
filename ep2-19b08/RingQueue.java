public class RingQueue {
    private ListNode nil;

    public RingQueue() {
        nil = new ListNode(null, null);
        nil.setNext(nil);
    }

    public void add(String v) {
        nil.setValue(v);
        nil.setNext(nil = new ListNode(null, nil.next()));
    }

    public String poll() {
        ListNode n = nil.next();
        nil.setNext(n.next());
        return n.value();
    }

    public String peek() {
        return nil.next().value();
    }

    public boolean element(String v) {
        ListNode n = nil.next();
        while (n != nil && !(v == null ? v == n.value() : v.equals(n.value()))) {
            n = n.next();
        }
        return n != nil;
    }

    public boolean isEmpty() {
        return nil.next() == nil;
    }
}
