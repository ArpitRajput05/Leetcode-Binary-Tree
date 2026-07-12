class Solution {
    public int[] sortArrayByParity(int[] nums) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int num : nums){

            if(num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
        }

        int index = 0;

        for(int x : even){
            nums[index] = x;
            index++;
        }
        for(int x : odd){
            nums[index] = x;
            index++;
        }
        return nums;
    }
}