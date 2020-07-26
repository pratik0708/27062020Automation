package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface2 {

	public static void main(String[] args) {
		
		//1 Pratik
		//2 Aniket
		//3 Anand
		
		Map<Integer , String> std= new HashMap<>();
		
		std.put(1,  "Pratik");
		std.put(2,  "Aniket");
		std.put(3,  "Anand");
		
		//System.out.println(std.get(2));
		
		Set<Integer> set= std.keySet();
		
		for(int key:set)
		{
			System.out.println(std.get(key));
			
		}
		

	}

}
