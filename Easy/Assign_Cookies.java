package Easy;
import java.util.*;
public class Assign_Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] g= {1,2,3};
		int [] s= {1,1};
//		int [] g= {1,2};
//		int [] s= {1,2,3};
		
		System.out.println(number(g,s));

	}

	public static int number(int[] g, int[] s) {
		// TODO Auto-generated method stub
		  Arrays.sort(g);
	        Arrays.sort(s);
	        int i=g.length-1;
	        int j=s.length-1;
	        int count=0;
	        while(j>=0 && i>=0){
	            if(s[j]>=g[i]){
	                    count++;
	                    j--;
	                }
	                i--;
	        }
	        return count;
		
	}

}
