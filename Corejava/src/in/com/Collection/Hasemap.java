package in.com.Collection;

import java.util.HashMap;
import java.util.Map;

public class Hasemap {
	public static void main(String[] args) {
		Map<String, Integer> num = new HashMap<String, Integer>();
		
		num.put("two", 4);
		num.put("five", 3);
		num.put("six", 8);
		num.put("two", 2);
		
		System.out.println(num);
		
		System.out.println(num.containsKey("five"));
		System.out.println(num.containsValue(8));
		System.out.println(num.isEmpty());
		System.out.println(num.entrySet());
		System.out.println(num.get("two"));
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.size());
		System.out.println(num.put("six", 8));
	}

}
