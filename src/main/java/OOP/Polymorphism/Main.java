package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        GeneralPractitioner practitioner = new GeneralPractitioner();
        Surgeon surgeon = new Surgeon();

        practitioner.doMedicine();
        practitioner.makeHouseCalls();

        surgeon.doMedicine();
        surgeon.performSurgery();
    }
}