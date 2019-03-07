package math.problems;
import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int p = 1000000;

		int num = 0;
		int count = 0;
		int[] array_prime = new int[78498]; // total # of primes
		for (int i = 2; i <= p; i++) {

			boolean Prime = true;
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					Prime = false;

					break;
				}
			}
			if (Prime == true) {
				array_prime[num] = i;
				System.out.println(i);
				count++;
				num++;
			}

		}

		System.out.println(" count: " + count);


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> storePattern = new ArrayList<>();
		connectToSqlDB.insertDataFromArrayToSqlTable(array_prime, "tbl_Prime_Number", "column_Prime_Number");
		storePattern = connectToSqlDB.readDataBase("tbl_Prime_Number", "column_Prime_Number");


		System.out.println("Data is being read from the Table (tablePrimeNumber) and displaying to the console");
		for (String st : storePattern) {
			System.out.print(st + " ");
		}
	}
}
