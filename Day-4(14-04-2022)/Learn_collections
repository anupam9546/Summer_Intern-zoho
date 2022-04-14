package zoho.summerintern.day4;

import java.util.*;

public class Learn_collections {
	
	public static void main(String args[])
	{
		System.out.print("Which collection you wanna try : \n1.ArrayList \n2.LinkedList \n3.List Interface \n4.HashSet \n5.LinkedHashSet \n6.TreeSet \n7.PriorityQueue \n8.Map Interface \n9.HashMap \n10.LinkedHashMap \n11.TreeMap \n12.Hashtable \n13.Sorting \n14.Comparable interface \n15.Comparator interface \n16.Properties class \n \n Enter Your input: ");
		Scanner sc = new Scanner(System.in);
		int val=sc.nextInt();
		switch (val)
		{
		case 1:
			Array_List();
			break;
		case 2:
			Linked_List();
			break;
		case 3:
			List_interface();
			break;
		case 4:
			HashSet_class();
			break;
		case 5:
			LinkedHashSet_class();
			break;
		case 6:
			TreeSet_class();
			break;
		case 7:
			PriorityQueue_class();
			break;
		case 8:
			Map_interface();
			break;
		case 9:
			HashMap_class();
			break;
		case 10:
			LinkedHashMap_class();
			break;
		case 11:
			TreeMap_class();
			break;
		case 12:
			Hashtable_class();
			break;
		case 13:
			Sorting();
			break;
		case 14:
			Comparable_interface();
			break;
		case 15:
			Comparator_interface();
			break;
		case 16:
			Properties_class();
			break;
		}
	
	
	}

	private static void Properties_class() {
		System.out.println("\n----------Properties Class-------");
		
	}

	private static void Comparator_interface() {
		// TODO Auto-generated method stub
		
	}

	private static void Comparable_interface() {
		// TODO Auto-generated method stub
		
	}

	private static void Sorting() {
		// TODO Auto-generated method stub
		
	}

	private static void Hashtable_class() {
		// TODO Auto-generated method stub
		
	}

	private static void TreeMap_class() {
		// TODO Auto-generated method stub
		
	}

	private static void LinkedHashMap_class() {
		// TODO Auto-generated method stub
		
	}

	private static void HashMap_class() {
		// TODO Auto-generated method stub
		
	}

	private static void Map_interface() {
		// TODO Auto-generated method stub
		
	}

	private static void PriorityQueue_class() {
		// TODO Auto-generated method stub
		
	}

	private static void TreeSet_class() {
		// TODO Auto-generated method stub
		
	}

	private static void LinkedHashSet_class() {
		// TODO Auto-generated method stub
		
	}

	private static void HashSet_class() {
		// TODO Auto-generated method stub
		
	}

	private static void List_interface() {
		
		
	}

	private static void Linked_List() {
		System.out.println("\n-----Linked_List-----\n");
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Hello");
		linkedlist.add("This is a Linked_List");
		System.out.println("Adding a 1-20 into arraylist");
		for(int i =1;i<=20;i++)
		{
			linkedlist.add(Integer.toString(i));//adding values in linkedlist with loop
		}
		System.out.println("The values in list are : "+linkedlist);
		
		linkedlist.addFirst("Added value at first");
		linkedlist.addLast("Added value at last");
		System.out.println("The updated value in list are : "+linkedlist+"\nSize : "+linkedlist.size());
		
		
		
		
	}

	private static void Array_List() {
		System.out.println("\n-----Array_List-----\n");
		ArrayList<String> list= new ArrayList<String>();//arrayist creatipn
		list.add("Hello");//adding elements
		list.add("I am a ArrayList");
		System.out.println("Adding a 1-20 into arraylist");
		for(int i =1;i<=20;i++)
		{
			list.add(Integer.toString(i));//adding values in arraylist with loop
		}
		Iterator itr= list.iterator();
		while(itr.hasNext()) //iterating throughout the arraylist
		{
			if (itr.next()=="Hello")
			System.out.println("Found hello");
		}
		System.out.println("Full List ----> "+list);//printing list
		System.out.println("\nRemoving some elements ");
		list.removeIf(str-> str.contains("0"));//Using lambda function removing specific values
		System.out.println("After Remove elements containing 0 ");
		System.out.println("List - > "+list+"\nSize = "+list.size());
		
		
	}
	

}
