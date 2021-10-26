import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Practice {
  public static void main(String[] args) throws Exception
  {
	  File fi= new File("C:/Users/rajaa/OneDrive/Desktop/try1.txt");
	  HashMap<String,Integer> hm= new HashMap<String,Integer>();
	  Scanner sc= new Scanner(fi);
	  while(sc.hasNextLine())
	  {
		  String key= sc.nextLine();		  
		  if(hm.containsKey(key))
			  hm.put(key, hm.get(key)+1);
		  else
			  hm.put(key, 1);
	  }
	  for(String ke: hm.keySet())
	  {
		  System.out.println(ke+"  "+hm.get(ke));
	  }
  }
}
