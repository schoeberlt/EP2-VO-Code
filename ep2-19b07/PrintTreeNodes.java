public class PrintTreeNodes {

    public static void main(String[] args) {
        TreeNode tree = createOpt();
        // TreeNode tree = createGood();
        // TreeNode tree = createBad();

        System.out.print("traverseLR(-1): ");
        tree.traverseLR(-1);
        System.out.println();
        System.out.print("traverseLR( 0): ");
        tree.traverseLR(0);
        System.out.println();
        System.out.print("traverseLR( 1): ");
        tree.traverseLR(1);
        System.out.println("\n-----------");
        System.out.print("traverseRL(-1): ");
        tree.traverseRL(-1);
        System.out.println();
        System.out.print("traverseRL( 0): ");
        tree.traverseRL(0);
        System.out.println();
        System.out.print("traverseRL( 1): ");
        tree.traverseRL(1);
        System.out.println();
    }

    // create optimally balanced tree as in script and on slides:
    //             12
    //            /  \
    //           8    18
    //          / \  /  \
    //         4  9 15  22
    private static TreeNode createOpt() {
        TreeNode tree = new TreeNode(12);
        tree.add(8);
        tree.add(18);
        tree.add(4);
        tree.add(9);
        tree.add(15);
        tree.add(22);
        return tree;
    }

    // create a tree of depth one more than optimum:
    //              8
    //             / \
    //            4  12
    //              /  \
    //             9   18
    //                /  \
    //               15  22
    private static TreeNode createGood() {
        TreeNode tree = new TreeNode(8);
        tree.add(12);
        tree.add(18);
        tree.add(4);
        tree.add(9);
        tree.add(15);
        tree.add(22);
        return tree;
    }

    // create degenerate tree:
    //           4
    //            \
    //             8
    //              \
    //               9
    //                \
    //                12
    //                  \
    //                  15
    //                    \
    //                    18
    //                      \
    //                      22
    private static TreeNode createBad() {
        TreeNode tree = new TreeNode(4);
        tree.add(8);
        tree.add(9);
        tree.add(12);
        tree.add(15);
        tree.add(18);
        tree.add(22);
        return tree;
    }
}
