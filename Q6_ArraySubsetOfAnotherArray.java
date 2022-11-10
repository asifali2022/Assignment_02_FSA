import java.util.Scanner;

public class Q6_ArraySubsetOfAnotherArray {

	public static void main(String[] args) {
	System.out.println("Enter The size of  First Array ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar1[] = new int[n];
	System.out.println("Enter The Numbers:");
	
	for(int i=0;i<n;i++)
    {
    	ar1[i]=sc.nextInt();
    	
    }
	System.out.println("Enter The size of  Second Array ");
	int m=sc.nextInt();
	int ar2[] = new int[n];
	System.out.println("Enter The Numbers:");
	
	for(int i=0;i<m;i++)
    {
    	ar2[i]=sc.nextInt();
    	
    }
	//
	int i=0;
	int j=0;
	for( i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(ar2[i]==ar1[j])
			{
				break;
			}
		}
	}
	if(j==m)
	{
		System.out.println("ar2 is subset of ar1 ");
	}
	else
	{
		System.out.println("ar2 is  not subset of ar1 ");
	}
	
}
}