class Solution {
    public long gcdSum(int[] nums) {

        int n = nums.length;
        int[] prefixGcd = new int[n];

        int max = 0;

        // Create prefixGcd
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);

            prefixGcd[i] = gcd(nums[i], max);
        }

        // Sort
        Arrays.sort(prefixGcd);

        long sum = 0;

        // Pair smallest with largest
        for (int i = 0; i < n / 2; i++) {
            sum += gcd(prefixGcd[i], prefixGcd[n - 1 - i]);
        }

        return sum;
    }

    // GCD function
    private int gcd(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
