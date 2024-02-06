package Medium;

import java.util.*;

public class Group_Anagrams {
	 public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> map = new HashMap<>();

        for(String word: strs) {
           char[] letters = word.toCharArray();
           Arrays.sort(letters);
           String sortedWord = new String(letters);
           if(map.containsKey(sortedWord)) {
               map.get(sortedWord).add(word);
           }
           else {
               List<String> list = new ArrayList<>();
               list.add(word);
               map.put(sortedWord, list);
           }
        }
        return new ArrayList<>(map.values());
    }
}
