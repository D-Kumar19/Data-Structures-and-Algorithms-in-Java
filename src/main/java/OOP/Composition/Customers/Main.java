package OOP.Composition.Customers;

public class Main {
    public static void main(String[] args) {
        Address homeAddress = new Address("Kassai ut, 24, 1/ 1", "Debrecen", "Hajdu-Bihar", 4025);
        Customer aslam = new Customer("Aslam C", homeAddress);
        System.out.println(aslam.getHomeAddress());
        System.out.println(aslam);

        Address workAddress = new Address("Egyetem Suggarut ut, 24, 1/ 1", "Debrecen", "Hajdu-Bihar", 4027);
        aslam.setWordAddress(workAddress);
        System.out.println(aslam);
    }
}