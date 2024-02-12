package Easy;

public class Majority_Element {
	public int majorityElement(int[] nums) {
		int curr = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (curr == nums[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				curr = nums[i];
				count = 1;
			}

		}
		return curr;

	}
}
