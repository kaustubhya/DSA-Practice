class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       // since the return type is a list of lists, make a list of lists
        List<List<Integer>> ans = new ArrayList<List<Integer>>(); // imp have arraylist on rhs
        recursiveFunc(0, target, candidates, ans, new ArrayList<>()); // same here
        return ans;

       
    }
    
    private void recursiveFunc(int index, int target, int[] candidates, List<List<Integer>> ans, List<Integer> dsDemo) {
        // base Condition
        if(index == candidates.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(dsDemo)); 
                // adding an array list to a list of lists
                // dsDemo is our scratch pad list will will undergo insertion and removal of elements
            }
            return;
        }
        
        
        // appending the dslist
        if(candidates[index] <= target) {
            dsDemo.add(candidates[index]);
            // left recursion branch - pick
            recursiveFunc(index, target - candidates[index], candidates, ans, dsDemo);
            // keeps executing till it reaches the branch end
            
            // then it backtracks, removes the latest added element
            dsDemo.remove(dsDemo.size() - 1);
            // java collections remove method
        }
        // right recursive branch - not pick
        recursiveFunc(index + 1, target, candidates, ans, dsDemo);        
        
        
    }
}