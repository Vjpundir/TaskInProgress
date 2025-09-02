package InProgressItems;

import java.util.*;

public class MethodCreate {

	int[] ar = { 3, 2, 5, 7, 9, 1, 1, 3, 3 };

	public Map<Integer, Integer> numberCount(int[] arr)

	{
		Map<Integer, Integer> map = new HashMap<>();

		for (int x : arr) {
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
		}

		// System.out.println(map);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				// System.out.println(entry.getKey()+"=="+ entry.getValue());
			}
		}
		return map;
	}

	public static void main(String[] args) {

		MethodCreate m = new MethodCreate();
	
		System.out.println(m.numberCount(m.ar));

	}
}
