package Generic;

class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
    @Override
    public String toString() {
        return "GenericClass [data=" + data + "]";
    }
    
}     
public class App1 {
    public static void main(String[] args) {
        GenericClass<String> genericData = new GenericClass<String>("Some data");
        String data = genericData.getData();
        System.out.println(data);
        
    }
}