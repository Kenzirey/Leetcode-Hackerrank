package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {
	public static void main(String[] args) {
		TwoSum testSolution = new TwoSum();
		int [] testCase = {2, 7, 11, 15};
		int target = 9;
		int[] result = testSolution.twoSum(testCase, target);
		System.out.println(Arrays.toString(result));
	}

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		//Use hash table, but how.
		//How to make this into a stream / lambda expression?

		//Store elements and their indices into the HashMap.
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		//For each element nums[i], calculate complement by subtracting it from the target.
		//Complement refers to value that when added to a given number, results in the target.
		//If target is 9, and current number is 2 then the complement would be 7.
		//complement = target - nums[i].
		for (int i = 0; 1 < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[]{i, map.get(complement)};
			}
		}
		//No solution?
		return new int[]{};
	}


}

