package Medium;
import java.util.*;
public class heapest_lights_Within_K_Stops {
	 public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
         int[] previousCost=new int[n]; 
       Arrays.fill(previousCost, Integer.MAX_VALUE);
       //set the cost of reaching the source city to 0
       previousCost[src]=0; 
       //run the loop k+1 times (including 0)
       for(int i=0;i<=k;i++){ 
           //create a new array "current" with size n to store the current cost
           int currentCost[]=new int[n]; 
           //copy the values of previousCost array to currentCost array
           for(int j=0;j<n;j++){
               currentCost[j]=previousCost[j]; 
           }
           for(int l[]: flights){ //iterate through each flight array
               int x=l[0], y=l[1], z=l[2]; //extract the source, destination, and cost of the flight
               //if the cost of reaching the source city is not infinite and the cost of reaching the destination through the previous path is greater than the cost of reaching through the current path
               if(previousCost[x]!=Integer.MAX_VALUE && previousCost[x]+z < currentCost[y]){ 
                   currentCost[y]=previousCost[x]+z; //update the current cost
               }
           }
           for(int j=0;j<n;j++) //copy the values of current array back to previousCost array
           {
               previousCost[j]=currentCost[j];
           }
           
       }
       //return the cost of reaching the destination city through the cheapest path (if it is still maximum integer value after k+1 iterations, return -1)
       return previousCost[dst]==Integer.MAX_VALUE?-1:previousCost[dst];
   }
}
