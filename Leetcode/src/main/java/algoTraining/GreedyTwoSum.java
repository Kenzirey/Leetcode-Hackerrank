package algoTraining;

import java.util.Arrays;

/**
 * Two-Sum problem. Given an array of integer values, find the pair of values
 * that sums up to a given value (target). For example, provided with the array [1, 3, 6, 4, 2]
 * with 10 as the target, the algorithm outputs (6, 4). Since 6 + 4 = 10.
 * By contrast, provided with [4, 2, 3, 9, 8] and target = 19, the algorithm raises error. Since no pair.
 * This ends up being O(n^2) because it goes through the array twice each time the method is run.
 * One for i, one for j. i*j = n^2.
 */
public class GreedyTwoSum {


	/**
	 * A brute force method of finding the sum of two integers in an array.
	 *
	 * @param array the array containing the potential pairs.
	 *
	 * @param target the target value you wish the two sums to add to.
	 *               For example 2 + 3 = 5. Where you want a pair of {2,3} in the array.
	 *
	 * @return a new array with the corresponding pair.
	 */
	public int[] twoSum(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <array.length; j++) {
				if (array[i] + array [j] == target) {
					String format = String.format("Target found: %d + %d is equal to %d", array[i], array[j], target);
					System.out.println(format);
					return new int[]{i, j};
				}
			}
		}
		System.out.println("No solution found");
		//Empty array, as we have no solution if we get to this point.
		return new int[]{};
	}

	public static void main(String[] args) {
		GreedyTwoSum greedy = new GreedyTwoSum();
		int[] testArray = {1, 3, 8, 4, 6};
		int target = 10;
		int [] result = greedy.twoSum(testArray, target);
		System.out.println("The array indexes used were: " + Arrays.toString(result));
	}
}
