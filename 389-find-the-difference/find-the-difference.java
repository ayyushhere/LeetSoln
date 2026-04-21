class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        // XOR all characters in string s
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        
        // XOR all characters in string t
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        
        // The remaining value is the added character
        return result;
    }
}