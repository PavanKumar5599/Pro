package practice_package;

import java.util.StringTokenizer;

public class Sample {
		public static void main(String[] args) {
			String st="the man can solve any problem";
//			StringTokenizer tok=new StringTokenizer(st);
//			System.out.println(tok.countTokens());
//			
//			int countwo=st.split("\\s").length;
//			System.out.println(countwo);
			
			int c=0;
			for(int i=0;i<st.length();i++) {
				   if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u') {    
		                //Increments the vowel counter    
		                c++;    
				   }
		}
			System.out.println(c);
			
			String str="madam";
			String rev="";
			int strlen=str.length();
			
			//reverse the string
			for(int i=(strlen-1);i>=0;--i) {
				rev=rev+str.charAt(i);
			}
			if(str.equals(rev)) {
				System.out.println("yes");
				
			}
			else {
				System.out.println("no");
			}
			
			int num=4554;
			int reversed=0;
			 // run loop until num becomes 0
		    while(num != 0) {
		    
		      // get last digit from num
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      num /= 10;
		    }
		    

		}
	}
