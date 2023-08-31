package Arrays;

public class containerWithMostWater {
    
        public int maxArea(int[] height) {
            int maxArea = 0;
            int left = 0;
            int right = height.length - 1;
    
            while(right > left) {
                int currentWidth = right - left;
                int currentHeight = Math.min(height[left], height[right]);
                int currentArea = currentHeight * currentWidth;
                maxArea = Math.max(currentArea, maxArea);
    
    
                // moving forward
                if(height[left] > height[right]) {
                    right--;
                }
    
                else{
                    left++;
                }
            }
    
            
    
            return maxArea;
        }
    
}
