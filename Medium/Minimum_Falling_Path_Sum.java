package Medium;

import java.util.*;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
   System.out.println(minFallingPathSum(matrix));
	}

	public static int minFallingPathSum(int[][] matrix) {
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int a = Integer.MAX_VALUE;

				if (j != 0) {
					a = matrix[i - 1][j - 1];
				}

				int b = Math.min(a, matrix[i - 1][j]);

				int c = Integer.MAX_VALUE;

				if (j != matrix[0].length - 1) {
					c = matrix[i - 1][j + 1];
				}

				matrix[i][j] += Math.min(b, c);
			}
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, matrix[matrix.length - 1][i]);
		}

		return ans;
	}

}
