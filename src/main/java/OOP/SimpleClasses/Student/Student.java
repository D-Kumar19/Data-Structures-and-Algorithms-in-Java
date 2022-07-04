package OOP.SimpleClasses.Student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
class Student {
    private String name;
    private ArrayList<Integer> listOfMarks = new ArrayList<>();

    Student(String name, int... listOfMarks) {
        this.name = name;

        for (int marks : listOfMarks) {
            this.listOfMarks.add(marks);
        }
    }

    String getName() {
        return name;
    }

    int getNumberOfMarks() {
        return listOfMarks.size();
    }

    int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : listOfMarks) {
            sum += mark;
        }
        return sum;
    }

    int getMinimumMark() {
        return Collections.min(listOfMarks);
    }

    int getMaximumMark() {
        return Collections.max(listOfMarks);
    }

    BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int totalSubjects = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(totalSubjects), 2, RoundingMode.CEILING);
    }

    void addMarks(int mark) {
        listOfMarks.add(mark);
    }

    void removeMark(int index) {
        if (index >= 0 && index < listOfMarks.size()) {
            listOfMarks.remove(index);
        }
    }

    @Override
    public String toString() {
        return name + " " + listOfMarks;
    }
}