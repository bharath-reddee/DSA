class Solution {
    public int totalNumbers(int[] digits) {

        HashSet<Integer> set = new HashSet<>();

        int n = digits.length;

        // Choose units digit
        for (int i = 0; i < n; i++) {

            // Last digit must be even
            if (digits[i] % 2 != 0) {
                continue;
            }

            // Choose tens digit
            for (int j = 0; j < n; j++) {

                // Cannot use same index
                if (i == j) {
                    continue;
                }

                // Choose hundreds digit
                for (int k = 0; k < n; k++) {

                    // Cannot reuse an index
                    if (k == i || k == j) {
                        continue;
                    }

                    // First digit cannot be 0
                    if (digits[k] == 0) {
                        continue;
                    }

                    int number = digits[k] * 100
                              + digits[j] * 10
                              + digits[i];

                    set.add(number);
                }
            }
        }

        return set.size();
    }
}