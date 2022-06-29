package OOP.Polymorphism;

public class GeneralPractitioner implements  Doctor{
    @Override
    public void doMedicine() {
        System.out.println("I am a Doctor but I am working as a General Practitioner!");
    }

    public void makeHouseCalls(){
        System.out.println("Making House Call!");
    }
}