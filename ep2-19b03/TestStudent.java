public class TestStudent {

    private static Student find(Student[] studs, int reg) {
    for (Student stud : studs) {
        if (stud.regNumber() == reg) {
            return stud;
        }
    }
    return new Student(reg, "Max Mustermann");
}


    public static void main(String[] args) {
        Student[] studs = {
                new Student(11111111, "Anna Anderson"),
                new Student(22222222, "Bert Bach"),
                new Student(33333333, "Carina Claus"),
                new Student(44444444, "David Dekker")
        };

        Student a = find(studs, 22222222);
        Student b = find(studs, 55555555);

        System.out.println(a.regNumber() + ": " + a.getName() + " (" + a.getMail() + ")");
        System.out.println(b.regNumber() + ": " + b.getName() + " (" + b.getMail() + ")");

        a.setMail("bert.bach@student.tuwien.ac.at");
        b.setName("Eva Escher");

        System.out.println(a.regNumber() + ": " + a.getName() + " (" + a.getMail() + ")");
        System.out.println(b.regNumber() + ": " + b.getName() + " (" + b.getMail() + ")");

    }
}
