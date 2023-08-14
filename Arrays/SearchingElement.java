package Arrays;


// Search an Element in an array
// https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions
public class SearchingElement{
        
    static int search(int arr[], int N, int X)
    {
        
        // X = target
        // N is the size
        
        if(arr.length == 0) {
                return -1;
            }
        
        for(int i = 0; i <= N - 1; i++) {
            int element = arr[i];
            if(element == X) {
                return i;
            }
            
            
        }
        
        return -1;
        
    }
    
}
 
