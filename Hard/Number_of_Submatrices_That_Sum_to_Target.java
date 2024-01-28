package Hard;

import java.util.*;

public class Number_of_Submatrices_That_Sum_to_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 0, 1, 0 }, { 1, 1, 1 },{0,1,0} };
		int target = 0;
		System.out.println(numSubmatrixSumTarget(matrix, target));

	}

	public static int numSubmatrixSumTarget(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n; j++) {
				matrix[i][j] += matrix[i][j - 1];
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				Map<Integer, Integer> mp = new HashMap<>();
				mp.put(0, 1);
				int sum = 0;

				for (int row = 0; row < m; row++) {
					sum += matrix[row][j] - (i > 0 ? matrix[row][i - 1] : 0);
					count += mp.getOrDefault(sum - target, 0);
					mp.put(sum, mp.getOrDefault(sum, 0) + 1);
				}
			}
		}
		return count;
	}

}
