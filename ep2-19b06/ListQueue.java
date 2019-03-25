public class ListQueue {
    private ListNode head, last;

    public void add(String v) {
        if (head == null) {
            head = last = new ListNode(v, null);
        } else {
            last.setNext(last = new ListNode(v, null));
        }
    }

    public String poll() {
        if (head != null) {
            String result = head.value();
            head = head.next();
            if (head == null) {
                last = null;
            }
            return result;
        }
        return null;
    }

    public String peek() {
        return head == null ? null : head.value();
    }





    public int indexOf(String v) {
        int i = 0;
        ListNode n = head;
        while (n != null && !(v == null ? v == n.value() : v.equals(n.value()))) {
            i++;
            n = n.next();
        }
        return n == null ? -1 : i;
    }

    public String valueAt(int i) {
        for (ListNode n = head; n != null; n = n.next()) {
            if (i-- == 0) {
                return n.value();
            }
        }
        return null;
    }

    public boolean insertAt(int i, String v) {
        if (i > 0) {
            for (ListNode n = head; n != null; n = n.next()) {
                if (--i == 0) {
                    n.setNext(new ListNode(v, n.next()));
                    if (last == n) {
                        last = n.next();
                    }
                    return true;
                }
            }
        } else if (i == 0) {
            head = new ListNode(v, head);
            if (last == null) {
                last = head;
            }
            return true;
        }
        return false;
    }

    public String removeAt(int i) {
        if (i > 0) {
            for (ListNode n = head; n != null; n = n.next()) {
                if (--i == 0) {
                    ListNode removed = n.next();
                    if (removed != null) {
                        n.setNext(removed.next());
                        if (last == removed) {
                            last = n;
                        }
                        return removed.value();
                    }
                }
            }
        } else if (i == 0) {
            return poll();
        }
        return null;
    }

}
