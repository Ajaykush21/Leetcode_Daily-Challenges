package Medium;
import java.util.*;
public class Daily_Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {73,74,75,71,69,72,76,73};
		dailyTemperatures(nums);
		
		

	}
	public static int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
    int[] ans = new int[n]; 
    for (int i = n - 1; i >= 0; i--) { 
        int k = i + 1;
        while (k < n && nums[k] <= nums[i]) { 

            if (ans[k] > 0) {
                k += ans[k];
            } else {
                k = n; 
            }
        }
        if (k < n) {
            ans[i] = k - i;
        }
    }
    return ans;
	}
}
