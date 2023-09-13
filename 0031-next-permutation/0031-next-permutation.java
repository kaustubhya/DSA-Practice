class Solution {
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
    
}