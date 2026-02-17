import java.util.Scanner;
class Array5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row : ");
		int row = sc.nextInt();
		System.out.print("Enter the cols : ");
		int cols = sc.nextInt();
		String arr[][]= new String[row][cols];
		
		while(true)
		{
			System.out.println("Welcome to Menu Driven");
			System.out.println("1. insert Elements : ");
			System.out.println("2. Display Elements : ");
			System.out.println("3. Exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
				         for(int i=0;i<arr.length;i++)
					     {
							 for(int j=0;j<arr[i].length;j++) 
							 {
							 System.out.print("[" + i + "," + j + "] :");
								 arr[i][j]= sc.nextLine();
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
						     System.out.print(arr[i][j] + " ");
						  }
					  System.out.println("");
					  }
					  break;
				}	  
				
				case 3: 
				{
				      System.out.println("Exit");
					  break;
                }
						  
				default :
				{
				     System.out.println("Invalid Option");
				}
				
					
			}if(choice ==3)
			{
				break;
			}
		}

	}
}
