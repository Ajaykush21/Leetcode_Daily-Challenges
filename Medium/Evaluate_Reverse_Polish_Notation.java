package Medium;
import java.util.*;
public class Evaluate_Reverse_Polish_Notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens= {"2","1","+","3","*"};
		System.out.println(evalRPN(tokens));

	}
	public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String val : tokens) {
            if (val.length() == 1 && (val.charAt(0) < 48)) {
                int x2 = st.pop();
                int x1 = st.pop();

                if (val.charAt(0) == '+') {
                    st.add(x1 + x2);
                } else if (val.charAt(0) == '-') {
                    st.add(x1 - x2);
                } else if (val.charAt(0) == '*') {
                    st.add(x1 * x2);
                } else {
                    st.add(x1 / x2);
                }
            } else {
                st.push(Integer.parseInt(val));
            }
        }


        return st.pop();
    }

}
