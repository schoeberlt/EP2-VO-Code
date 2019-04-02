public class TestSTree {

    public static void main(String[] args) {
        System.out.println("Baumerzeugung begonnen");
        STree tree = create(1000000);
        System.out.println("Baumerzeugung fertig, Suche begonnen");
        double found = find(tree, 1000000);
        System.out.println("Suche fertig, " + found * 100.0 + "% gefunden");
    }

    private static STree create(long n) {
        STree tree = new STree();
        while (n-- > 0) {
            tree.add(random());
        }
        return tree;
    }

    private static double find(STree tree, long m) {
        long found = 0;
        for (long i = 0; i < m; i++) {
            if (tree.contains(random())) {
                found++;
            }
        }
        return (double) found / (double) m;
    }

    private static int random() {
        return (int)(Math.random() * 1000000);
    }
}
