import java.util.Scanner;
class Array4
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length :");
		int a=sc.nextInt();
		int ar[]=new int[a];
		for(int i=0;i<ar.length;i++)
		{ 
	        System.out.println("insert elements :");
			System.out.print("ar"+"["+i+"]"+ ":");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("displaying the elements :");
			System.out.println(ar[i]+ " ");
		}
		for(int i=0;i<ar.length;i++)
		{
		if(ar[i]%2==0)
		{
			System.out.print("the even no is :");
			System.out.println(ar[i]+ " ");
		}
		else
		{
			System.out.print("the odd no is :");
			System.out.print(ar[i]);
		}
		}
		
	}
}