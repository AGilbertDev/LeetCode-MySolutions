class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 1) { // Validates 1 word arrays quickly.
            return strs[0];
        }
        
        String prefix = ""; // We start with an empty prefix.
        
        for(int i = 0; i < strs.length; i++) {
            
            if (i == 0) { // The first word is the starting prefix. We will then substract unmatching chars.
                prefix += strs[0];
            }
            
            else {
                if (prefix == "" || strs[i] == "") { // Checks if all letters were eliminated.
                    return "";
                }
                
                int shortestLength = prefix.length(); // Will contain the shortest length for comparision.
                
                if (shortestLength > strs[i].length()) { // Checks if the prefix is longer than the next word.
                    shortestLength = strs[i].length();   // Stores the shortest length between the two.
                    
                    prefix = prefix.substring(0, shortestLength); // Eliminates last chars from the prefix.
                }
                    
                for (int j = 0; j < shortestLength; j++) { // Only compare the characters that match the length.
                    if(prefix.charAt(j) != strs[i].charAt(j)) {
                        prefix = prefix.substring(0, j); // Eliminates last chars from prefix starting at unmatching char.
                        break;
                    }   
                }
            }
        }
        
        return prefix;
    }
}