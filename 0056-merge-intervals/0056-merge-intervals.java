class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int[] currentInterval = intervals[0];
        
        for(int i = 1; i < intervals.length; i++){
            int[] nextInterval = intervals[i];
            
            if(currentInterval[1] >= nextInterval[0]) {
                // merging case
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            }
            else {
                // add non merged intervals
                ans.add(currentInterval);
                
                // future scope
                currentInterval = nextInterval;
            }
        }
        
        // adding the merged intervals
        ans.add(currentInterval);
        
        return ans.toArray(new int[ans.size()][]);
    }
}