/*************************************************************************************
 * Comments should describe the class and at least the public methods and constructors
 * from the viewpoint of a user.  Here you cannot find useful comments because writing
 * these comments is regarded as an exercise for you.
 ************************************************************************************/
public class Student {
    private final int regNumber;
    private String name;
    private String mail;

    public Student(int regNumber, String name) {
        this.regNumber = regNumber;
        setName(name);
        // setMail("e" + regNumber + "@student.tuwien.ac.at");
        setMail(String.format("e%8d@student.tuwien.ac.at", regNumber));
    }

    public int regNumber() {
        return regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
