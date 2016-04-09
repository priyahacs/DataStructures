import java.util.*;
public class anagram {


static boolean isAnagram(String A, String B) {
    //Complete the function
     if (A.length() != B.length())
         {
          return false;
     }
     String term = ""+A.toLowerCase();
     String C = ""+A.toLowerCase();
     String D = "" + B.toLowerCase();
     
     for (int i = 0;i< term.length()&&C.length()>0&&D.length()>0;i++)
      {
         String cur = "" + term.charAt(i);
         if(C.indexOf(cur) != -1)
         {
        	 C =  C.replaceFirst(cur,"");
         }
         if(D.indexOf(cur) != -1)
         {
        	 D =  D.replaceFirst(cur,"");
         }
     }
     if(C.length() == 0 && D.length() == 0)
     {
    	 return true; 
     }
     
     return false;
 
 }
  public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      String A=sc.next();
      String B=sc.next();
      boolean ret=isAnagram(A,B);
      if(ret)System.out.println("Anagrams");
      else System.out.println("Not Anagrams");
      
  }
}