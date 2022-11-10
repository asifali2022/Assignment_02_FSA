import java.util.Scanner;

public class Q3_BubbleSortAlgorithm {

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
        //bubble sort
        for(int j=0;j<n-1;j++)
        {
        	for(int i=0;i<n-j-1;i++)
        	{
        		if(ar[i]>ar[i+1])
        		{
        			//swapping
        			int temp=ar[i];
        			ar[i]=ar[i+1];
        			ar[i+1]=temp;
        		}
        	}
        }
        //printing sorted array
        for(int i=0;i<n;i++)
        {
        	System.out.print(ar[i]+" ");
        }
	}

	}


