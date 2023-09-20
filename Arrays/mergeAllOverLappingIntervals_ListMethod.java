package Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class mergeAllOverLappingIntervals_ListMethod {
   

    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        // Write your code here.

        int n = arr.length;

        // Sorting the subarrays considering their first element only
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[]a, int[] b){
            return a[0] - b[0];
        }
        });

        // logic
        /*Arrays.sort(arr, new Comparator<int[]>() { ... });: This line uses the Arrays.sort method to sort the array arr. It takes two arguments:

arr: The array to be sorted.
new Comparator<int[]>() { ... }: Here, an anonymous inner class is created that implements the Comparator<int[]> interface. This custom comparator defines the sorting logic for the Arrays.sort method.
public int compare(int[] a, int[] b) { ... }: Inside the anonymous inner class, the compare method is defined. This method takes two parameters, a and b, which are two elements from the array arr that need to be compared.

return a[0] - b[0];: Inside the compare method, this line calculates the difference between the first element of array a and the first element of array b. This comparison serves as the basis for sorting. The logic is as follows:

If a[0] is less than b[0], the result is negative, indicating that a should come before b in the sorted order.
If a[0] is greater than b[0], the result is positive, indicating that b should come before a in the sorted order.
If a[0] and b[0] are equal, the result is zero, indicating that the two elements are considered equal in terms of sorting, and their relative order will be preserved (i.e., their original order in the array arr will be maintained).
       */

       List <List<Integer>> ans = new ArrayList<>();

       for(int i = 0; i < n; i++) {
           
           // imp code lines

           if(ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
               // non overlapping case
               ans.add(Arrays.asList(arr[i][0], arr[i][1]));  // 0 is the first element, 1 is the second element
           // here if the case is non overlapping then just add the first and second element into ans list of list as a new list
           }

           else {
               // overlapping case
               ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
               // if the case is overlapping, then here we set the last subarray's second element as a result of the max between the ans arrays's last subarrays's second element and the current subarray's second element
           }
       }

       return ans;

    }
}

