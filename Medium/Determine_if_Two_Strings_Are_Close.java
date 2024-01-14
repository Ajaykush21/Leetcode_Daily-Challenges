package Medium;
import java.util.*;
public class Determine_if_Two_Strings_Are_Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1="abc";
		String word2="bca";
		System.out.println(closeStrings(word1,word2));
		

	}
	public static boolean closeStrings(String word1, String word2) {
	      if(word1.length()!=word2.length()) return false;
	        
	        int freq1[]=new int[26];
	        int freq2[]=new int[26];
	        for(char ch:word1.toCharArray())
	        {
	            freq1[ch-'a']++;
	        }
	        for(char ch:word2.toCharArray())
	        {
	            freq2[ch-'a']++;
	        }
	        for(int i=0;i<26;i++)
	        {
	            if((freq1[i]>0 && freq2[i]==0) || (freq1[i]==0 && freq2[i]>0)) 
	                return false;
	        }
	        Arrays.sort(freq1);
	        Arrays.sort(freq2);
	        for(int i=0;i<26;i++)
	        {
	            if(freq1[i]!=freq2[i]) return false;
	        }

	        return true;  
	    }

}
