package OOP.Inheritance.InheritanceExample2ArrayList;

import java.util.ArrayList;
public class ExtendedArrayList<Object> extends ArrayList<Object> {
    public ArrayList<Object> list = new ArrayList<>();
    public Object pop(){
        return this.list.remove(this.list.size() - 1);
    }
    public void push(Object element){
        this.list.add(element);
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < list.size(); i++){
            if(i != list.size() - 1) result.append(list.get(i)).append(", ");
            else result.append(list.get(i));
        }
        return result.append("]").toString();
    }
}