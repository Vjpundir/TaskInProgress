package InProgressItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMerge {

	public static void main(String[] args) {

Integer[]  a = {2,3,5};
Integer [] b = {5,7,8,1,2};


List<Integer> ls1 = Arrays.asList(a);
List<Integer> ls2 = Arrays.asList(b);

List<Integer> as1= new ArrayList<>(ls1);

as1.addAll(ls2);

System.out.println(as1);

Collections.sort(as1);

System.out.println(as1);



	}

}
