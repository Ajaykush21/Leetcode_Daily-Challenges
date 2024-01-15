package Medium;

import java.util.*;

public class Find_Players_With_Zero_or_One_Losses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matches = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 },
				{ 10, 9 } };
		System.out.println(findWinners(matches));

	}

	public static List<List<Integer>> findWinners(int[][] matches) {
		int winMatches[] = new int[100001];
		int lostMatches[] = new int[100001];
		for (int i[] : matches) {
			winMatches[i[0]]++;
			lostMatches[i[1]]++;
		}
		List<Integer> win = new ArrayList<>();
		List<Integer> lost = new ArrayList<>();
		for (int i = 1; i < winMatches.length; i++) {
			if (winMatches[i] > 0 && lostMatches[i] == 0) {
				win.add(i);
			} else if (lostMatches[i] == 1)
				lost.add(i);
		}
		List<List<Integer>> answer = new ArrayList<>();
		answer.add(win);
		answer.add(lost);
		return answer;
	}

}
