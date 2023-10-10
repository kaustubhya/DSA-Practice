package Arrays;

public class setMatrixZeros {
    
    public void setZeroes(int[][] matrix) {
        if((matrix == null) || (matrix.length == 0)) {
            System.out.println("Empty Matrix");
            return;
        }
            
       int rows = matrix.length;
        int cols = matrix[0].length;
        
        // imp new boolean arrays
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        
        // Step 1: Mark rows and columns with zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        
        // Step 2: Set zero rows
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Step 3: Set zero columns
        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    
    }
}
