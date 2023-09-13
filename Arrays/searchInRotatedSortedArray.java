package Arrays;

public class searchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        // We will use a modified binary search here, since here one part of array is sorted in ascending order and the array is rotated, the smaller ascensing part will either be to the lhs of the mid or the rhs of the mid
        int start = 0;
        int end = nums.length -1;


        while(end >= start) {

        int mid = start + (end - start)/2;   // put mid inside while to avoid TLE. If you put it outside, you get Tle

            if(nums[mid] == target) {
                return mid;
            }



            // now comes the imp part
            // LHS of mid 

            // ideal order =>  start target mid
            if(nums[start] <= nums[mid]) {
                if(nums[start] <= target &&  target <= nums[mid] ) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

            }
            
            // RHS of mid
            // ideal order => mid target end
            else {
                if(nums[end] >= target &&  target >= nums[mid] ) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
