public class TestNavigatableTree {
    private NavigatableTree tree = new NavigatableTree();

    public static void main(String[] args) {
        TestNavigatableTree test = new TestNavigatableTree();
        test.fill();
        test.print("");
        System.out.println();
        test.manipulate();
        test.print("");
    }

    private void fill() {
        tree.addChild("external", "External Libraries");
        tree.previousChild();
        tree.addChild("project", "EP2");
        tree.downToCurrentChild();
        tree.addChild("administrative", ".idea");
        tree.addChild("directory", "out");
        tree.addChild("directory", "src");
        tree.downToCurrentChild();
        tree.addChild("java file", "NavigatableTree.java");
        tree.addChild("java file", "TestNavigatableTree.java");
        tree.upToParent();
        tree.previousChild();
        tree.addChild("directory", "production");
        tree.downToCurrentChild();
        tree.addChild("directory", "EP2");
        tree.downToCurrentChild();
        tree.addChild("class file", "NavigatableTree.class");
        tree.addChild("class file", "TestNavigatableTree.class");

        while (tree.upToParent()) {}
    }

    private void manipulate() {
        tree.nextChild();
        tree.downToCurrentChild();
        tree.nextChild();
        tree.nextChild();
        tree.removeSubtree();
        tree.upToParent();
        tree.addParent("all", "Projects");
        tree.upToParent();
    }

    private void print(String indent) {
        while (tree.previousChild()) {}
        while (tree.nextChild()) {
            String label = tree.currentChildsLabel();
            tree.downToCurrentChild();
            System.out.println(indent + tree.currentValue() + " (" + label + ")");
            print(indent + "| ");
            tree.upToParent();
        }
    }
}
