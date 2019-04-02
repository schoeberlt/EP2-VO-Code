import java.util.Scanner;

public class PhoneBookTreeAssoc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeAssoc map = new TreeAssoc();  // only this line changed (compared with PhoneBookAssoc)

        String msgName = "Name:";
        String msgNum = "Neue Telefonnummer (keine Änderung bei leerer Eingabe):";
        String msgNoName = "Kein Telefonbucheintrag für ";

        String name = null;

        System.out.println(msgName);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (name == null) {
                name = line;
                String num = map.get(name);
                System.out.println(num == null ? msgNoName + name : num);
                System.out.println(msgNum);
            } else {
                if (!line.equals("")) {
                    map.put(name, line);
                }
                name = null;
                System.out.println(msgName);
            }
        }
        System.out.println("Auf Wiedersehen");
    }
}
