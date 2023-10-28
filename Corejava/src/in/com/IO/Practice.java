package in.com.IO;

import java.util.List;
import java.util.stream.Collectors;

public class Practice {
	

	
	public static void main(String[] args) {
		List<String>name = List.of("ram","rahul","rohit","bhavna","sonali");
		
		
		List<String>newname = name.stream().filter(e->e.startsWith("r")).collect(Collectors.toList());
		System.out.println(newname);
		
	
List<Integer>num1 = List.of(1,2,3,4,3,2,6,7,4,3,2);
List<Integer>newnum = num1.stream().distinct().collect(Collectors.toList());
System.out.println(newnum);

List<Integer>num2 = List.of(1,2,3,4,5,6,7,8,9);
List<Integer>Squre = num2.stream().map(i->i*i).collect( Collectors.toList());
System.out.println(Squre);



}
}