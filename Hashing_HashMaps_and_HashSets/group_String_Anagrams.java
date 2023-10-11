package Hashing_HashMaps_and_HashSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class group_String_Anagrams {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        
        // I will use hashmaps here for grouping
        // see explaination in notes.md file
        Map<String, List<String>> myMap = new HashMap<>();
        // here Map<key, value>
        
        
        int n = strs.length;
        
        for(int i = 0; i < n; i++) {
            // 1. imp line, convert string to char array
            char[] temp = strs[i].toCharArray();
            // 2. sort it
            Arrays.sort(temp);
            
            // 3. convert back char array to string
            String mystr = new String(temp);
            
            
            // now after sorting, we get a key, if a string matches that key (order of chars not necessary), we put that in a key value pair array and keep putting similar strings in that same array which matches that key value pair array, 
            
            // if we get a new key make a different key value pair array and do the same 
            
            
            // 4. if 0 keys,  PUT KEY-VALUE
            if(myMap.containsKey(mystr) == false) {
                // it means the map 'myMap' does not have a key currently i.e. it is empty
                
                // putting key inside it now with a new arrayList for values, key is of string type
                myMap.put(mystr, new ArrayList<>());
            }
            
            // now fetch values from the 'strs' array as we are in a 'for' loop and match it with the corresponding keys
            
            // 5. GET key and ADD values
            
            myMap.get(mystr).add(strs[i]);
            } // for loop ends
            
        
        // now we have all key value pairs
        
        // add all values (which are array lists) in the answer list (which is list of lists)
        
        
        // 6. ADD ALL values
        ans.addAll(myMap.values());
                
        
        
        return ans;
    }
}

