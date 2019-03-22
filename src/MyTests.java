public class MyTests {


    public static void main(String[] args) {
        DEQueue q = new DEQueue();

        q.addFirst("Hello");
        q.addFirst("Paul");
        System.out.println(q.peekFirst());
        //System.out.println(q.size());
        System.out.println(q.pollFirst());
        //System.out.println(q.peekFirst());
        //System.out.println(q.size());
        System.out.println(q.peekLast());
    }


}
