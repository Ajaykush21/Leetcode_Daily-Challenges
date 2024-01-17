package Easy;

import java.util.*;

public class Unique_Number_of_Occurrences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 1, 1, 3 };
		System.out.println(uniqueOccurrences(arr));

	}

	public static boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		int[] check = new int[arr.length + 1];
		for (int i : map.values()) {
			if (check[i] > 0) {
				return false;
			}
			check[i]++;
		}
		return true;
	}
}
