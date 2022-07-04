package OOP.Inheritance.InheritanceExample1PersonClass;

public class Student extends Person {
    private String college;
    private int year;

    Student(String name, String email, String phoneNumber, String college, int year) {
        super(name, email, phoneNumber);
        this.college = college;
        this.year = year;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Person Details: [%s], College: %s, Year: %d", super.toString(), college, year);
    }
}