package in.com.ListAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice_Even {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		list.add(501);
		list.add(550);
		list.add(563);
		list.add(700);
		list.add(508);
		list.add(400);
		list.add(590);
		System.out.println(list);
		
//         List <Integer>evenList = new ArrayList<Integer>();
//		for (Integer i : list) {
//			if (i%2==0) {
//				evenList.add(i);
//				}
//			}
//		System.out.println(evenList);

//		Stream<Integer> s = list.stream();
//		List<Integer>newlist  = s.filter(e-> e%2==0).collect(Collectors.toList());
//		System.out.println(newlist);
//		}
//	}
		Stream<Integer>s1 = list.stream();
		List<Integer> newlist = s1.filter(e-> e>500).collect(Collectors.toList());
		System.out.println(newlist);
	}
}
