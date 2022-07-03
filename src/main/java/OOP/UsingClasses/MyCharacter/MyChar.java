package OOP.UsingClasses.MyCharacter;

class MyChar {
    private char myChar;

    MyChar(char myChar) {
        this.myChar = myChar;
    }

    static void printLowerCaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    boolean isVowel() {
        myChar = Character.toLowerCase(myChar);
        return myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u';
    }

    boolean isConsonant() {
        return !isVowel() && isAlphabet();
    }

    boolean isNumber() {
        return Character.isDigit(myChar);
    }

    boolean isAlphabet() {
        return Character.isAlphabetic(myChar);
    }

    char getMyChar(){
        return this.myChar;
    }
}