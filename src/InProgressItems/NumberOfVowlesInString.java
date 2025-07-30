package InProgressItems;

public class NumberOfVowlesInString {

	public static void main(String[] args) {

		String input = "Viijay PundirAA kumar";

		int count = 0;
		String vfound = "";

		for (int i = 0; i < input.length(); i++) {

			char str = Character.toLowerCase(input.charAt(i));
			{
				if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u') {
					count++;
					vfound += str + " ";

				}
			}

		}

		System.out.println(count);

		System.out.println("Actual vowels in string is :" + vfound);

	}

}
