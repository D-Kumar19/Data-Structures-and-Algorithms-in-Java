package OOP.Polymorphism;

public class Surgeon implements Doctor {
    @Override
    public void doMedicine() {
        System.out.println("I am a Doctor but I am working as a Surgeon!");
    }

    public void performSurgery(){
        System.out.println("Performing a Surgery!");
    }
}