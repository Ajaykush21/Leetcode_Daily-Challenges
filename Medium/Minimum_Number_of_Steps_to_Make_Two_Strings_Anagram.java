package Medium;

public class Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bab";
		String t = "aba";
		System.out.println(minSteps(s,t));

	}

	public static int minSteps(String s, String t) {
		int[] cf = new int[26];
		for (char c : s.toCharArray()) {
			cf[c - 'a']--;
		}
		for (char c : t.toCharArray()) {
			cf[c - 'a']++;
		}
		int r = 0;
		for (int d : cf) {
			if (d > 0) {
				r += d;
			}
		}
		return r;
	}

}
