class Solution {
    public static boolean isValid(String s) {

        /** Each opening parentese must be added to a stack (Last in first out). It is removed from the top only when its             closing bracket is met. If a closing bracket doesn't match the last one on the stack, then the sequence is               not valid. **/
        
        if (s.length() % 2 != 0) { // Eliminates string of odd length immediately.
            return false;
        }

        Stack<Character> stack = new Stack<>(); // This will store the order of opening parenteses.

        for (int i = 0; i < s.length(); i++) { // Reads each character from the string.
            char c = s.charAt(i); // Current character.

            if (c == '(' || c == '[' || c == '{') { // Looks if it's an opening parentese and adds it on the stack.
                stack.push(c);
            }

            else { // If it's a closing parentese, looks for the last item on the stack.
                
                if (stack.size() == 0) {
                    return false;
                }

                switch (c) { // If the last opening parentese matches the one that closes, removes it from the top of the                              // stack. And if not, the order is incorrect and the program stops.
                    case ')':
                        if (stack.lastElement() == '(') {
                            stack.pop();
                            break;
                        } else {
                            return false;
                        }
                    case ']':
                        if (stack.lastElement() == '[') {
                            stack.pop();
                            break;
                        } else {
                            return false;
                        }
                    case '}':
                        if (stack.lastElement() == '{') {
                            stack.pop();
                            break;
                        } else {
                            return false;
                        }
                }
            }
        }
        
        if (stack.size() != 0) {
            return false;
        }

        return true;
    }
}