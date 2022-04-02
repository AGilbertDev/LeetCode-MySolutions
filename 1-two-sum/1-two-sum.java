class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> foundNums = new HashMap(); // Stores indices of previously encountered numbers as values                                                              // with the numbers as the keys.
            
        for (int i = 0; i < nums.length; i++) { // Parses trough the list of numbers one time.
            
            if (i == 0) { // Stores the first number and it's index in the map and moves on to the other numbers.
                foundNums.put(nums[i], i);
            }
            
            else { // Then moves on to the other numbers.
                int num = nums[i];
                int missingNum = target - num; // Calculates the second number we need to find.
                
                if (foundNums.containsKey(missingNum)) { // Checks if the second number was already found and returns both
                                                         // indices.
                    
                    int[] answer = {i, foundNums.get(missingNum)};
                    return answer;
                }
                
                else {
                    foundNums.put(num, i);
                }
            }
        }
        
        return null;
    }
}