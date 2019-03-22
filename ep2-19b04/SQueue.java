public class SQueue {
    private final DEQueue q = new DEQueue();


    public void add(String e) {
        q.addLast(e);
    }

    public String poll() {
        return q.pollFirst();
    }

    public String peek() {
        return q.peekFirst();
    }

    public int size() {
        return q.size();
    }
}
