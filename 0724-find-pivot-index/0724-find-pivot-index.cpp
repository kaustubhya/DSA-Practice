class Solution {

public:
    int BruteForce(vector<int>& nums) {
        int n = nums.size();
        

        for(int i = 0; i < n; i++) {
            // \U0001f6d1\U0001f6d1\U0001f6d1 Reset the sums after every iteration of i
            int leftSum = 0;
            int rightSum = 0;


            for(int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for(int k = i + 1; k < n; k++) {
                rightSum += nums[k];
            }

            if(leftSum == rightSum) {
                return i;
                // the pivot index
            }        
        }

        return -1;
        // no pivot index found
    }

public:
    int pivotIndex(vector<int>& nums) {
        int ans = BruteForce(nums);
        return ans;

    }
};