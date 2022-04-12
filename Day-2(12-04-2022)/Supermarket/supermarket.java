package com.oops.day2;

import java.util.*;
public class Supermarket {
	
    static String namefromstr(String s) //To get the name of the customer
	{
    	String name="";
    	String[] names=s.split(" ");
    	for(int i=1;i<names.length;i++)
    	{
    		if (names[i].equals("Buys"))
    		{
    			break;			
    		}
    		name=name+names[i]+" ";
    	}
		return name;
	}
    
 public static void main(String args[])
	{
	 
	 HashMap<String,Integer> map=new HashMap<String,Integer>();
	 
	Scanner sc= new Scanner(System.in);
	String Line1=sc.nextLine();
	String items=sc.nextLine();
	String name = namefromstr(Line1);
	System.out.println("Customer : "+name);
	String[] item=items.split(",");
	for (String abc:item)
	{
		String[] k = new String[2];
		k=abc.split(" ");
		k[1]=k[1].replaceAll("[^0-9]", "");
		map.put(k[0],Integer.valueOf(k[1]));
	}
     System.out.println(map);
	}
 
}
