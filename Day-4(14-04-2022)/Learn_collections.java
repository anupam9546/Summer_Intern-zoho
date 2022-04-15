package zoho.summerintern.day4;

import java.util.*;

public class Learn_collections {
	
	public static void main(String args[])
	{
		System.out.print("Which collection you wanna try :\n0. Stack \n1.ArrayList \n.2.Arrays \n3.LinkedList "
				+ "\n4.List Interface \n5.HashSet \n6.LinkedHashSet \n7.TreeSet \n8.PriorityQueue"
				+ " \n9.HashMap  \n10.TreeMap \n11.Hashtable \n12.Sorting \n13.Comparable interface "
				+ "\n14.Comparator interface \n15.Basic_collection_operations \n \n Enter Your input: ");
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
			Arrays();
			break;
		case 3:
			Linked_List();
			break;
		case 4:
			List_interface();
			break;
		case 5:
			HashSet_class();
			break;
		case 6:
			LinkedHashSet_class();
			break;
		case 7:
			TreeSet_class();
			break;
		case 8:
			PriorityQueue_class();
			break;
		
		case 9:
			HashMap_class();
			break;
		case 10:
			TreeMap_class();
			break;
		case 11:
			Hashtable_class();
			break;
		case 12:
			Sorting();
			break;
		case 13:
			Comparable_interface();
			break;
		case 14:
			Comparator_interface();
			break;
		case 15:
			Basic_collection_operations();
			
		}
	
	
	}

	private static void Basic_collection_operations() {
		// TODO Auto-generated method stub
		System.out.println("\n-----Basic_collection_operations-----\n");
		List<Integer> list=new ArrayList<>();
		System.out.println("Adding elements");
		list.add(30);
		list.add(9);
		list.add(20);
		list.add(23);
		list.add(53);
		list.add(9);
		
		System.out.println("The minimum value in a araylist : "+Collections.min(list));
		System.out.println("The maximum value in a araylist : "+Collections.max(list));
		System.out.println("The Frequency of a value in a araylist : "+Collections.frequency(list,9));
		System.out.println("The minimum value in a araylist : "+Collections.min(list));
		Collections.sort(list);
		System.out.println("Sorting :"+list);
		
		
	}

	private static void Arrays() {
		// TODO Auto-generated method stub
		System.out.println("\n-----Arrays-----\n");
		int[] nums = {1,2,3,4,5,6,7,8};
		System.out.println("1st Array: "+Arrays.toString(nums));
		int index =  Arrays.binarySearch(nums, 4);//checking if the value is present
		System.out.println("The index of the element 4 in the array is "+ index);
		//to sort(using quick slot)
		Integer[] numbs = {10,2,35,1,3,6,22,6,7,42};
		//printing before sorting
		System.out.println("Array before sorting : "+Arrays.toString(numbs));
		
		Arrays.sort(numbs);
		//iterating after sorting
		for (int i : numbs)
		{
			System.out.println(i+" ");
		}		
	}

	private static void Stack_c() {
		// TODO Auto-generated method stub
		System.out.println("\n-----Stack_c-----\n");
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
		
		System.out.println("\n-----TreeMap_class-----\n");
		
		Map<String , Integer> numbers =  new TreeMap<String,Integer>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		//If we put again the map will get override and the values will get updated
		if (!numbers.containsKey("Two"))
		{
			numbers.put("Two", 23);//to check and append value
		}
		numbers.putIfAbsent("Absent", 12);//to check if key value is absent in the map 
		
		// for iteration
		
		for(Map.Entry<String, Integer> e:numbers.entrySet())
		{
			System.out.println(e);
			//just iterating key
			System.out.println(e.getKey());
			//to just iterate value
			System.out.println(e.getValue());	
		}
		
	}

	private static void HashMap_class() {
		// TODO Auto-generated method stub
		System.out.println("\n-----HashMap_class-----\n");
		
		Map<String , Integer> numbers =  new HashMap<String,Integer>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		//If we put again the map will get override and the values will get updated
		if (!numbers.containsKey("Two"))
		{
			numbers.put("Two", 23);//to check and append value
		}
		numbers.putIfAbsent("Absent", 12);//to check if key value is absent in the map 
		
		// for iteration
		
		for(Map.Entry<String, Integer> e:numbers.entrySet())
		{
			System.out.println(e);
			//just iterating key
			System.out.println(e.getKey());
			//to just iterate value
			System.out.println(e.getValue());	
		}
		
		for (Integer values : numbers.values())//iteration using values()
		{
			System.out.println(values);
		}
		//to check if value is present
		numbers.containsKey(12);
		numbers.containsValue("Two")
		
		
		
		
		
		
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
