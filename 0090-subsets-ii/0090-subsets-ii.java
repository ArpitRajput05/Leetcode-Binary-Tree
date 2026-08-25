import java.util.*;

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        ArrayList<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        ArrayList<Integer> current = new ArrayList<>();

        solve(nums, 0, current, result);

        return result;
    }

    static void solve(int[] nums, int index,
                      ArrayList<Integer> current,
                      ArrayList<List<Integer>> result) {

        
        if (index == nums.length) {

            ArrayList<Integer> temp = new ArrayList<>();

           
            for (int x : current) {
                temp.add(x);
            }

           
            if (!result.contains(temp)) {
                result.add(temp);
            }

            return;
        }

      
        current.add(nums[index]);

        solve(nums, index + 1, current, result);

        
        current.remove(current.size() - 1);

   
        solve(nums, index + 1, current, result);
    }
}