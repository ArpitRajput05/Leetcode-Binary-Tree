class Solution {
    public int minPairSum(int[] nums) {
         int n=nums.length;
         int i=0;
         int j=n-1;
         int max=0;
         Arrays.sort(nums);
         while(i<=j){
               int sum=nums[i]+nums[j];
               max=Math.max(max,sum);
               i++;
               j--; 
         }
         return max;
    }
}