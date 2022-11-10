import java.util.Scanner;

public class Q1_DublicatesInArray {

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
		boolean flag=false;
		System.out.println("Dublicates Numbers:");
	     for(int i=0;i<ar.length-1;i++)  
	     {
	    	 for(int j=i+1;j<ar.length;j++)
	       {
	    	      if(ar[i]==ar[j])
	    	      {
	            System.out.println(ar[j]+" ");
	            flag=true;
	              }
	        }
	     }
	     
	     if(flag==false)
	     {
	    	 System.out.println("Not Found");
	     }
	     
	     }
	    	 
	     
	}


