package array1;
import java.util.Scanner;

public class ar {
	
	public static void main(String[] args)   
	{  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Start entering the elements : ");
	String str="";
	for(int i=0;;i++)
	{
		int a=sc.nextInt();
		if (a!=-1)
		{
			String s=Integer.toString(a);
			str=str+s+" ";
		}
		else
			break;
	}
	String[] s= str.split(" ");
	System.out.print("\nInteger array : [");
    for (int i = 0; i < s.length; i++) {
        System.out.print(s[i] + " ");
    }
    System.out.print("]");
	System.out.println("\nThe Size of the array is :"+s.length);
	}
}


