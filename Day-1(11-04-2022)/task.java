package tasksassign;

import java.util.Scanner;

public class task {
	//to add task
	//to view task of specific user
	//to view all task
	
	static String[][] arr1 = new String[10][2];
	
	public static void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String name1=sc.nextLine();
		System.out.println("\n Enter the assigned task : ");
		String task1=sc.nextLine();
		if (arr1[0][0]==null){
			arr1[0][0]=name1;
			arr1[0][1]=task1;
		}
		else
		{
			int check=0;
			for (int i =0;i<10;i++)
			{
				if (arr1[i][0]==name1)
				{
					check=1;
					arr1[i][1]=task1;
					
				}
			}
			if (check==0)
			{
				for(int i =0;i<10;i++)
				{
					if (arr1[i][0]==null)
					{
						arr1[i][0]=name1;
						arr1[i][1]=task1;
						break;
					}
				}
			}
		}
	}
	public static void viewspecific()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a name to check tasks assigned to user: ");
		String name1=sc.nextLine();
		for (int i=0;i<10;i++)
		{
			if (arr1[i][0].equals(name1))
			{
				System.out.println("\nName : "+ arr1[i][0]);
				System.out.println("\nTask assigned : "+arr1[i][1]);
				break;
			}
			
		}System.out.print("\n!!!!  Name not there try adding it first  !!!!!");
		
	}
	public static void viewall()
	{
		
		System.out.print("\n---All Tasks--");
		for(int i =0; i <10;i++)
		{
			if (arr1[i][0]==null)
			{
				break;
			}
			else
			{
				System.out.println("\nName :"+arr1[i][0]);
				System.out.println("Task Assigned :"+arr1[i][1]);
				
			}
		}
	}
	

	public static void main(String[] args)
	{
		arr1[0][0]="Anupam";
		arr1[0][1]="Do somthing";
		arr1[1][0]="Raju";
		arr1[1][1]="Do this";
		boolean done=false;
		do
		{
		System.out.println("\nSelect \n 1.To add task \n 2. To view task of specific user \n 3. To view all tasks\n 4.Exit");
		System.out.print("Enter the Value: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
			switch (a){
			case 1:
				add();
				break;
			case 2:
				viewspecific();
				break;
			case 3:
				viewall();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Please Enter a Valid Input");
			}
		}while(!done);

				
	}
}
