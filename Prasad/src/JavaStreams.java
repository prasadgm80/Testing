import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreams {
	
	/*
	@Test
	public void regular()
	{
	ArrayList<String> names = new ArrayList<String>();
	names.add("Abhijeet");
	names.add("Akshay");
	names.add("Ram");
	names.add("Avinash");
	names.add("Neha");
	
	int Count = 0;
	for (int i=0; i<names.size(); i++)
	{
		String actual = names.get(i);
		if(actual.startsWith("A"))
			{
			Count++;
			}
	}
System.out.println(Count);
}
	
	@Test
	
	public void StreamFilter()
	{
	ArrayList<String> names = new ArrayList<String>();
	names.add("Balu");
	names.add("Atul");
	names.add("Vicky");
	names.add("Amol");
	names.add("Amit");
	
	Long c = names.stream().filter(s-> s.startsWith("A")).count();
	System.out.println(c);
	
//	Stream.of("Abhijeet", "Akshay", "Ram", "Avinash", "Neha").filter(s-> s.startsWith("A"));
//	names.stream().filter(s-> s.length()>4).forEach(s->System.out.println(s));
	names.stream().filter(s-> s.length()>4).limit(1).forEach(s->System.out.println(s));
	Stream.of("Abhijeet", "Akshay", "Ram", "Avinash", "Neha").filter(s-> s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	List<String> nouns = Arrays.asList("Abhijeet", "Akshay", "Ram", "Avinash", "Neha");
	
	nouns.stream().filter(s-> s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	// combining string names and nouns
	
	Stream<String> newStream  =Stream.concat(names.stream(), nouns.stream());
	//newStream.sorted().forEach(s-> System.out.println(s));
	
	boolean flag = newStream.anyMatch(s-> s.equalsIgnoreCase("Adam"));
	//Assert.assertTrue(flag);
	
	}
	
	@Test
	
	public void streamCollection()
	{
		List<String> collect =Stream.of("Abhijeet", "Akshay", "Ram", "Avinash", "Neha").filter(s-> s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(collect.get(0));
	}
	*/
	
	@Test
	public void integersarray()
	{
		List<Integer> values = Arrays.asList(3, 2, 2, 5, 6, 9, 11, 11, 13);
		values.stream().distinct().sorted().forEach(s-> System.out.println(s));
		values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(values.get(3));
		//values.forEach(s-> s.);
	}
	
	
	
}