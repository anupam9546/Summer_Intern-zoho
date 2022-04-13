package com.day3;

import java.util.*;


public class arrayqn 
{
	public static void main(String args[])
	{
		ArrayList<Integer> arr_int= new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values of array : ");
		String array_values=sc.nextLine();
		String[] arr=array_values.split(",");
		for (int i=0;i<arr.length;i++)
		{
			arr_int.add(Integer.parseInt(arr[i]));
		}
		System.out.print("Target : ");
		int target=sc.nextInt();
		for (int i=0;i<arr_int.size();i++)
		{
			for(int j=1;j<arr_int.size();j++)
			{
				if (arr_int.get(i)+arr_int.get(j)==target)
				{
					System.out.println("Index is "+i+","+j);
					
				}
			}
		}
	}
}
