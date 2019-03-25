import java.util.Scanner;

public class JobManagerList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListStack jobs = new ListStack();
        // ListQueueSimple jobs = new ListQueueSimple();
        // ListQueue jobs = new ListQueue();

        System.out.println("Ihr Auftrag:");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String ret;
            if (line.equals("?")) {
                String todo = jobs.pop();
                if (todo == null) {
                    ret = "Derzeit ist nichts zu tun.";
                } else {
                    ret = "Das ist zu tun: " + todo;
                }
            } else {
                jobs.push(line);
                ret = "Auftrag angenommen.";
            }
            System.out.println(ret);
            System.out.println("Ihr Auftrag:");
        }
        System.out.println("Auf Wiedersehen!");
    }
}
