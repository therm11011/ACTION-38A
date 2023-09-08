package Generic;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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
public class App2 {
   public static void main(String[] args) {
	List<Object> elements = new LinkedList<>();
	   elements.add("Some String");
	   elements.add(1);
	   elements.add(2.0);
	   elements.add('0');
	   
	   App app = new App();
	   app.printList(elements);
}
   void printList(List<Object> list) {
	   ListIterator<Object> iterator = list.listIterator();
	   while(iterator.hasNext()) {
		   System.out.println("Element: " + iterator.next());
	   }
   }
   
   
}
