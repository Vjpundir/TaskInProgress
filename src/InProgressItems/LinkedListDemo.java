package InProgressItems;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("jasy");
		list.add("sasy");
		list.addFirst("sandy");
		list.addLast("peter");
		list.add("raghu");
		list.add("mapped");
		list.addFirst("mandy");
		list.addLast("raj");
		System.out.println(list);

		System.out.println("Iterate through each element");

		for (String str : list) {
			System.out.println(str);
		}

	}

}
