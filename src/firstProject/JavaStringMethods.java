package firstProject;

public class JavaStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java String class charAt() : method returns a char value at the given index number.
		String name="javatpoint";  
		char ch=name.charAt(4);//returns the char value at the 4th index
		System.out.println(ch);
		
		//Java String class compareTo(): method compares the given string with the current string lexicographically.
		//if s1 > s2, it returns positive number  
		//if s1 < s2, it returns negative number  
		//if s1 == s2, it returns 0
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f" 
		
		
		//Java String class concat(): method combines specified string at the end of this string. It returns a combined string. 
		//It is like appending another string.
		String con="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		con.concat("is immutable");    
		System.out.println(con);    
		con=con.concat(" is immutable so assign it explicitly");    
		System.out.println(con);  
		
		//Java String contains()
//		Parameter
//		sequence : specifies the sequence of characters to be searched.
//		Returns:   true if the sequence of char value exists, otherwise false.
		
		String name_con="what do you know about me";  
		System.out.println(name_con.contains("do you know"));  
		System.out.println(name_con.contains("about"));  
		System.out.println(name_con.contains("hello"));  
		
		
		//Java String toUpperCase() and toLowerCase() method
//The Java String toUpperCase() method converts this String into uppercase letter and String toLowerCase() method into lowercase letter
		
		String s="Sachin";    
		System.out.println(s.toUpperCase());//SACHIN    
		System.out.println(s.toLowerCase());//sachin    
		System.out.println(s);//Sachin(no change in original)   
		
		//Java String trim() method:
		//The String class trim() method eliminates white spaces before and after the String
		
		String t_s="  Sachin  ";    
		System.out.println(t_s);//  Sachin      
		System.out.println(t_s.trim());//Sachin 
		
		//Java String startsWith() and endsWith() method:
		//The method startsWith() checks whether the String starts with the letters passed as arguments and
		//endsWith() method checks whether the String ends with the letters passed as arguments.
		
		 String u_l="Sachin";    
		 System.out.println(u_l.startsWith("Sa"));//true    
		 System.out.println(u_l.endsWith("n"));//true    
		
		//Java String length() Method:
		 //The String class length() method returns length of the specified String.
		 
		 String s_l="Sachin";    
		 System.out.println(s_l.length());//6    
		
		 
		 //Java String equals(): If any character is not matched, it returns false. If all characters are matched, it returns true.
		
		 String s_eq="pavankumar";  
		 String s_eq1="pavankumar";  
		 String s_eq2="PAVANKUMAR";  
		 String s_eq3="python";  
		 System.out.println(s_eq.equals(s_eq1));//true because content and case is same  
		 System.out.println(s_eq.equals(s_eq2));//false because case is not same  
		 System.out.println(s_eq.equals(s_eq3));//false because content is not same  
		 
		 //Java String equalsIgnoreCase():
		 //it is just like the equals() method but doesn't check the case sensitivity.
		 //If any character is not matched, it returns false, else returns true.
		 
		 System.out.println(s_eq.equalsIgnoreCase(s_eq1));//true because content and case both are same  
		 System.out.println(s_eq.equalsIgnoreCase(s_eq2));//true because case is ignored  
		 System.out.println(s_eq.equalsIgnoreCase(s_eq3));//false because content is not same  
		 
		 //Java String isEmpty(): true if length is 0 otherwise false.
		 
		 String s_emp="";  
		 String s2_emp="javatpoint";  
		   
		 System.out.println(s_emp.isEmpty());  //true
		 System.out.println(s2_emp.isEmpty());//false
		 
		 //Java String replace():
		 //method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		 
		 String s1_rep="javatpoint is a very good website";  
		 String replaceString=s1_rep.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		 System.out.println(replaceString);  
		 
		 //Java String substring():  method returns a part of the string.
		 
		 String s1_sub="javatpoint";  
		 System.out.println(s1_sub.substring(2,4));//returns va  
		 System.out.println(s1_sub.substring(2));//returns vatpoint 
		 
		 //Java String split():
		 //method splits this string against given regular expression and returns a char array.
		 
		 String s1_spl="java string split method by javatpoint";  
		 String[] words=s1_spl.split("\\s");//splits the string based on whitespace  
		 //using java foreach loop to print elements of string array  
		 for(String w:words){  
		 System.out.println(w);  
		 }
		 
		 String s0="With dozens of templates, reports, and best practices, Jira Software makes it easy for agile teams to be successful within our products and beyond. Out-of-the-box scrum and kanban templates give your team full visibility into what’s next so you can continuously deliver maximum output in minimal cycle time.";
		 System.out.println(s0.replace("a","pav"));

	}

}
