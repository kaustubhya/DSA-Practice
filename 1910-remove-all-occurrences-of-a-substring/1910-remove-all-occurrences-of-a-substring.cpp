class Solution {
public:
    string removeOccurrences(string s, string part) {

        // given are 2 strings, let us run a loop to check if there exists a subtring within a string or not

      while(s.find(part) != string :: npos) {
//           Not using erase
//           s = "daabcbaabcbc", part = "abc"
          
          string leftString = s.substr(0, s.find(part));
          string rightString = s.substr(s.find(part) + part.size(), 100000);
//           Here for right substring, we can give any number as its length as we donot have to do anything other than this
          
          // alternate -> string rightString = s.substr(s.find(part) + part.size() -  (s.size() - 1 - (s.find(part) + part.size()) + 1);
          
//           append both now
          s = leftString + rightString;

      }
        
        return s;
    }
};