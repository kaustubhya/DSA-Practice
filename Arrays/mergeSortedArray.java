package Arrays;

public class mergeSortedArray {
    
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        // we'll take 3 indices here
    
       // m = nums1.length
       // n = nums2.length
        int i = m - 1; // index of last element of nums1 (original)
        int j = n - 1; // index of last element of nums2
        int k = m + n - 1; // index of last element of nums1 (modified)
    
    
        // now we'll update and replace elements in k (let k be [1 2 3 0 0 0 ] i be [1 2 3]
        // and j be [2 5 6])'
    
        // start from k last, i last, and j last
    
        while((i >= 0) && (j >= 0)) {  // exit the loop if either of i or j is 0    
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
    
            else {
                // this covers nums1[i] < nums2[j] and nums1[i] == nums2[j]
                nums1[k] = nums2[j];
                j--;
            }
    
            k--;
        }
    
        // if i and j are of unequal size and nums2 array has some elements left then, 
    
        while(j >= 0) {
            // copy the elements of j into k
            nums1[k] = nums2[j];
            // imp to decrement both
            j--;
            k--;
        }
               
            
        }
    
}


// Explaination with example

/* nums1: [1, 2, 3, 0, 0, 0]
m: 3 (number of elements in nums1)
nums2: [2, 5, 6]
n: 3 (number of elements in nums2)
Step 1:

Initialize indices:
i: 2 (last index of nums1)
j: 2 (last index of nums2)
k: 5 (last index of merged array)
Step 2:

Compare nums1[i] (3) and nums2[j] (6).
Since nums2[j] is larger, place it in nums1[k] and decrement j and k.
nums1: [1, 2, 3, 0, 0, 6]
Indices: i: 2, j: 1, k: 4
Step 3:

Compare nums1[i] (3) and nums2[j] (5).
Since nums2[j] is still larger, place it in nums1[k] and decrement j and k.
nums1: [1, 2, 3, 0, 5, 6]
Indices: i: 2, j: 0, k: 3
Step 4:

Compare nums1[i] (3) and nums2[j] (2).
Now nums1[i] is larger, place it in nums1[k] and decrement i and k.
nums1: [1, 2, 3, 3, 5, 6]
Indices: i: 1, j: 0, k: 2
Step 5:

Compare nums1[i] (2) and nums2[j] (2).
Both are equal, so place either in nums1[k] and decrement i and k.
nums1: [1, 2, 2, 3, 5, 6]
Indices: i: 0, j: 0, k: 1
Step 6:

Copy remaining elements from nums2 into nums1.
nums1: [1, 2, 2, 3, 5, 6]
Indices: i: 0, j: -1, k: 0
Step 7:

Merging is complete, and nums1 contains the sorted merged array: [1, 2, 2, 3, 5, 6]
*/