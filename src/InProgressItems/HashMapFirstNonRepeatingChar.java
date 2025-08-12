package InProgressItems;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapFirstNonRepeatingChar {

	public static void main(String[] args) {

		String input = "swii";

		Character result = nonrepeatingChar(input);

		if (result != null) {
			System.out.println("First non repating char :" + result);
		} else {
			System.out.println("Word is repeating");
		}
	}

	public static Character nonrepeatingChar(String input) {

		Map<Character, Integer> hs = new LinkedHashMap<>();

		for (Character ch : input.toCharArray())

		{
			hs.put(ch, hs.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
			if (entry.getValue()== 1) {
				return entry.getKey();

			}
		}

		return null;
	}

}
