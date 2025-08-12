package InProgressItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class August6 {

	public static void main(String[] args) {
		

	String str = "I love Java programming";
	
	String[] str2= str.split(" ");
	
	//System.out.println(Arrays.toString(str2));
	
	String lastword = str2[str2.length-1];
	
	System.out.println(lastword);
	
	String reverseString =new StringBuilder(lastword).reverse().toString();
	
	System.out.println(reverseString);
	
	str2[str2.length-1] =reverseString;
	
	String output= String.join(" ",str2);
	
	System.out.println(output);
	
	
	
	
			
		
	}

}
