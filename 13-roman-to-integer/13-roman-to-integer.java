class Solution {
    public int romanToInt(String s) {
        
        if (s.length() == 1) { // Gives fast answer for single numeral numbers.
            switch (s.charAt(0)) {
                case 'I':    
                    return 1;
                case 'V':    
                    return 5;
                case 'X':    
                    return 10;
                case 'L':    
                    return 50;
                case 'C':    
                    return 100;
                case 'D':    
                    return 500;
                case 'M':   
                    return 1000; 
            }
        }
        
        else { 
            
            int number = 0; // We start with 0 and will add to it.
            
            for (int i = s.length()-1; i >= 0; i--) { // Checks all characters from the end.
                
                char c = s.charAt(i); // Current char.
                char b = '0';         // Char that comes before.
                
                if (i > 0) {
                   b = s.charAt(i-1);
                }
                
                switch (c) {
                    case 'I':  // Need only to check for I
                        number += 1;
                        break;
                    case 'V':  // Need to check for V, and IV
                        if (b == 'I') {
                            number += 4;
                            i--; // Must skip the next char
                        }
                        else {
                            number += 5;
                        }
                        break;
                    case 'X':  // Need to check for X, and IX
                        if (b == 'I') {
                            number += 9;
                            i--; // Must skip the next char
                        }
                        else {
                            number += 10;
                        }
                        break; 
                    case 'L':  // Need to check for L, and XL
                        if (b == 'X') {
                            number += 40;
                            i--; // Must skip the next char
                        }
                        else {
                            number += 50;
                        }
                        break; 
                    case 'C':  // Need to check for C, and XC
                        if (b == 'X') {
                            number += 90;
                            i--; // Must skip the next char
                        }
                        else {
                            number += 100;
                        }
                        break; 
                    case 'D':  // Need to check for X, and CD
                        if (b == 'C') {
                            number += 400;
                            i--; // Must skip the next char
                        }
                        else {
                            number += 500;
                        }
                        break; 
                    case 'M':  // Need to check for M, and CM
                        if (b == 'C') {
                            number += 900;
                            i--; // Must skip the next char
                        }
                        else {
                            number += 1000;
                        }
                        break;   
                }
            }
            
            return number;
        }
        
        return 0;
    }
}