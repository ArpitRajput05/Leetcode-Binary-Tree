class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
       // int[]arr=new int[2];
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int first =low;
        if(first==n || nums[first]!=target){
            return new int []{-1,-1};
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        int last =high;
         return new int[]{first, last};

    }
}