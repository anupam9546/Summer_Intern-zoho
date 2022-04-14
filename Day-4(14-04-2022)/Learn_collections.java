package zoho.summerintern.day4;

import java.util.*;

public class Learn_collections {
	
	public static void main(String args[])
	{
		System.out.print("Which collection you wanna try :\n0. Stack \n1.ArrayList \n2.LinkedList \n3.List Interface \n4.HashSet \n5.LinkedHashSet \n6.TreeSet \n7.PriorityQueue \n8.Map Interface \n9.HashMap \n10.LinkedHashMap \n11.TreeMap \n12.Hashtable \n13.Sorting \n14.Comparable interface \n15.Comparator interface \n16.Properties class \n \n Enter Your input: ");
		Scanner sc = new Scanner(System.in);
		int val=sc.nextInt();
		switch (val)
		{
		case 0:
			Stack_c();
			break;
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

	private static void Stack_c() {
		// TODO Auto-generated method stub
		Stack<String> animals = new Stack<>();
		animals.push("Lions");
		animals.push("dog");
		animals.push("horse");
		animals.push("cat");
		
		System.out.println("Stack : "+animals);
		//top most element
		System.out.println("Top element "+animals.peek());
		animals.pop();
		//after pop
		System.out.println("After pop "+ animals);		
		
		/*
		 * for queue we can use offer poll and peek 
		 * add, offer, element , peek , remove
		 * , poll
		 */
	}

	private static void Properties_class() {
		System.out.println("\n----------Properties Class-------");
		
	}

	private static void Comparator_interface() {
		// TODO Auto-generated method stub
		System.out.println("\n-----Comparator_interface-----\n");
	}

	private static void Comparable_interface() {
		// TODO Auto-generated method stub
		System.out.println("\n-----Comparable_interface-----\n");
	}

	private static void Sorting() {
		// TODO Auto-generated method stub
		System.out.println("\n-----Sorting-----\n");
	}

	private static void Hashtable_class() {
		// TODO Auto-generated method stub
		System.out.println("\n-----Hashtable_class-----\n");
	}

	private static void TreeMap_class() {
		// TODO Auto-generated method stub
		
	}

	private static void LinkedHashMap_class() {
		// TODO Auto-generated method stub
		System.out.println("\n-----LinkedHashMap_class-----\n");
	}

	private static void HashMap_class() {
		// TODO Auto-generated method stub
		System.out.println("\n-----HashMap_class-----\n");
	}

	private static void Map_interface() {
		// TODO Auto-generated method stub
		System.out.println("\n-----Map_interface-----\n");
	}

	private static void PriorityQueue_class() {
		// TODO Auto-generated method stub
		System.out.println("\n-----PriorityQueue_class-----\n");
		
		PriorityQueue<Integer> pq =  new PriorityQueue<>();
		System.out.println("Adding 4 random values in PQ");
		pq.offer(10);
		pq.offer(40);
		pq.offer(6);
		pq.offer(70);
		System.out.println(pq);
		System.out.println("This printed in a asc order beacuse of hidden min heap implemention");
		//poll out the first in the queue to come out
		pq.poll();
		System.out.println(pq.peek());
		  
		 
		
		
	}

	private static void TreeSet_class() {
		// TODO Auto-generated method stub
		System.out.println("\n-----TreeSet_class-----\n");
		Set<Integer> set = new TreeSet<>();
		//runs on binary tree with sorted ord 
		//all opertions on O(log(n))
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		//rest opertaions are same just it will store values in a sorted tree 
		System.out.println(set);
		System.out.println("Check if 21 is present in the set "+ set.contains(21));
		System.out.println("Check if the set is empty "+ set.isEmpty());
		System.out.println("print the size of the set "+ set.size());

		
	}

	private static void LinkedHashSet_class() {
		// TODO Auto-generated method stub
		System.out.println("\n-----LinkedHashSet_class-----\n");
		Set<Integer> set= new LinkedHashSet<>();
		
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		
		System.out.println(set);
		System.out.println("Check if 21 is present in the set "+ set.contains(21));
		System.out.println("Check if the set is empty "+ set.isEmpty());
		System.out.println("print the size of the set "+ set.size());
	}

	private static void HashSet_class() {
		System.out.println("\n-----HashSet_class-----\n");
		Set<Integer> set= new HashSet<>();
		
		//all operation in O(n)
		
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		
		System.out.println(set);
		System.out.println("Check if 21 is present in the set "+ set.contains(21));
		System.out.println("Check if the set is empty "+ set.isEmpty());
		System.out.println("print the size of the set "+ set.size());
		
		
		
		
		
	}

	private static void List_interface() {
		System.out.println("\n-----List_interface-----\n");
		List<Integer> list=new ArrayList<>();
		System.out.println("Adding elements");
		list.add(10);
		list.add(20);
		list.add(40);
		System.out.println(list);
		//changing one value
		
		list.set(2, 1000);
		System.out.println("Updated list "+list);
		
		for(Integer i:list)
		{
			
			System.out.println(i);//using for loop
		}
		//using iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println("Iterator value : "+it.next());
		}
		
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
		
//		size increment -> n -> n+n/2 +1 
		
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
