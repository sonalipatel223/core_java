package in.com.API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		
		a.add(678);
		a.add(259);
		a.add(950);
		a.add(371);
		a.add(172);
		System.out.println(a);
	

		
//		List<Integer> evenList = new ArrayList<Integer>();
//		for (Integer i : a) {
//			
//			if (i%2==0) {
//			evenList.add(i);
//		}
//		}
//			System.out.println(evenList);
		

//         Stream<Integer> s = a.stream();
//         List<Integer>newList = s.filter(e-> e%2==0).collect(Collectors.toList());
//         System.out.println(newList);
		
		
		Stream<Integer> s1 = a.stream();
		List<Integer> newList = s1.filter(e-> e>200).collect(Collectors.toList());
		System.out.println(newList);
		
		}
}
			
		


