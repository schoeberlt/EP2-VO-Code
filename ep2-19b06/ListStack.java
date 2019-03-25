public class ListStack {
    private ListNode head;

    public void push(String v) {
        head = new ListNode(v, head);
    }

    public String pop() {
        if (head != null) {
            String result = head.value();
            head = head.next();
            return result;
        }
        return null;
    }

    public String peek() {
        return head == null ? null : head.value();
    }
}
