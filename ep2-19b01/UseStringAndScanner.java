import java.util.Scanner;

public class UseStringAndScanner {

    private static void printFifthChar(String s) {
        if (s != null && s.length() > 4) {
            System.out.println(s.charAt(4));
        }
    }

    private static void echo() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void main(String[] args) {
        printFifthChar("abcdef");
        echo();
    }

}
