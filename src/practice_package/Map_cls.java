package practice_package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program to illustrate HashMap class of java.util
		// package

		// Importing HashMap class
		
				// Create an empty hash map by declaring object
				// of string and integer type
				HashMap<String, Integer> map = new HashMap<>();

				// Adding elements to the Map
				// using standard put() method
				map.put("vishal", 10);
				map.put("sachin", 30);
				map.put("vaibhav", 20);

				// Print size and content of the Map
				System.out.println("Size of map is:- "
								+ map.size());

				// Printing elements in object of Map
				System.out.println(map);

				// Checking if a key is present and if
				// present, print value by passing
				// random element
				if (map.containsKey("vishal")) {

					// Mapping
					Integer a = map.get("vishal");

					// Printing value for the corresponding key
					System.out.println("value for key"
									+ " \"vishal\" is:- " + a);
					
				}
				
						HashMap<String, String> capitalCities = new HashMap<String, String>();		
						
					    capitalCities.put("England", "London");
					    capitalCities.put("Germany", "Berlin");
					    capitalCities.put("Norway", "Oslo");
					    capitalCities.put("USA", "Washington DC");
					    
					    for (String i : capitalCities.values()) {
					      System.out.println(i);
					    }
					    
					    
					    Map<Integer, String> map1=new HashMap<Integer, String>();  
					    //Adding elements to map  
					    map1.put(1,"Amit");  
					    map1.put(5,"Rahul");  
					    map1.put(2,"Jai");  
					    map1.put(6,"Amit"); 
					    
					    //Traversing Map  
					    Set set=map1.entrySet();//Converting to Set so that we can traverse  
					    Iterator itr=set.iterator();  
					    while(itr.hasNext()){  
					        //Converting to Map.Entry so that we can get key and value separately  
					        Map.Entry entry=(Map.Entry)itr.next();  
					        System.out.println(entry.getKey()+" "+entry.getValue());  

					    }
					    
					    Map<Integer,String> map11=new HashMap<Integer,String>();  
					    map11.put(100,"Amit");  
					    map11.put(101,"Vijay");  
					    map11.put(102,"Rahul"); 
					    
					    System.out.println(map11);
					    
					    map11.replace(100, "pavan");
					    
					    System.out.println(map11);
					    
					    map11.remove(101);
					    
					    //Elements can traverse in any order  
					    for(Map.Entry m:map11.entrySet()){  
					     System.out.println(m.getKey()+" "+m.getValue());  
					    }  
					    
					    
					    
					    Map map4=new HashMap();  
					    //Adding elements to map  
					    map4.put(1,"Amit");  
					    map4.put(5,"Rahul");  
					    map4.put(2,"Jai");  
					    map4.put(6,"Amit");  
					    //Traversing Map  
					    Set set1=map4.entrySet();//Converting to Set so that we can traverse  
					    Iterator itr1=set1.iterator();  
					    while(itr1.hasNext()){  
					        //Converting to Map.Entry so that we can get key and value separately  
					    	System.out.println(itr1.next());
					        Map.Entry entry=(Map.Entry)itr1.next();
					        
					        
					        System.out.println(entry.getKey()+" "+entry.getValue()); 
					        
					    }  
					    
					  
					
			}
		


	

}
