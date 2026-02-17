import java.util.Scanner;
class Array6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the row : ");
		int row = sc.nextInt();
		
		System.out.print("Enter the row : ");
		int cols = sc.nextInt();
		
		char arr[][] = new char[row][cols];
		
		while(true)
		{
			System.out.println("Welcome to menu driven");
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("Exit");
			System.out.println("Enter Your choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				
				case 1:
				{
				       for(int i=0;i<arr.length;i++)
					   {
						   for(int j=0;j<arr[i].length;j++)
						   {
							   System.out.print("["+i+"],"+"["+j+"]" +":");
							   arr[i][j] = sc.next().charAt(0);
						   }
					   }
					   break;
				}
				case 2:
				{
					for(int i=0;i<arr.length;i++)
					{
						for(int j=0;j<arr[i].length;j++)
						{
							System.out.print(arr[i][j]+ " ");
						}
						System.out.println("");
					}
				}
				break;
				
				
				case 3:
				{
					System.out.println("Exit");
				}
				break;
				
				default :
				{
					System.out.println("Invalid Option");
				}
				
				if(choice==3)
				{
					break;
				}
				
			}
		}
	}
}