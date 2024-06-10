class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int leftSum = 0;
        int totalSum = accumulate(nums.begin(),nums.end(),0);
        int i = 0;
        while(i < nums.size()) {
            if(leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i++];
        }
        return -1;
    }
};