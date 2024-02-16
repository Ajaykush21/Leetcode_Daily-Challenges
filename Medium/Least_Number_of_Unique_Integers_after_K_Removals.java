package Medium;
import java.util.*;
public class Least_Number_of_Unique_Integers_after_K_Removals {
	public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:arr){
           map.put(num,map.getOrDefault(num,0)+1);
       }
       ArrayList<Integer> array=new ArrayList<>(map.values());
       Collections.sort(array);
       int count=array.size();
       for(int freq:array){
           if(k>=freq){
               k-=freq;
               count--;
           }
           else{
               break;
           }
       }
       return count;
   }
}
