import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class comparisons {

	
	@Test
	public void integersarray()
	{
		List<Integer> values = Arrays.asList(3, 2, 2, 5, 6, 9, 11, 11, 13);
		  values.stream().distinct().filter(s-> s.equals(2)).sorted().collect(Collectors.toList());
		//values.stream().distinct().sorted().collect(Collectors.toList());
		//System.out.println(values.get(3));
	}
}
