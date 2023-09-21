package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverlappingIntervals_2DArrayMethod {
    
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int[] currentInterval = intervals[0];
        
        for(int i = 1; i < intervals.length; i++){
            int[] nextInterval = intervals[i];
            
            if(currentInterval[1] >= nextInterval[0]) {
                // merging case
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            }
            else {
                // add non merged intervals
                ans.add(currentInterval);
                
                // future scope
                currentInterval = nextInterval;
            }
        }
        
        // adding the merged intervals
        ans.add(currentInterval);
        
        return ans.toArray(new int[ans.size()][]);

        /*The code line return ans.toArray(new int[ans.size()][]); is used to convert an ArrayList of int arrays (List<int[]>) into a 2D array of ints (int[][]). Let me break down what this line does:

ans is an ArrayList that stores the merged intervals as int arrays. Each int array represents an interval with two elements: [start, end].

ans.size() returns the number of merged intervals in the ArrayList ans.

new int[ans.size()][] creates a new 2D int array with a number of rows equal to the size of the ArrayList ans. This is done to prepare the structure of the final result.

ans.toArray(new int[ans.size()][]) converts the ArrayList ans into a 2D int array. The toArray method is used to perform this conversion. The argument new int[ans.size()][] specifies the type of the resulting array, which is an array of arrays (2D array) of ints.

 */


    }
}

