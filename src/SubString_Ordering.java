import java.io.*;
import java.util.*;
import java.util.regex.*;
public class SubString_Ordering {
	public static void main(String[] args){
		   Scanner s1 = new Scanner(System.in);
		   System.out.print("Please enter a string:");
	       String input =  s1.next();
	       System.out.print("Please enter substring length:");
	       Scanner s2 = new Scanner(System.in);
	       
	       int k = s2.nextInt();
	       String min = input.substring(0,k);
	       String max = input.substring(0,k);
	       for (int i=0;i+k<=input.length();i++){
	    	   String s = input.substring(i,i+k);
	    	   if(s.compareTo(min) < 0){
	    		   min = s;
	    	   }
	    	   if (s.compareTo(max) > 0)
	    	   {
	    		   max = s;
	    	   }
	       }
	       System.out.println(min);
	       System.out.println(max);
	       
	}
}
