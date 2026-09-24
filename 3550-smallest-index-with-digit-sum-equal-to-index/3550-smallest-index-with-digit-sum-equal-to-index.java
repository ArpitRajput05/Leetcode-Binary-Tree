class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            
            if(num>9){
                int sum=0;
                while(num>0){
                   sum=sum+num%10;
                   num=num/10;
                }
                list.add(sum);
            }
            else {
                list.add(nums[i]);
            }
        }

        for(int j=0;j<list.size();j++){
            if(list.get(j)==j) return j;
        }
        return -1;
    }
}