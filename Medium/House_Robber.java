package Medium;

import java.util.*;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(rob(nums));
		
	}
	public static int rob(int[] nums) {
        int [] dp=new int [nums.length];
        Arrays.fill(dp, -1);
        return HouseRobberTD(nums,0,dp);
    }
    public static int HouseRobberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {

			return dp[i];
		}
		int rob = arr[i] + HouseRobberTD(arr, i + 2, dp);
		int Dont_rob = HouseRobberTD(arr, i + 1, dp);
		return dp[i] = Math.max(rob, Dont_rob);

	}

}
