package Arrays;

import java.util.Arrays;

public class checkTwoArraysAreEqualOrNot {
    
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        // length of both arrays are the same so we can take either of them in loop condition
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] != B[i]) {
                return false;
            }
            
            
        }
        
        return true;
    }

}
