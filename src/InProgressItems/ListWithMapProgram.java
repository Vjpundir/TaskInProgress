package InProgressItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListWithMapProgram {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("vijay", "pundir");
		map.put("sandy", "soam");
		map.put("Agastya", "Singh");

//		System.out.println(map);
//		System.out.println(map.keySet());
//		System.out.println(map.values());

		System.out.println(map.entrySet());

		for (Entry<String, String> entry : map.entrySet()) {
			// System.out.print(entry.getKey()+ " ");
			System.out.println(entry.getValue() + " ");
		}

		List<String> aslist = new ArrayList<>(map.values());

//		System.out.println(aslist);

		System.out.println("Need to convert both the keys and values data from hashmap to Array list");

		List<Map.Entry<String, String>> listt = new ArrayList<>(map.entrySet());

		System.out.println(listt);
		System.out.println(listt.getFirst());
		System.out.println(listt.getLast());
		System.out.println(listt.size());

		for (int i = 0; i < listt.size(); i++) {
			System.out.println(listt.get(i));
		}

	}

}
