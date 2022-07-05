package Generics;

import java.util.ArrayList;

public class CustomList2<T extends Number> {
    private ArrayList<T> list = new ArrayList<>();

    void addElement(T element) {
        list.add(element);
    }

    public boolean removeElement(T element) {
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