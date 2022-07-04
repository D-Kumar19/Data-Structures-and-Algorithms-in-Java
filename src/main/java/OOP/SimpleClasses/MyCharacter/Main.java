package OOP.SimpleClasses.MyCharacter;

public class Main {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('9');
        System.out.println("Is " + myChar.getMyChar() + " a Vowel? " + myChar.isVowel());
        System.out.println("Is " + myChar.getMyChar() + " a Consonant? " + myChar.isConsonant());
        System.out.println("Is " + myChar.getMyChar() + " a Number? " + myChar.isNumber());
        System.out.println("Is " + myChar.getMyChar() + " an Alphabet? " + myChar.isAlphabet());

        System.out.println("Print Lower Case Alphabetic Characters: ");
        MyChar.printLowerCaseAlphabets();

        System.out.println("Print Upper Case Alphabetic Characters: ");
        MyChar.printUpperCaseAlphabets();
    }
}