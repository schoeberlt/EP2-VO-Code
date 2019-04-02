public class TestTreeAssoc {

    public static void main(String[] args) {
        TreeAssoc assoc = new TreeAssoc();
        System.out.println("Befüllen begonnen");
        long r = fill(assoc, 1000000);
        System.out.println("Befüllen fertig, " + r + " bestehende Einträge geändert, Suche nach Schlüsseln begonnen");
        r = findKeys(assoc, 1000000);
        System.out.println("Suche nach Schlüsseln fertig, " + r + " Schlüssel gefunden, Suche nach Werten begonnen");
        r = findValues(assoc, 100);
        System.out.println("Suche nach Werten fertig, " + r + " Werte gefunden");
    }

    private static long fill(TreeAssoc assoc, long n) {
        long found = 0;
        while (n-- > 0) {
            if (assoc.put(random() + "key", random() + "val") != null) {
                found++;
            }
        }
        return found;
    }

    private static long findKeys(TreeAssoc assoc, long n) {
        long found = 0;
        while (n-- > 0) {
            if (assoc.containsKey(random() + "key")) {
                found++;
            }
        }
        return found;
    }

    private static long findValues(TreeAssoc assoc, long n) {
        long found = 0;
        while (n-- > 0) {
            if (assoc.containsValue(random() + "val")) {
                found++;
            }
        }
        return found;
    }

    private static int random() {
        return (int)(Math.random() * 1000000);
    }
}
