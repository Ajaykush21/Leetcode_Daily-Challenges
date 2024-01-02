package Medium;

import java.util.*;

public class Convert_an_Array_Into_a_2D_Array_With_Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 4, 1, 2, 3, 1 };
		System.out.println(findMatrix(nums));

	}

	public static List<List<Integer>> findMatrix(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();

		int n = nums.length;

		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
		}

		// System.out.println(mp);

		while (n > 0) {

			List<Integer> l = new ArrayList<>();

			for (Integer i : mp.keySet()) {

				if (mp.get(i) > 0) {
					l.add(i);
					mp.put(i, mp.get(i) - 1);
					n--;
				}
			}
			// System.out.println(l);
			ans.add(l);

		}

		return ans;
	}
}
