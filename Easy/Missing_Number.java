package Easy;

public class Missing_Number {
	public int missingNumber(int[] nums) {
		int n = nums.length;
		int sum = n * (n + 1) / 2;
		for (int i : nums) {
			sum -= i;
		}
		return sum;

	}
}
