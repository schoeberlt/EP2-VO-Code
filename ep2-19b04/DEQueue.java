public class DEQueue {
    private int mask = (1 << 3) - 1; // 7
    private String[] es = new String[mask + 1]; // size = 8
    private int head, tail; // = 0


    public void addFirst(String e) {
        es[head = (head - 1) & mask] = e; // 7, 6, 5...
        if (tail == head) { // tail = 0
            doubleCapacity();
        }
    }

    public String pollFirst() {
        String result = es[head];
        es[head] = null;
        if (tail != head) {
            head = (head + 1) & mask; // head ++
        }
        return result;
    }

    public String peekFirst() {
        return es[head];
    }

    public void addLast(String e) {
        es[tail] = e; // 0
        tail = (tail + 1) & mask; // tail++
        if (tail == head) {
            doubleCapacity();
        }
    }

    public String pollLast() {
        if (tail != head) {
            tail = (tail - 1) & mask;
        }
        String result = es[tail];
        es[tail] = null;
        return result;
    }

    public String peekLast() {
        return es[(tail - 1) & mask];
    }

    public int size() {
        return (tail - head) & mask;
    }

    private void doubleCapacity() {
        mask = (mask << 1) | 1;
        String[] newes = new String[mask + 1];
        int i = 0, j = 0;
        while (i < head) {
            newes[j++] = es[i++];
        }
        j = head += es.length;
        while (i < es.length) {
            newes[j++] = es[i++];
        }
        es = newes;
    }
}
