package Easy;
import java.util.*;
public class Set_Mismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,2,2,4};
		 int [] arr=findErrorNums(nums);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		

	}
	 public static int[] findErrorNums(int[] nums) {
	        int arr[]=new int[2];
	        int n=nums.length;
	        int i=0;
			// Sorting the array using Cyclic Sort
	        while(i<n){
	            int val=nums[i];
				// Swap the element which is not at it's correct index with the element that should be at the current index
	            if(i+1!=val && val!=nums[val-1]){
	                int temp=val;
	                nums[i]=nums[val-1];
	                nums[val-1]=temp;
	            }
	            else i++;
	        }
			// Traverse through the array to find which element is not at its correct index
	        while(i-->0){
	            if(i+1!=nums[i]){
	                arr[0]=nums[i];
	                arr[1]=i+1;
	            }
	        }
	        return arr;
	    }

}
