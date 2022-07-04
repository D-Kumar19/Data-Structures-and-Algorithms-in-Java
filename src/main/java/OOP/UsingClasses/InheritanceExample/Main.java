package OOP.UsingClasses.InheritanceExample;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dheeraj Kumar", "dheerajkumar.190102@gmail.com", "0124874512", "BeaconHouse", 2018);
        System.out.println(student);

        Employee emp1 = new Employee("Bilal", "Bilal@gmail.com", "01257521", "Manager", "Aslam", 'B', 1200);
        System.out.println("Name of Employer: " + emp1.getEmployer());
        System.out.println("Name of the Employee: " + emp1.getName());
        System.out.println(emp1);
    }
}