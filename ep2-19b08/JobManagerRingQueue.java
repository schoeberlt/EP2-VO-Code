import java.util.Scanner;

public class JobManagerRingQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RingQueue jobs = new RingQueue();

        System.out.println("Ihr Auftrag:");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String ret;
            if (line.equals("")) {
                String todo = jobs.poll();
                if (todo == null) {
                    ret = "Derzeit ist nichts zu tun.";
                } else {
                    ret = "Das ist zu tun: " + todo;
                }
            } else if (line.equals("?")) {
                String todo = jobs.peek();
                if (todo == null) {
                    ret = "Demnächst wäre nichts zu tun.";
                } else {
                    ret = "Demnächst wäre das zu tun: " + todo;
                }
            } else if (line.length() > 1 && line.charAt(0) == '?') {
                if (jobs.element(line.substring(1))) {
                    ret = "Ja, ein solcher Auftrag existiert.";
                } else {
                    ret = "Nein, es gibt keinen solchen Auftrag.";
                }
            } else {
                jobs.add(line);
                ret = "Auftrag angenommen.";
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
