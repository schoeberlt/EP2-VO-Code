public class STree {
    private TreeNode root;

    // add v if not already in the tree
    public void add(int v) {
        if (root == null) {
            root = new TreeNode(v);
        } else {
            root.add(v);
        }
    }

    // is v in the tree?
    public boolean contains(int v) {
        return root != null && root.contains(v);
    }
}
