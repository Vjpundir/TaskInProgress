package InProgressItems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateInCollection {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(01, "Sandy");
		map.put(02, "Sandyyy");
		map.put(03, "SamP");
		map.put(01, "SantRam");

		System.out.println(map.entrySet());

		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();

			System.out.println(entry.getKey() + "==>" + entry.getValue());

		}
	}

}
