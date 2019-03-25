public class TestTreeNodeArray {
    public static void main(String[] args) {
        TreeNodeArray dirs = create();
        if (dirs != null) {
            show(dirs, "");
        }
    }

    private static TreeNodeArray create() {
        TreeNodeArray dirs = new TreeNodeArray("EP2",
                new TreeNodeArray(".idea"),
                new TreeNodeArray("out",
                        new TreeNodeArray("production",
                                new TreeNodeArray("EP2")
                        )
                ),
                new TreeNodeArray("src")
        );
        return dirs;
    }

    private static void show(TreeNodeArray tree, String atLeft) {
        System.out.println(atLeft + tree.value());
        if (tree.children() != null) {
            for (TreeNodeArray child : tree.children()) {
                show(child, atLeft + "| ");
            }
        }
    }
}
