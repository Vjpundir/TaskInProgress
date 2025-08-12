package InProgressItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class AugustMonth {

	public static void main(String[] args) {

		Integer[] arr = {2, 1, 4, 2, 6, 5, 6, 4 };
		
		// Change array to Array list

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

		//System.out.println(list);
		
		// Then create one hash Map and get the data in put

		HashMap<Integer, Integer> map = new HashMap<>();
		
		// Run for each loop on list and check below condition

		for (int num : list) {
			
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println(map);

		for (Entry<Integer, Integer> entry : map.entrySet())

		{
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "==>" + entry.getValue());
			}
		}

	}
}
