package Medium;
import java.util.*;
public class Sort_Characters_By_Frequency {
	public String frequencySort(String s) {
        int[] freq = new int[128];
       int maxFreq = 0;

       for (int i = 0; i < s.length(); i++) {
           freq[s.charAt(i) - '0']++;
           maxFreq = Math.max(maxFreq, freq[s.charAt(i) - '0']);
       }
       List<List<Character>> characterList = new ArrayList<>(maxFreq + 1);

       for (int i = 0; i <= maxFreq; i++) {
           characterList.add(new ArrayList<>());
       }

       for (int i = 0; i < 128; i++) {
           characterList.get(freq[i]).add((char) (i + 48));
       }
       StringBuilder sortedBuilder = new StringBuilder(s.length());
       
       for (int i = maxFreq; i > 0; i--) {
           List<Character> chars = characterList.get(i);

           for (char c : chars) {

               for (int j = 0; j < i; j++) {
                   sortedBuilder.append(c);
               }
           }
       }
       return sortedBuilder.toString();
   }
}
