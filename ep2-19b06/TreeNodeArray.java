public class TreeNodeArray {
    private String value;
    private TreeNodeArray[] children;

    public TreeNodeArray(String v, TreeNodeArray... ns /* wie TreeNodeArray[] ns, erlaubt beliebig viele TreeNodeArray-Argumente in Aufruf */) {
        value = v;
        children = ns;
    }

    public String value() {
        return value;
    }

    public void setValue(String v) {
        value = v;
    }

    public TreeNodeArray[] children() {
        return children;
    }

    public void setChildren(TreeNodeArray... ns) {
        children = ns;
    }
}
