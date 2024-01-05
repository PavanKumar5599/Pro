package practice_package;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//size() and clear()
		
		 List<String> strList = new ArrayList<String>();           // Creating a list 
	        //add items to list
	        strList.add("Java");  
	        strList.add("C++");  
	        //print the size of list
	        System.out.println("Size of list:" + strList.size());  
	        //add more items to list
	        strList.add("Ruby"); 
	        strList.add("Python"); 
	        strList.add("C#"); 
	        //print the size of list again
	        System.out.println("Size of list after adding more elements:" + strList.size());  
	        //clear method       
	        strList.clear();
	        
	        System.out.println("List after calling clear() method:" + strList);
	        
	        //add() and addAll()
	        
	        List<String> strList1 = new ArrayList<String>();           // Creating a list 
	        strList1.add("Java");  
	        strList1.add("C++");  
	        //print the list
	        System.out.println("List after adding two elements:" + strList1);  
	        List<String> llist = new ArrayList<String>();       // Create another list
	        llist.add("Ruby"); 
	        llist.add("Python"); 
	        llist.add("C#"); 
	         // addAll method - add llist to strList 
	        strList.addAll(llist); 
	        System.out.println("List after addAll:"+ strList1); 
	        
	        //contains and containAll
	        
	        List<String> list = new ArrayList<String>();
	        //initialize list to strings
	        list.add("Java");
	        list.add("Xml");
	        list.add("Python");
	        list.add("Ruby");
	        list.add("JavaScript");
	 
	        //contains method demo
	        if(list.contains("C")==true)
	            System.out.println("Given list contains string 'C'");
	        else if(list.contains("Java")==true)
	        System.out.println("Given list contains string 'Java' but not string 'C'");
	         
	        //containsAll method demo
	        List<String> myList = new ArrayList<String>();
	        myList.add("Ruby");
	        myList.add("Python");
	        if(list.containsAll(myList)==true)
	            System.out.println("List contains strings 'Ruby' and 'Python'");
	        
	        
	        //equals method
	        
	        List<Integer> first_list= new LinkedList<>();  
	        List<Integer> second_list = new LinkedList<>();
	        List<Integer> third_list = new LinkedList<>();
	        //initialize lists with values
	        for (int i=0;i<11;i++){  
	            first_list.add(i); 
	             second_list.add(i);  
	              third_list.add(i*i);  
	        }
	        //print each list
	        System.out.println("First list: " + first_list);
	        System.out.println("Second list: " + second_list);
	        System.out.println("Third list: " + third_list);   
	 
		//use equals method to check equality with each list to other
		if (first_list.equals(second_list) == true)
		System.out.println("\nfirst_list and second_list are equal.\n");
		else
		System.out.println("first_list and second_list are not equal.\n");
		 
		if(first_list.equals(third_list))
		System.out.println("first_list and third_list are equal.\n");
		else
		System.out.println("first_list and third_list are not equal.\n");
		if(second_list.equals(third_list))
		System.out.println("second_list and third_list are equal.\n");
		else
		System.out.println("second_list and third_list are not equal.\n");
		
		//indexOff and lastIndex
		List<Integer> intList = new ArrayList<Integer>(5); 
		//add elements to the list
		intList.add(10); 
		intList.add(20); 
		intList.add(30); 
		intList.add(10); 
		intList.add(20);
		//print the list
		System.out.println("The list of integers:" + intList);
		
		// Use indexOf() and lastIndexOf() methods of list to find first and last index
		System.out.println("first index of 20:"
		                   + intList.indexOf(20)); 
		System.out.println("last index of 10:"
		                   + intList.lastIndexOf(10));
		
		//remove and removeAll
		
		// Creating a list 
        List<Integer> oddList = new ArrayList<Integer>(); 
        //add elements to the list
        oddList.add(1);
        oddList.add(3);
        oddList.add(5);
        oddList.add(7);
        oddList.add(9);
        oddList.add(11);
        //print the original list
        System.out.println("Original List:" + oddList);
        // Removes element from index 1 
        oddList.remove(1); 
        System.out.println("Oddlist after removing element at index 1:" + oddList);
         
        //removeAll method
        List<Integer> c1 = new ArrayList<Integer>();
        c1.add(1);
        c1.add(5);
        c1.add(11);
        oddList.removeAll(c1);
        System.out.println("Oddlist after removing elements {1,5,11}}:" + oddList);
	        
	        
	        

	}

}
