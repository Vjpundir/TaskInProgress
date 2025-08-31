package InProgressItems;

public class BubbleSortArray {

	public static void main(String[] args) {

		//Bubble sort program by QA Team 

		int[] ar = {2,5,9,1,0,33,22,11};
		
		int n =ar.length;
		
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j] =ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		
		for(int x:ar)
		{
			System.out.print(x +" ");
		}

	}

}
