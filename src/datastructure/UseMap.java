package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


			List<String> cityOfUSA = new ArrayList<>();
			cityOfUSA.add("NY");
			cityOfUSA.add("CA");
			cityOfUSA.add("FL");

			List<String> cityOfUK = new ArrayList<String>();
			cityOfUK.add("London");
			cityOfUK.add("Manchester");


			List<String> cityOfCanada = new ArrayList<String>();
			cityOfCanada.add("Montreal");
			cityOfCanada.add("Toronto");
			cityOfCanada.add("Vancouver");

			Map<String, List<String>> map= new HashMap<>();
			map.put("USA", cityOfUSA);
			map.put("UK", cityOfUK);
			map.put("CANADA", cityOfCanada);

			for(Map.Entry<String, List<String>> country:map.entrySet()){
				System.out.println(country.getKey()+" "+country.getValue());

			}

		Iterator<Map.Entry<String,List<String>>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,List<String>> pair = it.next();
			System.out.println(pair.getKey()+" --> "+pair.getValue());


		}
	}

}
