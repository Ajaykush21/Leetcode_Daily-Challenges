package Medium;

import java.util.*;

public class Sum_of_Subarray_Minimums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 2, 4 };
		System.out.println(sumSubarrayMins(arr));
	}

	public static int sumSubarrayMins(int[] arr) {
		int n = arr.length;
		Stack<Integer> st = new Stack<>();
		int right[] = new int[n];
		int left[] = new int[n];
		for (int i = 0; i < n; i++) {
			right[i] = n - i - 1;
			left[i] = i;
		}
		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
				right[st.peek()] = i - st.peek() - 1;
				st.pop();
			}
			st.push(i);
		}
		st.clear();
		for (int i = n - 1; i >= 0; i--) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
				left[st.peek()] = st.peek() - i - 1;
				st.pop();
			}
			st.push(i);
		}
		st.clear();
		long mod = (long) 1000000007;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += (long) arr[i] * (left[i] + 1) * (right[i] + 1);
			ans = ans % mod;
		}
		return (int) ans;
	}

}
