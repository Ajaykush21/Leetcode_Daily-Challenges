package Easy;

public class Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(climbStairs(n));
	}
	 public static int climbStairs(int n) {
	        int ans=0;
			if(n==0 || n==1) {
				return 1;
			}
			else {
				int x=0;
				int y=1;
				for(int i=0;i<n;i++) {
					ans=x+y;
					x=y;
					y=ans;
				}
				return ans;
	        }
	    }

}
