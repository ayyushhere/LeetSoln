class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Optimization: If ransomNote is longer than magazine, it's impossible
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        // Create an array to store counts of 'a' through 'z'
        int[] charCounts = new int[26];

        // Fill the array with character frequencies from the magazine
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Iterate through the ransom note and "use" the characters
        for (char c : ransomNote.toCharArray()) {
            charCounts[c - 'a']--;
            
            // If the count goes negative, we ran out of this character
            if (charCounts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}