package OOP.SimpleClasses.Student;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Student dheeraj = new Student("Dheeraj Kumar", 20, 90, 80, 78, 50, 100);
        int number = dheeraj.getNumberOfMarks();
        int sum = dheeraj.getTotalSumOfMarks();
        int maximumMark = dheeraj.getMaximumMark();
        int minimumMark = dheeraj.getMinimumMark();
        BigDecimal average = dheeraj.getAverageMarks();

        System.out.println("Student name: " + dheeraj.getName() + " has " + number + " subjects!");
        System.out.println("Sum of Marks is: " + sum + "! Maximum and Minimum marks are: " + maximumMark + " " + minimumMark + "!");
        System.out.println("The average is " + average);

        System.out.println("List of Marks before adding one Mark: " + dheeraj);
        dheeraj.addMarks(85);
        System.out.println("List of Marks after adding one Mark: " + dheeraj);

        System.out.println("List of Marks before removing one Mark at invalid index: " + dheeraj);
        dheeraj.removeMark(9);
        System.out.println("List of Marks after removing one Mark at invalid index: " + dheeraj);

        System.out.println("List of Marks before removing one Mark at valid index: " + dheeraj);
        dheeraj.removeMark(0);
        System.out.println("List of Marks after removing one Mark at valid index: " + dheeraj);
    }
}