package interviewPreparation;

import java.util.ArrayList;
import java.util.List;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer(" Hello Yes Hello");
		sb.insert(0, "Java");
		
		
		System.out.println(sb.reverse());
		
		List<String> list = new ArrayList<String>();
		
		list.add("Test");
		System.out.println(list);
		list.remove("Test");
		System.out.println(list);

	}

}
