import java.util.Scanner;

public class JobManagerRingDEQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RingDEQueue jobs = new RingDEQueue();

        System.out.println("Ihr Auftrag:");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String ret;
            if (line.length() >= 1 && line.charAt(0) == '!') {
                if (line.equals("!")) {
                    String todo = jobs.pollFirst();
                    if (todo == null) {
                        ret = "Derzeit ist nichts zu tun.";
                    } else {
                        ret = "Das ist mit niedrigster Priorität zu tun: " + todo;
                    }
                } else if (line.equals("!?")) {
                    String todo = jobs.peekFirst();
                    if (todo == null) {
                        ret = "Es wäre nichts zu tun.";
                    } else {
                        ret = "Mit niedrigster Priorität wäre das zu tun: " + todo;
                    }
                } else {
                    jobs.addLast(line.substring(1));
                    ret = "Auftrag mit höchster Priorität angenommen.";
                }
            } else {
                if (line.equals("")) {
                    String todo = jobs.pollLast();
                    if (todo == null) {
                        ret = "Derzeit ist nichts zu tun.";
                    } else {
                        ret = "Das ist mit höchster Priorität zu tun: " + todo;
                    }
                } else if (line.equals("?")) {
                    String todo = jobs.peekLast();
                    if (todo == null) {
                        ret = "Es wäre nichts zu tun.";
                    } else {
                        ret = "Mit höchster Priorität wäre das zu tun: " + todo;
                    }
                } else {
                    jobs.addFirst(line);
                    ret = "Auftrag mit niedriger Priorität angenommen.";
                }
            }
            System.out.println(ret);
            System.out.println("Ihr Auftrag:");
        }
        if (!jobs.isEmpty()) {
            System.out.println("Nicht alle Aufträge abgearbeitet.");
        }
        System.out.println("Auf Wiedersehen!");
    }
}
