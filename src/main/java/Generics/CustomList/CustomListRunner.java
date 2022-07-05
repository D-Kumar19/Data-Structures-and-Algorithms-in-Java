package Generics.CustomList;

public class CustomListRunner {
    public static void main(String[] args) {
        // Custom List 1:
        CustomList1<String> list1 = new CustomList1<>();
        list1.addElement("Element 1");
        list1.addElement("Element 2");
        list1.addElement("Element 3");
        list1.addElement("Element 4");
        System.out.println("String at Index 0: " + list1.get(0));
        System.out.println("String at Index 4: " + list1.get(4));
        System.out.println("Remove String Element 4: " + list1.removeElement("Element 4"));
        System.out.println("Remove String Element 10: " + list1.removeElement("Element 10"));
        System.out.println(list1);

        System.out.println();
        CustomList1<Integer> list2 = new CustomList1<>();
        list2.addElement(5);
        list2.addElement(7);
        list2.addElement(3);
        list2.addElement(8);
        System.out.println("Integer at Index 0: " + list2.get(0));
        System.out.println("Integer at Index 4: " + list2.get(4));
        System.out.println("Remove Integer 5: " + list2.removeElement(5));
        System.out.println("Remove Integer 15: " + list2.removeElement(15));
        System.out.println(list2);

        // Custom List 2: (Restricting Only for Numbers)
        // CustomList2<String> list3 = new CustomList2<>(); // Will not work!
        CustomList2<Long> list4 = new CustomList2<>();
    }
}