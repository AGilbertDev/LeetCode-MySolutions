class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) { // Eliminates negative integers immediately because of asymmetric negative sign.
            return false;
        }
        
        String num = Integer.toString(x); // Converts the number to a string.
        
        if (num.length() == 1) { // Validates single digit integers immediately.
            return true;
        }

        for (int i = 0, j = num.length()-1; i < j; i++, j--) { // Reads opposing characters starting from both ends.
            if (num.charAt(i) != num.charAt(j)) { // Checks if opposing characters are the same.
                return false;
            }
        }

        return true;
    }
}