package Strings;

public class stringPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
    
           s =  s.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); // new imp line, imp methods
           // converting all alphanumeric characters, uppercase characters, numbers, symbols, and  spaces to lowercase letters with no spaces
            int first = 0;
            int last = s.length() - 1;
    
            while(last > first) {
                if(s.charAt(first) != s.charAt(last)) {  // imp
                    return false;
                }
    
                first++;
                last--;
    
                
            }            
    
            return true;
        }
    }
}
