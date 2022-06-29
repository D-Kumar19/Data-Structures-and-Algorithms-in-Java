package CodingChallenges.Person;

public class PersonModel {
    private String firstName;
    private String lastName;
    private int age;

    public PersonModel(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {
        if (age < this.age) System.out.println("Sorry! You can't do this!");
        else this.age = age;
    }

    public void introduceYourself(){
        System.out.println("My name is: " + this.firstName + " " + this.lastName + " and I am " + this.age + " years old!");
    }
}
