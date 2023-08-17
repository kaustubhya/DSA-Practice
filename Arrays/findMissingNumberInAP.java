package Arrays;

public class findMissingNumberInAP {

    // Here the array will be in an AP, not just random numbers
    
        int findMissing(int[] arr, int n) {
            // int n = arr.length;
                int commonDifference = (arr[n - 1] - arr[0])/n;  // AP Formula, finding the common difference this is not same as sum of n numbers 
                // common difference = (last number - first number)/size
                // size = arr.length = n
        
                for (int i = 0; i < arr.length; i++) {
                    if((arr[i + 1] - arr[i]) != commonDifference) {
                        return arr[i] + commonDifference;   // imp line
                    }
        
                }
        
                return -1; // if no number is found, return -1
        }
    
    
}
