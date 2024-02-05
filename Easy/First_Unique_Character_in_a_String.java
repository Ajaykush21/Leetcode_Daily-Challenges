package Easy;

public class First_Unique_Character_in_a_String {
	public int firstUniqChar(String s) {
		int arr[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int character = s.charAt(i) - 'a';
			arr[character]++;
		}
		for (int j = 0; j < s.length(); j++) {
			if (arr[s.charAt(j) - 'a'] == 1) {
				return j;
			}
		}
		return -1;
	}
}
