import java.util.Scanner;

public class JobManagerQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SQueue jobs = new SQueue();

        System.out.println("Ihr Auftrag:");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String ret;
            if (line.equals("?")) {
                String todo = jobs.poll();
                if (todo == null) {
                    ret = "Derzeit ist nichts zu tun.";
                } else {
                    ret = "Das ist zu tun: " + todo;
                }
            } else {
                jobs.add(line);
                ret = "Auftrag angenommen.";
            }
            System.out.println(ret);
            System.out.println("Ihr Auftrag:");
        }
        System.out.println("Auf Wiedersehen!");
    }
}
