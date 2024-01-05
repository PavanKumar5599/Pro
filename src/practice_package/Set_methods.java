package practice_package;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_methods {
	public static void main(String[] args) {
		
		 Set<String> data = new LinkedHashSet<String>();   
		    
	        data.add("JavaTpoint");   
	        data.add("Set");   
	        data.add("Example");   
	        data.add("Set");   
	    
	        System.out.println(data); 
		
	        Set<Integer> data1 = new LinkedHashSet<Integer>();   
	        data1.add(31);   
	        data1.add(21);   
	        data1.add(41);   
	        System.out.println("Set: " + data1);  
	        ArrayList<Integer> newData = new ArrayList<Integer>();   
	        newData.add(91);   
	        newData.add(71);   
	        newData.add(81);
	        
	        //clear method
	        data1.clear();
	        
	        data1.addAll(newData);   
	        System.out.println("Set: " + data1);   
	        
	        //contains method
	        
	        Set<Integer> data11 = new LinkedHashSet<Integer>();   
	        data11.add(31);   
	        data11.add(21);   
	        data11.add(41);   
	        data11.add(51);   
	        data11.add(11);   
	        data11.add(81);   
	        
	        //isEmpty() method
	       
	        System.out.println(data1.isEmpty());
	        System.out.println("Set: " + data11);  
	        
	        //remove() method
	        data11.remove(21);
	        data11.remove(41);
	        
	        System.out.println("updated Set: " + data11);
	        
	        System.out.println("Does the Set contains '91'?" + data11.contains(91));   
	        System.out.println("Does the Set contains 'javaTpoint'? " + data11.contains("4"));  
	        System.out.println("Does the Set contains '51'? " + data11.contains(51));  
	        
	        //iterator() method
	        
	        Set<Integer> data111 = new LinkedHashSet<Integer>();   
	        data111.add(31);   
	        data111.add(21);   
	        data111.add(41);   
	        data111.add(51);   
	        data111.add(11);   
	        data111.add(81);   
	        System.out.println("data: " + data111);  
	          
	        Iterator newData1 = data111.iterator();  
	        System.out.println("The NewData values are: ");   
	        while (newData1.hasNext()) {   
	            System.out.println(newData1.next());   
	        }  
	        
	        
	        HashSet<String> hash=new HashSet();
	        hash.add("venky");
	        hash.add("balu");
	        hash.add("pavan");
	        hash.add("srikanth");
	        hash.add("vamsi");
	        
	        for(String i:hash) {
	        	System.out.println(i.hashCode()+":"+i);
	        }
	      
	        System.out.println("hash"+hash);
	        //size() method
	        
	        System.out.println(data.size());
	        
	       //remove all method 
	        
	        Set<Integer> data1111 = new LinkedHashSet<Integer>();   
	        data1111.add(31);   
	        data1111.add(21);   
	        data1111.add(41);  
	        data1111.add(91);   
	        data1111.add(71);   
	        data1111.add(81);         
	        System.out.println("data: " + data1111);  
	          
	        ArrayList<Integer> newData11 = new ArrayList<Integer>();   
	        newData11.add(91);   
	        newData11.add(71);   
	        newData11.add(81);  
	        System.out.println("NewData: " + newData11);  
	          
	        data1111.removeAll(newData11);  
	        System.out.println("data after removing Newdata elements : " + data1111);   
	        
	        //hashode method
	        
	        Set<Integer> data4 = new LinkedHashSet<Integer>();   
	        data4.add(31);   
	        data4.add(21);   
	        data4.add(41);   
	        data4.add(51);   
	        data4.add(11);   
	        data4.add(81);   
	        System.out.println("data: " + data4);  
	        System.out.println("\nThe hash code value of set is:"+ data4.hashCode());  
	        
	        
	        //toArray() method
	        
	        Set<String> abs_col = new HashSet<String>();
	        
	        // Use add() method to add
	        // elements into the Set
	        abs_col.add("Welcome");
	        abs_col.add("To");
	        abs_col.add("Geeks");
	        abs_col.add("For");
	        abs_col.add("Geeks");
	 
	        // Displaying the Set
	        System.out.println("The Set: "
	                           + abs_col);
	 
	        // Creating the array and using toArray()
	        Object[] arr = abs_col.toArray();
	 
	        System.out.println("The array is:");
	        for (int j = 0; j < arr.length; j++)
	            System.out.println(arr[j]);
	    }
	        
		
	

}
