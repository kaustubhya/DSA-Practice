package BackTracking;

public class wordSearch_2D_matrix {
    public boolean exist(char[][] board, String word) {
        char[] wordArray = word.toCharArray();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                
                if(board[i][j] == wordArray[0] && backtrack(board,i,j,0,wordArray)) {
                    // if any element of the board matches with the first element of the wordArray array i.e. the word's first letter
                    // then use backtracking to find the rest of the letters, then return true once done
                    return true;
                    
                }
            }
            
        }
        
        return false;
        
    }
    
    
    
    
    private boolean backtrack(char[][] board, int row, int col, int index, char[] wordArray) {
        
        if(index == wordArray.length) {
            return true;
            // index is our current pointer, if our index pointer equals the word.length i.e. we have finished matching all the word 
        }
        
        if(row < 0 || col < 0 || row > board.length - 1 || col > board[0].length - 1 || board[row][col] != wordArray[index]) {
            // last condition important, if any element does not match the letter at that particular index, the path you are pursuing is not correct and you should backtrack
            return false; // here for the last condition, we wrote return false i.e. we need to backtrack
        }
        
        char temp = board[row][col];
        board[row][col] = '#'; // prevents from going on an infinite loop
        // once an element on board is visited mark it as '#',
        // before marking it '#', store it in a temp var to save it
        
        boolean find = backtrack(board, row + 1, col, index + 1, wordArray) 
        || backtrack(board, row - 1, col, index + 1, wordArray) 
        || backtrack(board, row, col + 1, index + 1, wordArray) 
        || backtrack(board, row, col - 1, index + 1, wordArray);
        
        // use backtracking as follows:
        
        // 1. Once an element matches the word's first letter, save it in a temp, put it as '#' and mark it as visited.
        // 2. Then use backtracking to explore elements that are on top, bottom, left and right of the element.
        // 3. Out of the 4, we will get atleast one direction where the next index will match with the element, we then proceed with that
        // 4. If we go a wrong direction, we come back (via return false, (see above)), and explore other options   
        // 5. Ultimately, either we will find our word combination or we will exhaust all rows and columns
        
        
        // While backtracking, we need to bring back the element value from temp and place it back instead of '#' so we can explore a new path
        
        board[row][col] = temp;
        
        
        
        return find;
        
                // 5. Ultimately, either we will find our word combination or we will exhaust all rows and columns                    
                        
    }
}