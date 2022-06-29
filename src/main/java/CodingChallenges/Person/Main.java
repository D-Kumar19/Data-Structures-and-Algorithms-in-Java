package CodingChallenges.Person;

public class Main {
    public static void main(String[] args) {
        PersonModel p1 = new PersonModel("Ron", "Freeman", 37);
        PersonModel p2 = new PersonModel("Taylor", "Warren", 29);
        PersonModel p3 = new PersonModel("Sarah", "Ford", 52);

        p1.introduceYourself();
        p2.introduceYourself();
        p3.introduceYourself();
    }
}
