Explaination with example -
​
​
String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
​
Initialization:
​
ans is an empty list of lists: ans = []
anagramGroups is an empty HashMap: anagramGroups = {}
Iterating through strs:
​
For the first string "eat":
​
temp becomes ['e', 'a', 't'] after converting the string to a character array.
temp is sorted, so sortedStr becomes "aet".
anagramGroups doesn't contain the key "aet", so a new entry is added: anagramGroups = {"aet" => []}
"eat" is added to the list corresponding to the key "aet": anagramGroups = {"aet" => ["eat"]}
For the second string "tea":
​
temp becomes ['t', 'e', 'a'].
temp is sorted, so sortedStr becomes "aet".
"aet" is already a key in anagramGroups, so "tea" is added to the existing list: anagramGroups = {"aet" => ["eat", "tea"]}
For the third string "tan":
​
temp becomes ['t', 'a', 'n'].
temp is sorted, so sortedStr becomes "ant".
anagramGroups doesn't contain the key "ant", so a new entry is added: anagramGroups = {"aet" => ["eat", "tea"], "ant" => []}