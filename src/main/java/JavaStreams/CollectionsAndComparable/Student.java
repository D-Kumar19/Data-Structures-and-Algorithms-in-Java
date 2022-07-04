package JavaStreams.CollectionsAndComparable;

public class Student implements Comparable<Student> {
    private String name;
    private int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, ID: %d", name, id);
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(id, that.id);
    }
}