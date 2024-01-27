package Hard;

import java.util.*;

public class K_Inverse_Pairs_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println( kInversePairs(2,3));
	}

	int dp[][];

	public int kInversePairs(int n, int k) {
		this.dp = new int[n + 1][k + 1];
		for (int i = 0; i < n + 1; i++) {
			Arrays.fill(dp[i], -1);
		}
		return findPairs(n, k);
	}

	public int findPairs(int n, int k) {
		if (k < 0 || n < 0) {
			return 0;
		}
		if (k == 0) {
			return 1;
		}
		int ans = 0;
		if (dp[n][k] != -1) {
			return dp[n][k];
		}
		for (int i = 0; i < n; i++) {
			if (k - i >= 0) {
				ans = (ans + findPairs(n - 1, k - i)) % mod;
			} else {
				break;
			}

		}
		return dp[n][k] = ans;
	}

}
