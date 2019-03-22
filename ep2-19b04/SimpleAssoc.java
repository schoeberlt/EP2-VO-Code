public class SimpleAssoc {
    private int top;
    private String[] ks = new String[8];
    private String[] vs = new String[8];

    private int find(String s, String[] a) {
        int i = 0;
        while (i < top &&
                !(s == null ? s == a[i] : s.equals(a[i])))
            i++;
        return i;
    }


    public String put(String k, String v) {
        int i = find(k, ks);
        if (i == top && ++top == ks.length) {
            String[] nks = new String[top << 1];
            String[] nvs = new String[top << 1];
            for (int j = 0; j < i; j++) {
                nks[j] = ks[j];
                nvs[j] = vs[j];
            }
            ks = nks;
            vs = nvs;
        }
        ks[i] = k;
        String old = vs[i];
        vs[i] = v;
        return old;
    }

    public String remove(String k) {
        int i = find(k, ks);
        String old = vs[i];
        if (i < top) {
            ks[i] = ks[--top];
            ks[top] = null;
            vs[i] = vs[top];
            vs[top] = null;
        }
        return old;
    }

    public String get(String k) {
        return vs[find(k, ks)];
    }

    public boolean containsKey(String k) {
        return find(k, ks) < top;
    }

    public boolean containsValue(String v) {
        return find(v, vs) < top;
    }

    public int size() {
        return top;
    }
}
