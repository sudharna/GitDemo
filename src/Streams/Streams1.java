package Streams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams1 {
   // @Test
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
    
    //@Test
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
		
		//print all the names of Arraylist
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
    	
    	
    }

    //@Test
    
    public void streamMap()

    
    {   
ArrayList<String> names = new ArrayList<String>();
		
		names.add("Aash");
		names.add("Sudharna");
		names.add("Abhijeet");
		names.add("Adam");
		names.add("Ram");
    	
    	
    	//print names which have last letter as a with uppercase
    	Stream.of("Aashritha","Sudharna","Abhijeet","Navya","Sonu").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    	
    	
    	//print names which have first letter as a with uppercase and sorted
    	
    	List<String> names1 =  Arrays.asList("Azshritha","Sudharna","Abhijeet","Navya","Sonu");
    	names1.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));;
    	
    	
    	//Merging 2 different lists
    	Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
    	//newStream.sorted().forEach(s->System.out.println(s));
    	
    	boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("adam"));
    	
    	Assert.assertTrue(flag);
    	
    }

    
    @Test
    
    public void streamcollect()
    
    {
    	List<String> ls = Stream.of("Aashritha","Sudharna","Abhijeet","Navya","Sonu").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
    	
    	System.out.println(ls.get(0));
    	
    	
    	//print unique number from this array
    	//sort the array
    	List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
    	values.stream().distinct().sorted().forEach(s->System.out.println(s));
    	
    }
    
}
