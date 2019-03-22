public class Factorial {

    public static long fact(int n) {
        return n < 2 ? (long) n : n * fact(n - 1);
    }
}
