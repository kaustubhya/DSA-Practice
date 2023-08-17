//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMissing(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    int findMissing(int[] arr, int n) {
        // code h int n = nums.length;
            int commonDifference = (arr[n - 1] - arr[0])/n;  // AP Formula, sum of n nos., this is not same as sum of n numbers
    
            for (int i = 0; i < arr.length; i++) {
                if((arr[i + 1] - arr[i]) != commonDifference) {
                    return arr[i] + commonDifference;   // imp line
                }
    
            }
    
            return -1; // if no number is found, return -1
    }
}
