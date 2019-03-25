public class TestListNode {
    public static void main(String[] args) {
        useListNode();
    }

    private static void useListNode() {
        ListNode list = null;

        for (char c = 'a'; c <= 'z'; c++) {
            list = new ListNode("" + c, list);
        }

        for (ListNode n = list; n != null; n = n.next()) {
            System.out.print(n.value());
        }
    }
}
