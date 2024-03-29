package Hard;
import java.util.*;
public class Minimum_Window_Substring {
	public String minWindow(String s, String t) {
		if (s.length() < t.length())
			return "";
		int start = 0;
		int end = 0;
		Map<Character, Integer> mp = new HashMap<>();
		int totalCount = 0;
		for (int i = 0; i < t.length(); i++) {
			mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) + 1);
			totalCount++;
		}

		int tempTotal = totalCount;
		int sIndex = 0;
		int eIndex = 0;
		int width = Integer.MAX_VALUE;
		while (start < s.length()) {
			if (tempTotal == 0) {
				if (width > end - start) {
					width = end - start;
					sIndex = start;
					eIndex = end;
				}
				if (mp.containsKey(s.charAt(start))) {
					mp.put(s.charAt(start), mp.get(s.charAt(start)) + 1);
					if (mp.get(s.charAt(start)) > 0)
						tempTotal++;
				}
				start++;
			} else {
				if (end < s.length()) {
					if (mp.containsKey(s.charAt(end))) {
						mp.put(s.charAt(end), mp.get(s.charAt(end)) - 1);
						if (mp.get(s.charAt(end)) >= 0)
							tempTotal--;
					}
					end++;
				} else if (tempTotal != 0)
					start++;
			}

		}
		return s.substring(sIndex, eIndex);
	}
}
