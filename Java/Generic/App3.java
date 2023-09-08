package Generic;

import java.util.*;

class Data<T>{
    private T myVariable;

    public Data(T myVariable) {
        this.myVariable = myVariable;
    }
    public T getMyVariable() {
        return myVariable;
    }
    @Override
    public String toString() {
        return "Data [myVariable=" + myVariable + "]";
    }

}
public class App3 {
    public static void main(String[] args) {
        List<Object> elements = new LinkedList<>();
        elements.add(new Data<Object>("Some Text"));
        elements.add(new Data<Object>(1.0));
        elements.add(new Data<Object>(1));
        elements.add(new Data<Object>('@'));
        elements.add(new Data<Object>(3.0f));

        App app = new App();
        app.printList(elements);
    }
    void printList(List<Data<Object>> list) {
        ListIterator<Data<Object>> iterator = list.listIterator();
        while(iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}
