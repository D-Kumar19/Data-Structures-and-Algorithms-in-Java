package OOP.Composition.Customers;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address wordAddress;

    Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public Address getWordAddress() {
        return wordAddress;
    }

    void setWordAddress(Address wordAddress) {
        this.wordAddress = wordAddress;
    }

    Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Home-Address: %s, Word-Address - %s", name, homeAddress, wordAddress);
    }
}