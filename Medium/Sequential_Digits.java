package Medium;
import java.util.*;
public class Sequential_Digits {
	 public List<Integer> sequentialDigits(int low, int high) {
         List<Integer> li = new ArrayList<>();
        for(int i = 1;i<=9;i++){
            int a = i;
            int n = i+1;
            while(a<=high && n<=9){
                a=a*10+(n);
                if(a>=low && a<=high){
                    li.add(a);
                }
                n++;
            }
        }
        Collections.sort(li);
        return li;
    }

}
