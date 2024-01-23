package Medium;
import java.util.*;
public class Maximum_Length_of_a_Concatenated_String_with_Unique_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"un","iq","ue"};
		

	}
	 public static boolean isDupl(String s1,String s2)
	    {
	        int fq[]=new int[26];
	        for(char ch:s1.toCharArray())
	        {
	            if(fq[ch-'a']>0)return true;
	            fq[ch-'a']++;
	        }
	        for(char ch:s2.toCharArray())
	        {
	            if(fq[ch-'a']>0)return true;
	        }
	        return false;
	    }
	    public static int solve(int i,List<String> arr,String temp,int n)
	    {
	        if(i>=n)return temp.length();
	        int include=0;
	        int exclude=0;
	        if(isDupl(arr.get(i),temp))
	        {
	            exclude=solve(i+1,arr,temp,n);
	        }
	        else
	        {
	            exclude=solve(i+1,arr,temp,n);
	            include=solve(i+1,arr,temp+arr.get(i),n);
	        }
	        return Math.max(include,exclude);
	    }
	    public static int maxLength(List<String> arr) {
	        String temp="";
	        int n=arr.size();
	        int i=0;
	        return solve(i,arr,temp,n);
	    }

}
