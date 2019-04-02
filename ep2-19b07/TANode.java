public class TANode {
    private String key, value;
    private TANode left, right;

    public TANode(String k, String v) {
        key = k;
        value = v;
    }

    private int compare(String k) {
        if (k == null) {
            return key == null ? 0 : -1;
        }
        if (key == null) {
            return 1;
        }
        return k.compareTo(key);
    }

    public String put(String k, String v) {
        int cmp = compare(k);
        if (cmp < 0) {
            if (left != null) {
                return left.put(k, v);
            }
            left = new TANode(k, v);
        } else if (cmp > 0) {
            if (right != null) {
                return right.put(k, v);
            }
            right = new TANode(k, v);
        } else {
            String result = value;
            value = v;
            return result;
        }
        return null;
    }

    public TANode find(String k) {
        int cmp = compare(k);
        if (cmp == 0) {
            return this;
        }
        TANode node = cmp < 0 ? left : right;
        if (node == null) {
            return null;
        }
        return node.find(k);
    }

    public boolean hasValue(String v) {
        return (v == null ? value == v
                          : v.equals(value)) ||
                (left != null && left.hasValue(v)) ||
                (right != null && right.hasValue(v));
    }

    public String value() {
        return value;
    }
}
