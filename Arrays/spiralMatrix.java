package Arrays;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return ans;
        }
       
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;
        int top = 0;
        
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
        
        for(int i = top; i <= bottom; i++) {
            ans.add(matrix[i][right]);
        }
            right--;
            
        // now Check if there is a valid row to traverse from right to left.         
            
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        } 
            
        
        return ans;
    }
}

