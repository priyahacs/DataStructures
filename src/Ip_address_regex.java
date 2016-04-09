
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Ip_address_regex{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}

class myRegex
{

	String pattern = "^([0-1]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([0-1]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
	                 +"([0-1]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([0-1]?\\d\\d?|2[0-4]\\d|25[0-5])$";
			
}
