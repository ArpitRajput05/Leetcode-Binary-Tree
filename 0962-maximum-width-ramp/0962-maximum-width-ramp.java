class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
      //  int max=0;
        int[]nge=new int[n];
        nge[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            nge[i]=Math.max(nums[i],nge[i+1]);
        }
        int i=0;
        int j=0;
        int max=0;
        while(j<n){
            while(i<j&&nums[i]>nge[j]){
                i++;
            }
            max=Math.max(max,j-i);
            j++;

        }
        return max;
    }
}