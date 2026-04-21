class Solution {
    public boolean isUgly(int n) {
        // Step 1: Ugly numbers must be positive
        if (n <= 0) return false;

        // Step 2: Iteratively divide by the allowed prime factors
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }

        // Step 3: If n is 1, all prime factors were 2, 3, or 5
        return n == 1;
    }
}