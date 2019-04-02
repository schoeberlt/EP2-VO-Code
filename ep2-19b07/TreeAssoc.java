public class TreeAssoc {
    private TANode root;

    public String put(String k, String v) {
        if (root != null) {
            return root.put(k, v);
        }
        root = new TANode(k, v);
        return null;
    }

    public String get(String k) {
        if (root == null) {
            return null;
        }
        TANode node = root.find(k);
        return node == null ? null : node.value();
    }

    public boolean containsKey(String k) {
        return root != null && root.find(k) != null;
    }

    public boolean containsValue(String v) {
        return root != null && root.hasValue(v);
    }
}
