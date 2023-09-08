package Generic1.App2;
import java.util.ArrayList;
import java.util.List;


class Data{
    public<E> void printListData(List<E> list){
        for (E element : list) {
            System.out.println(element);
        }
    }

    public<E> void printArrayData(E[] arrayData){
        for (E element : arrayData) {
            System.out.println(element);
        }
    }
}
public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Data data = new Data();
        data.printListData(list);

        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four"); 
        Data data1 = new Data();
        System.out.println("--------------------");
        data1.printListData(list1);
        System.out.println("--------------------");
        String[] stringArray = {"One","Two","Three","Four"};
        data.printArrayData(stringArray);
        System.out.println("--------------------");
        Integer[] integerArray = {1,2,3,4};
        data.printArrayData(integerArray);
    }
}  
