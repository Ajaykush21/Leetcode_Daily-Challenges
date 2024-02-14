package Medium;

import java.util.*;

public class Rearrange_Array_Elements_by_Sign {
	public int[] rearrangeArray(int[] nums) {
		int n = nums.length;
		int e = 0;
		int o = 1;
		int ans[] = new int[n];
		for (var a : nums) {
			if (a > 0) {
				ans[e] = a;
				e = e + 2;
			} else {
				ans[o] = a;
				o = o + 2;
			}
		}
		return ans;
	}
}
