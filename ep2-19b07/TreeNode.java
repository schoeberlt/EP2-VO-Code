public class TreeNode {
    private int value;
    private TreeNode left, right;

    public TreeNode(int v) {
        value = v;
    }

    public void add(int v) {
        if (v < value) {
            if (left != null) {
                left.add(v);
            } else {
                left = new TreeNode(v);
            }
        } else if (v > value) {
            if (right != null) {
                right.add(v);
            } else {
                right = new TreeNode(v);
            }
        }
    }

    public boolean contains(int v) {
        return v == value ||
                (v < value ? left != null && left.contains(v)
                        : right != null && right.contains(v));
    }







    public void traverseLR(int pos) {
        if (pos < 0) {
            System.out.print(value + " ");
        }
        if (left != null) {
            left.traverseLR(pos);
        }
        if (pos == 0) {
            System.out.print(value + " ");
        }
        if (right != null) {
            right.traverseLR(pos);
        }
        if (pos > 0) {
            System.out.print(value + " ");
        }
    }

    public void traverseRL(int pos) {
        if (pos < 0) {
            System.out.print(value + " ");
        }
        if (right != null) {
            right.traverseRL(pos);
        }
        if (pos == 0) {
            System.out.print(value + " ");
        }
        if (left != null) {
            left.traverseRL(pos);
        }
        if (pos > 0) {
            System.out.print(value + " ");
        }
    }

}
