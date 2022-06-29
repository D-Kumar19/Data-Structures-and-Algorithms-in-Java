package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        ExtendedArrayList<Integer> arrayList = new ExtendedArrayList<>();

        arrayList.push(78);
        arrayList.push(718);
        arrayList.push(783);
        arrayList.push(784);
        arrayList.push(7845);
        arrayList.push(834);
        System.out.println(arrayList);

        System.out.println(arrayList.pop());
        System.out.println(arrayList);
    }
}