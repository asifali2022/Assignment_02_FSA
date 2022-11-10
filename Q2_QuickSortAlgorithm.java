import java.util.Scanner;

public class Q2_QuickSortAlgorithm {
	
	
	private static int  partition(int[] ar, int low, int high) 
	{
		int pivot=ar[high];
		int i=low-1;
		
		for(int j=low;j<high;j++)
		{
			if(ar[j]<pivot)
			{
				i++;
				//swap
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		i++;
		int temp=ar[i];
		ar[i]=pivot;
		ar[high]=temp;
		return i;//pivot index
		
	}
	
	public static void QuickSort(int ar[],int low,int high)
	{
		if(low<high)
		{
			int pindx=partition(ar,low,high);
			QuickSort(ar,low,pindx-1);
			QuickSort(ar,pindx+1,high);
		}
		
	}

	

	public static void main(String[] args) 
	{
		System.out.println("Enter The size of Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter The Numbers:");
		for(int i=0;i<n;i++)
        {
        	ar[i]=sc.nextInt();
        }
        QuickSort(ar,0,n-1);
        for(int i=0;i<n;i++)
        {
        	System.out.print(ar[i]+" ");
        }
        System.out.println();
	}

}
