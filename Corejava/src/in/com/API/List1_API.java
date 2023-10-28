package in.com.API;

import java.util.List;
import java.util.stream.Collectors;

public class List1_API {
	public static void main(String[] args) {
		List<String>name = List.of("sonali","shivani","sona","bhavna","monika");
		
		List<String> newname = name.stream().filter(e-> e.startsWith("s")).collect(Collectors.toList());
		
		System.out.println(newname);
		
		List<Integer>num1 = List.of(1,2,3,1,3,5,7,8,4,5,3);
		
		List<Integer>name1 = num1.stream().distinct().collect(Collectors.toList());
		System.out.println(name1);
		
		List<Integer> num = List.of(1,2,3,4,5);
		List<Integer>square = num.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(square);
		
		
		
		
		
		
	}
	

}
