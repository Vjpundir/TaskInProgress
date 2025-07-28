package InProgressItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Joe", "Peter");
		map.put("Sandy", "Raghu");
		map.put("Yash", "Sidhu");

		System.out.println(map);

		for (Entry<String, String> entry : map.entrySet()) {
			String str = entry.getKey();

			System.out.print(str);
			String values = entry.getValue();
			System.out.println(values);
		}

		System.out.println("Hash Map changed to arrayList collection");

		List<String> lists = new ArrayList<>(map.keySet());

		{
			System.out.println(lists);
		}
		
		System.out.println("Hash Map now changed to set collection");
		
		Set<String> hs = new HashSet<>(map.values());
		{
			System.out.println(hs);
		}

	}

}
