package Easy;

public class Find_the_Town_Judge {
	public int findJudge(int n, int[][] trust) {
		int arr[] = new int[n + 1];

		for (int val[] : trust) {
			arr[val[0]]--;
			arr[val[1]]++;
		}

		for (int i = 1; i <= n; i++) {
			if (arr[i] == n - 1) {
				return i;
			}
		}
		return -1;
	}
}
