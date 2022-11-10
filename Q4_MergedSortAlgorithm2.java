import java.util.Scanner;

public class Q4_MergedSortAlgorithm2 {

	
public static void conquer(int[] ar, int si, int mid, int li) {
		
		int [] merged= new int[li-si+1];
		
		int indx1=si;
		int indx2=mid+1;
		int x=0;
		while(indx1<=mid && indx2<=li)
		{
			if(ar[indx1]<=ar[indx2])
			{
				merged[x]=ar[indx1];
				x++;indx1++;
			}
			else
			{
				merged[x]=ar[indx2];
				x++;indx2++;
			}
		}
			while(indx1<=mid)
			{
			 merged[x]=ar[indx1];
			 x++;indx1++;
			}
			while( indx2<=li)
			{
					merged[x]=ar[indx2];
					x++;indx2++;
				}
			
			for(int i=0, j=si;i<merged.length;i++,j++)
			{
				ar[j]=merged[i];
			}
		}
      public static void Divide(int ar[],int si,int li) {
	   if(si>=li)
	   {
		   return;
	   }
		
		int mid=si+(li-si)/2;
		Divide (ar,si,mid);
		Divide(ar,mid+1,li);
		conquer(ar,si,mid,li);
	}

	
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
        Divide(ar,0,n-1);
        for(int i=0;i<n;i++)
        {
        	System.out.print(ar[i]+" ");
        	
        }
        System.out.println();
	}
}

