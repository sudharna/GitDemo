package introduction;



import java.util.ArrayList;

import org.testng.annotations.Test;

public class Streams1 {
    //@Test
	public void regular()
	
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Aash");
		names.add("Sudharna");
		names.add("Abhijeet");
		names.add("Adam");
		names.add("Ram");
		
		int count =0;
		
		for(int i=0;i<names.size();i++)
			
		{
			
			String actual =names.get(i);
			
			if(actual.startsWith("A"))
				
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}
    @Test
    public void streamFilter()
    {
    	
ArrayList<String> names = new ArrayList<String>();
		
		names.add("Aash");
		names.add("Sudharna");
		names.add("Abhijeet");
		names.add("Adam");
		names.add("Ram");
		
		long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
    	
    	
    }

}
