package Generics;

import java.util.ArrayList;

public class CustomList1<T> {
    private ArrayList<T> list = new ArrayList<>();

    void addElement(T element) {
        list.add(element);
    }

    boolean removeElement(T element) {
        return list.remove(element);
    }

    T get(int index) {
        if (index < list.size()) {
            return list.get(index);
        }
        return null;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}