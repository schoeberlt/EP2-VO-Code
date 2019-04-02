public class NavigatableTree {
    private TreeNodeWithList tree = new TreeNodeWithList();

    public String currentValue() {
        return tree.value();
    }

    public String currentChildsLabel() {
        return tree.currentChild().label();
    }

    public boolean upToParent() {
        return tree != (tree = tree.parent());
    }

    public boolean downToCurrentChild() {
        return tree != (tree = tree.currentChild().child());
    }

    public boolean nextChild() {
        return tree.nextChild();
    }

    public boolean previousChild() {
        return tree.previousChild();
    }

    public void addChild(String label, String value) {
        tree.addChild(label, value);
    }

    public void addParent(String label, String value) {
        if (upToParent()) {
            addChild(label, value);
            downToCurrentChild();
        } else {
            tree.newRoot(label, value);
        }
    }

    public boolean removeSubtree() {
        return tree.remove();
    }
}

class TreeNodeWithList {
    private String value;
    private TreeNodeWithList parent;
    private LNode children = new LNode(this);

    public TreeNodeWithList() {
        parent = this;
    }

    public TreeNodeWithList(String value, TreeNodeWithList parent) {
        this.value = value;
        this.parent = parent;
    }

    public TreeNodeWithList parent() {
        return parent;
    }

    public LNode currentChild() {
        return children;
    }

    public String value() {
        return value;
    }

    public boolean nextChild() {
        children = children.next();
        return children.child() != this;
    }

    public boolean previousChild() {
        children = children.previous();
        return children.child() != this;
    }

    public void addChild(String label, String value) {
        children = new LNode(label, new TreeNodeWithList(value, this), children);
    }

    public boolean remove() {
        if (children.child() != this) {
            children = children.remove();
            return true;
        }
        return false;
    }

    public void newRoot(String label, String value) {
        this.value = value;
        parent = new TreeNodeWithList();
        parent.children = new LNode(label, this, parent.children);
    }
}


class LNode {
    private String label;
    private TreeNodeWithList child;
    private LNode previous, next;

    public LNode(TreeNodeWithList child) {
        this.child = child;
        previous = next = this;
    }

    public LNode(String label, TreeNodeWithList child, LNode prev) {
        this.label = label;
        this.child = child;
        previous = prev;
        next = prev.next;
        prev.next = this;
        next.previous = this;
    }

    public String label() {
        return label;
    }

    public TreeNodeWithList child() {
        return child;
    }

    public LNode previous() {
        return previous;
    }

    public LNode next() {
        return next;
    }

    public LNode remove() {
        next.previous = previous;
        previous.next = next;
        return next;
    }
}
