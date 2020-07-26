package collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<>();
		
		map.put("name", "Pratik Rupnar");
		map.put("email", "pratikrupnar143@gmail.com");
		map.put(null, "kdjifknsii");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		System.out.println(map.get(null));
		

	}

}
