package file_handling;
import java.io.*;
import java.util.*;
public class count_words {

	public static void main(String[] args)
	{
	
		
		HashMap <String, Integer> hq = new HashMap<String,Integer>();
		String line = null;
	
		try{
			//System.out.println("Working Directory = " +
		              //System.getProperty("user.dir"));
		BufferedReader br = new BufferedReader
				(new FileReader("/Users/Preethi/Documents/java_coding/Java-Experiments!"
						+ "/src/file_handling/sample.txt"));
			
	        //System.out.println("Enter the sentence");
			
		while((line = br.readLine()) !=null)
		{	//System.out.println(" "+line.length());
			String [] words = line.split(" ");
			for(String word : words)
			{
				if(hq.containsKey(word))
				{
					int c = hq.get(word);
					hq.put(word, c+1);
				}
				else
				{
					hq.put(word,1);
				}
			}
		}
		
		//Iterator iq = hq.iterator();
		for (String key : hq.keySet()) {
		    System.out.println(key + ": " + hq.get(key));
		}
		
		
		
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
