class Solution {
    public int maximumSwap(int num) {
        // Convert the number to an array of digits
        char[] digits = Integer.toString(num).toCharArray();
        
        // Map each digit to its last index of occurrence
        int[] lastOccurrence = new int[10];
        for (int i = 0; i < digits.length; i++) {
            lastOccurrence[digits[i] - '0'] = i;
        }
        
        // Iterate through each digit
        for (int i = 0; i < digits.length; i++) {
            // Try to find a larger digit to swap with
            for (int j = 9; j > digits[i] - '0'; j--) {
                if (lastOccurrence[j] > i) {
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = digits[lastOccurrence[j]];
                    digits[lastOccurrence[j]] = temp;
                    
                    // Convert the modified array of digits back to an integer and return
                    return Integer.parseInt(new String(digits));
                }
            }
        }
        
        // If no swap is possible, return the original number
        return num;
    }
}
