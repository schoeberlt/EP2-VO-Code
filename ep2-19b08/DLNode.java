public class DLNode {
    private String value;
    private DLNode prev, next;

    public DLNode(String v) {
        value = v;
        prev = next = this;
    }

    private DLNode(String v, DLNode p, DLNode n) {
        value = v;
        prev = p;
        next = n;
    }

    public String value() {
        return value;
    }

    public DLNode next() {
        return next;
    }

    public DLNode previous() {
        return prev;
    }

    public void setValue(String v) {
        value = v;
    }

    public DLNode add(String v) {
        return next = next.prev =
                new DLNode(v, this, next);
    }

    public DLNode remove() {
        next.prev = prev;
        prev.next = next;
        return this;
    }
}
