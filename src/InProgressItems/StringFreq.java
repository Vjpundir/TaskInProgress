package InProgressItems;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringFreq {

	public static void main(String[] args) {

		String str = "Vvijayy";

		char[] arr = str.toCharArray();

		System.out.println(arr);

		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : arr) {

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println(map);

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + "==>" + entry.getValue());
			}

		}

		char firstnonrepeating = '\0';
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == 1) {
				firstnonrepeating = arr[i];
				index = i;
				break;

			}

		}

		if (index != -1) {
			System.out.println("firstnonrepeating word: " + firstnonrepeating);
		} else {
			System.out.println("No word");
		}

	}
}
