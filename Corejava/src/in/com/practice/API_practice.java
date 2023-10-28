package in.com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class API_practice {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		
		a.add(678);
		a.add(351);
		a.add(234);
		a.add(123);
		
		System.out.println(a);
		
//		List<Integer> evenlist = new ArrayList<Integer>();
//		for (Integer i: a) {
//			if (i%2==0) {
//				evenlist.add(i);
// }
	//	}
		//System.out.println(evenlist);
		
		
//		Stream<Integer> s = a.stream();
//		List<Integer> newlist = s.filter(e-> e%2==0).collect(Collectors.toList());
//		System.out.println(newlist);
//		
		
		Stream<Integer> p = a.stream();
		List<Integer> list = p.filter(e-> e>300).collect(Collectors.toList());
		System.out.println(list);
		
		
		
		
		
	}

}
