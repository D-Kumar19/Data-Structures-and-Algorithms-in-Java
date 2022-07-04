package OOP.UsingClasses.Customers;

class Address {
    private String line;
    private String city;
    private String district;
    private int zipCode;

    Address(String line, String city, String district, int zipCode) {
        this.line = line;
        this.city = city;
        this.district = district;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return String.format("Line: %s, City: %s, District: %s, ZipCode: %d", line, city, district, zipCode);
    }
}