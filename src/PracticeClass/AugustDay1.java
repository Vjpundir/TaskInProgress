package PracticeClass;


public class AugustDay1 {

	public static void main(String[] args) {


		int [] ar = {1,2,4,3,5,4};
		
		int n = ar.length;
		
		int k=3;
		
		if(n<k)
		{
			System.out.println("We cant execute the flow");
			return ;
		}
		
		//compute the sum of first window
		
		int windowsum=0;
		
		for(int i=0;i<k;i++)
		{
			windowsum +=ar[i];
		}
		
		int maxsum =windowsum;
		
		for(int i=k;i<n;i++)
		{
			windowsum= windowsum +ar[i] -ar[i-k];
			
			maxsum=Math.max(maxsum, windowsum);
		}
		
		
		System.out.println(maxsum);
		
		
		

	}

}
