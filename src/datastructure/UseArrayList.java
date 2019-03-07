package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<Integer> array = new ArrayList<>();
//add element
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);

//Using 'forEach' loop
		System.out.println("Use of for-each loop: ");
		for (Integer in : array) {
			System.out.println(in);
		}

//using iterator
		System.out.println("Use of iterator using while loop: ");
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.println(i);
		}
//peek
		System.out.println("Peek 1st data: " + array.get(0));

//remove element from ArrayList
		System.out.println("Remove element at index 1: " + array.remove(1));



//Using 'forEach' loop
		System.out.println("After remove element(for loop): ");
		for (Integer in : array) {
			System.out.println(in);
		}

//using iterator
		System.out.println("After removing element(while loop): ");
		Iterator it1 = array.iterator();
		while (it1.hasNext()) {
			Integer i1 = (Integer) it1.next();
			System.out.println(i1);
		}

//Sorting ArrayList
		Collections.sort(array);

		ConnectToSqlDB connect = new ConnectToSqlDB();
		try {
			connect.insertDataFromIntegerArrayListToSqlTable(array, "stack_by_arraylist", "sortedNums");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}