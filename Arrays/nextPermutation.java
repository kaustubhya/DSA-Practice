package Arrays;
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class nextPermutation {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// 3 steps 
		int index = Integer.MIN_VALUE;
		int n = permutation.size();

		// 1. Find the break point
		// if it exists
		for(int i = n-2; i >= 0; i--) {
			if(permutation.get(i) < permutation.get(i+1)) {
				index = i;
				break;
			}
		}

		// If the break point does not exist
		if (index == Integer.MIN_VALUE) {
			// here we are at the last permutation, i.e. edge case, hence, go back to the first permutation, i.e. reverse the array
			// Use Collections framework
			Collections.reverse(permutation);
			return permutation;
		}


		// Step 2, swapping the breakpoint element with the element just greater than it on the right

		for(int i = n - 1; i >= index; i--) {
			if(permutation.get(index) < permutation.get(i)) {
				int temp = permutation.get(i);
				permutation.set(i, permutation.get(index));
				permutation.set(index, temp);
				// replaces index with temp
				break;

			}
		}


		// Step 3, reversing all the remaining right half
		List<Integer> sublist = permutation.subList(index + 1, n);
		 // use A.size() for lists and A.length for arrays
		// creating a new ArrayList 'subarray' with its starting and ending points
		// Notice the sublist and subList difference here
		// The subList method in Java's List interface is used to create a view (a portion) of an existing list based on a specified range of indices. It's a useful tool when you want to work with a subset of the elements in a list without creating a new list with those elements. 

		//reversing it now
		Collections.reverse(sublist);
		return permutation;


	}


// here we are working with lists, hence we will use A.get() instead of A[] which is used in arrays

}




// Another way with Arrays

/* 
public void nextPermutation(int[] nums) {
    int n = nums.length;
    int index = -1;

    // 1. Find the break point
    for (int i = n - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            index = i;
            break;
        }
    }

    // If no break point exists, reverse the whole array and return
    if (index == -1) {
        reverse(nums, 0, n - 1);
        return;
    }

    // 2. Find the next greater element and swap it with nums[index]
    for (int i = n - 1; i > index; i--) {
        if (nums[i] > nums[index]) {
            swap(nums, index, i);
            break;
        }
    }

    // 3. Reverse the right half of the array
    reverse(nums, index + 1, n - 1);
}

private void reverse(int[] nums, int start, int end) {
    while (start < end) {
        swap(nums, start, end);
        start++;
        end--;
    }
}

private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
*/