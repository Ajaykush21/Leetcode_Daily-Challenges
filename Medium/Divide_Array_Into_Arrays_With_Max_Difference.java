package Medium;
import java.util.*;
public class Divide_Array_Into_Arrays_With_Max_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,3,4,8,7,9,3,5,1};

	}
	public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int index=0;
        int[][] arr=new int[nums.length/3][3];
        for(int i=0;i<nums.length-2;i+=3){
            if((nums[i+2]-nums[i])<=k){
                arr[index][0] = nums[i];
                arr[index][1] = nums[i + 1];
                arr[index][2] = nums[i + 2];
                
                index++;
                
            }
            else{
                return new int[0][0];
            }
        }
        return arr;}

}
