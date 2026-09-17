class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;
        int[] minLen = new int[n];

        Arrays.fill(minLen, Integer.MAX_VALUE);

        int left = 0;
        int right = 0;
        int sum = 0;

        int best = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        while (right < n) {

            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {

                int len = right - left + 1;

                if (left > 0 && minLen[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, len + minLen[left - 1]);
                }

                best = Math.min(best, len);
            }

            minLen[right] = best;

            right++;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}