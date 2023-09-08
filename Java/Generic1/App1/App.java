package Generic1.App1;

class Data<K, V>{
    private K key;
    private V value;
    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Data [key=" + key + ", value=" + value + "]";
    }
}
public class App {
    public static void main(String[] args) {
        //Data data = new Data(1, "Maria");
        //System.out.println(data);

        Data<Integer, String> data2 = new Data<Integer, String>(0, "Gian");
        System.out.println(data2);
        System.out.println("Key: " + data2.getKey() + " Value: " + data2.getValue());
    }
}
