package algoTraining;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * What data structure can help outperform the brute force method?
 * Can use hash table to remember values that have been checked ONCE.
 */
public class ImprovedTwoSum {

	public int[] improvedTwoSum(int[] array, int target) {
		HashMap<Integer, Integer> table = new HashMap();

		//Go through it once, and use hash table to check for "complements,
		//aka two values that adds into our target.
		for (int i = 0; i < array.length; i++) {
			table.put(array[i], i);

		}
			//HashMap uses key/value pairs.
			for (int i = 0; i <array.length; i++) {
				int complement = target - array[i];
				//To ensure we don't use the index TWICE, as that is not allowed.
				if (table.containsKey(complement) && table.get(complement) != i) {
					String result = String.format("Complement found: %d minus %d = %d \n " +
									"because %d + %d together becomes our target of %d",
							target, array[i], complement, array[i], complement, target
					);
					System.out.println(result);
					return new int[]{i, table.get(complement)};
			}
		}
		System.out.println("No solution found.");
		return new int[]{};
	}

	public static void main(String[] args) {
		ImprovedTwoSum improvedTwoSum = new ImprovedTwoSum();
		int [] testCase = {1, 15, 9, 4, 6};
		int target = 12;
		int[] result = improvedTwoSum.improvedTwoSum(testCase, target);
	}

	public int[] onePassTable(int[]array, int target) {
		HashMap<Integer, Integer> table = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			int complement = target - array[i];
			if (table.containsKey(complement)) {
				return new int[]{table.get(complement), i};
			}
			table.put(array[i], i);
		}
		//Empty array if no solution.
		return new int[]{};
	}
}
