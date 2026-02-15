import java.util.Scanner;
class Array3
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print(" enter the length :");
		int a =sc.nextInt();
		int ar[]=new int[a];
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("ar"+"["+i+"]"+"=" );
			 ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+ " ");
		}
	}
}