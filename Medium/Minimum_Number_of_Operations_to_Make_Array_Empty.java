package Medium;

import java.util.*;

public class Minimum_Number_of_Operations_to_Make_Array_Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {2,3,3,2,2,4,2,3,4};
		//int[] nums = { 14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12 };
System.out.println(minOperations(nums));
	}

	public static int minOperations(int[] nums) {
		HashMap<Integer, Integer> countMap = new HashMap<>();

// Count occurrences of each element in the array
		for (int num : nums) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

// Display the counts
		int ans = 0;
		for (int key : countMap.keySet()) {
			int val = countMap.get(key);
			if (val == 1) {
				return -1;
			} else {
				if (val % 3 == 0) {
					ans += val / 3;
				} else if (val % 3 == 2) {
					ans += val / 3;
					ans++;
				} else if (val % 3 == 1) {
					ans += (val - 4) / 3;
					ans += 2;
				} else {
					ans += val / 2;
				}
			}
		}
		return ans;
	}

}
