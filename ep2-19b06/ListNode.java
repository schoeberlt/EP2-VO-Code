public class ListNode {
    private String value;
    private ListNode next;

    public ListNode(String v, ListNode n) {
        value = v;
        next = n;
    }

    public String value() {
        return value;
    }

    public ListNode next() {
        return next;
    }

    public void setNext(ListNode n) {
        next = n;
    }

    public void setValue(String v) {
        value = v;
    }
}
