package InProgressItems;

public class ReplaceSpecialCharacterCode {

	public static void main(String[] args) {

		String str = "_Vijay@#pundi!@*";
		
		str = str.replaceAll("[^A-Za-z0-9]", "");

		System.out.println(str);
	}

}
