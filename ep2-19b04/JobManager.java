import java.util.Scanner;

public class JobManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] jobs = new String[2];

        System.out.println("Ihr Auftrag:");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String ret;
            if (line.equals("?")) {
                String todo = getJob(jobs);
                if (todo == null) {
                    ret = "Derzeit ist nichts zu tun.";
                } else {
                    ret = "Das ist zu tun: " + todo;
                }
            } else {
                jobs = putJob(jobs, line);
                ret = "Auftrag angenommen.";
            }
            System.out.println(ret);
            System.out.println("Ihr Auftrag:");
        }
        System.out.println("Auf Wiedersehen!");
    }

    private static String getJob(String[] jobs) {
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i] != null) {
                String todo = jobs[i];
                jobs[i] = null;
                return todo;
            }
        }
        return null;
    }

    private static String[] putJob(String[] jobs, String todo) {
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i] == null) {
                jobs[i] = todo;
                return jobs;
            }
        }
        String[] larger = new String[jobs.length * 2];
        for (int i= 0; i < jobs.length; i++) {
            larger[i] = jobs[i];
        }
        larger[jobs.length] = todo;
        return larger;
    }
}
