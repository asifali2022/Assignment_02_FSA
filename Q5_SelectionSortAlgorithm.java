import java.util.Scanner;

public class Q5_SelectionSortAlgorithm {

	public static void main(String[] args) {
		System.out.println("Enter The size of Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter The Numbers:");
		for(int i=0;i<n;i++)
        {
        	ar[i]=sc.nextInt();
        }
		//SelectionSort
		for(int i=0;i<n-1;i++)
		{
			int smallest =i;
			for(int j=i+1;j<n;j++)
			{
				if(ar[smallest]>ar[j])
				{
					smallest=j;
				}
			}
			int temp=ar[smallest];
			ar[smallest]=ar[i];
			ar[i]=temp;
		}
		//printing sorted array
        for(int i=0;i<n;i++)
        {
        	System.out.print(ar[i]+" ");
        }
	}

}
