import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NameNumber[] phoneBook = new NameNumber[2];

        String msgName = "Name:";
        String msgNum = "Neue Telefonnummer (keine Änderung bei leerer Eingabe):";
        String msgNoName = "Kein Telefonbucheintrag für ";

        String name = null;
        NameNumber found = null;

        System.out.println(msgName);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (name == null) {
                name = line;
                found = findName(phoneBook, name);
                System.out.println(found == null ? msgNoName + name : found.getNumber());
                System.out.println(msgNum);
            } else {
                if (!line.equals("")) {
                    if (found == null) {
                        phoneBook = add(phoneBook, new NameNumber(name, line));
                    } else {
                        found.setNumber(line);
                    }
                }
                name = null;
                found = null;
                System.out.println(msgName);
            }
        }
        System.out.println("Auf Wiedersehen!");
    }

    private static NameNumber findName(NameNumber[] phoneBook, String name) {
        for (NameNumber entry : phoneBook) {
            if (entry != null && entry.getName().equals(name)) {
                return entry;
            }
        }
        return null;
    }

    private static NameNumber[] add(NameNumber[] phoneBook, NameNumber entry) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] == null) {
                phoneBook[i] = entry;
                return phoneBook;
            }
        }
        NameNumber[] larger = new NameNumber[phoneBook.length * 2];
        for (int i = 0; i < phoneBook.length; i++) {
            larger[i] = phoneBook[i];
        }
        larger[phoneBook.length] = entry;
        return larger;
    }
}


class NameNumber {
    private String name, number;

    public NameNumber(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
