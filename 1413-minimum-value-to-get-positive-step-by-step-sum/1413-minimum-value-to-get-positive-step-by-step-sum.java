class Solution {

    public int minStartValue(int[] nums) {

        int sum = 0;
        int minPrefix = 0;

        for(int num : nums){

            sum += num;

            minPrefix = Math.min(minPrefix, sum);
        }

        return 1 - minPrefix;
    }
}