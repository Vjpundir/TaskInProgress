package InProgressItems;

public class WindowSlidingProgram {
	
	// Reverse the string with preserve space 

	 public static void main(String[] args) {

		String str = "  ab c de  ";

		char[] ch = str.toCharArray();

		int l = 0;
		int r = str.length() - 1;
		
		while (l < r) {
			if (ch[l] == ' ') {
				l++;
			} else if (ch[r] == ' ') {
				r--;
			} else {
				char temp = ch[l];
				ch[l] = ch[r];
				ch[r] = temp;
				l++;
				r--;
			}
		}
		// System.out.println(Arrays.toString(ch));
		System.out.println(new String(ch));

	}

}
