package collections;

//Creating a Generic HashMap with Employee code as key and Employee Name as value.
import java.util.HashMap;
import java.util.Iterator;

//creating class name as GenericHashMap
public class GenericHashMap {

	//creating main method 
	public static void main(String[] args) {
		
		//Creating a generic HashMap object taking key as employee code and value as employee name
		//Map<Key, Value> map = new Map<Key , Value>(); 
		HashMap<Integer,String> employeeNames =new HashMap<Integer,String>();
		
		// Adding values to HashMap ("keys", "values") we use .put method 
		employeeNames.put(12,"Shanti");
		employeeNames.put(22,"Priya");
		employeeNames.put(16,"Tarani");
		employeeNames.put(33,"Azra");
		employeeNames.put(19,"Revanth");
		employeeNames.put(20,"Komali");
		
		 System.out.println("The Employee Names are : ");
	     //	we are  using Iterator to get the values of the employee names 
		Iterator valueIterator = employeeNames.values().iterator();
		while(valueIterator.hasNext()) {
		   
		    //this displays the employee names 
		    System.out.println(valueIterator.next());
		}
		
	}

}
