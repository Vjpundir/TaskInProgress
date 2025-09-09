package InProgressItems;

public class PalindromeCheck {

	public static void main(String[] args) {

		String str = "madam";

		char[] ch = str.toCharArray();

		int l = 0;
		int r = ch.length - 1;

		boolean found = true;

		while (l < r) {
			if (ch[l] != ch[r]) {
				found = false;
				break;
			}

			l++;
			r--;

		}

		if (found) {
			System.out.println("String is palindrome");
		}

		else {
			System.out.println("String is not palindrome");

		}

	}

}
