package Medium;

import java.util.*;

public class Longest_Common_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "abcde";
		String text2 = "ace";
		System.out.println(longestCommonSubsequence(text1, text2));

	}

	public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
       int m = text2.length();

       int dp[][]= new int[n+1][m+1];
       for(int i=0; i<n+1; i++){
           for(int j=0; j<m+1; j++){
               if(i==0 || j==0){
                   dp[i][j] = 0;
               }
               else if(text1.charAt(i-1) == text2.charAt(j-1)){
                   dp[i][j] = dp[i-1][j-1] + 1;
               } else{
                   int ans1 = dp[i-1][j];
                   int ans2 = dp[i][j-1];
                   dp[i][j] = Math.max(ans1, ans2);
               }
           }
       }
       return dp[n][m];
	}
}
