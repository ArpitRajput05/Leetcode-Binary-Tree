class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        int[][]res=new int [n/3][3];
        Arrays.sort(nums);
        int row=0;
        for(int i=0;i<n;i+=3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }
            res[row][0] = nums[i];
            res[row][1] = nums[i + 1];
            res[row][2] = nums[i + 2];

            row++;
        }
        return res;
    }
}