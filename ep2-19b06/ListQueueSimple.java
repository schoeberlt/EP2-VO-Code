public class ListQueueSimple {
    private ListNode head;

    public void add(String v) {
        if (head == null) {
            head = new ListNode(v, null);
        } else {
            ListNode last = head;
            while (last.next() != null) {
                last = last.next();
            }
            last.setNext(new ListNode(v, null));
        }
    }

    public String poll() {
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
