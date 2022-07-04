package OOP.Inheritance.InheritanceExample1PersonClass;

public class Employee extends Person {
    private String title;
    private String employer;
    private char employeeGrade;
    private double salary;

    Employee(String name, String email, String phone, String title, String employer, char employeeGrade, double salary) {
        super(name, email, phone);
        this.title = title;
        this.employer = employer;
        this.employeeGrade = employeeGrade;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Person Details: [%s], Title: %s, Employer: %s, Employee-Grade: %c!", super.toString(), title, employer, employeeGrade);
    }
}
