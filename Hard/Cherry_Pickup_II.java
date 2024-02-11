package Hard;
import java.util.*;
public class Cherry_Pickup_II {
	public int cherryPickup(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;

		int[][][] dp = new int[rows][cols][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Arrays.fill(dp[i][j], -1);
			}
		}

		return getMaxCherries(grid, dp, 0, 0, cols - 1);
	}

	private int getMaxCherries(int[][] grid, int[][][] dp, int row, int col1, int col2) {
		if (row == grid.length || col1 < 0 || col1 >= grid[0].length || col2 < 0 || col2 >= grid[0].length)
			return 0;

		if (dp[row][col1][col2] != -1)
			return dp[row][col1][col2];
		int cherries = grid[row][col1];
		if (col1 != col2)
			cherries += grid[row][col2];

		int maxCherries = 0;
		for (int newCol1 = col1 - 1; newCol1 <= col1 + 1; newCol1++) {
			for (int newCol2 = col2 - 1; newCol2 <= col2 + 1; newCol2++) {
				maxCherries = Math.max(maxCherries, getMaxCherries(grid, dp, row + 1, newCol1, newCol2));
			}
		}

		dp[row][col1][col2] = cherries + maxCherries;

		return dp[row][col1][col2];
	}
}
