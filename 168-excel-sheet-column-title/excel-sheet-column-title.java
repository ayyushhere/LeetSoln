class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while (columnNumber > 0) {
            // Step 1: Shift to 0-indexed
            columnNumber--; 
            
            // Step 2: Get the character (remainder of division by 26)
            char currentChar = (char) ('A' + (columnNumber % 26));
            sb.append(currentChar);
            
            // Step 3: Prepare for the next position
            columnNumber /= 26;
        }
        
        // Step 4: Reverse because we built it from right to left
        return sb.reverse().toString();
    }
}