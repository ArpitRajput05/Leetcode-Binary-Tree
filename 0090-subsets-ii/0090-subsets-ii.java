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

       
        ArrayList<Integer> temp = new ArrayList<>();

        for (int x : current) {
            temp.add(x);
        }

        result.add(temp);

        
        for (int i = index; i < nums.length; i++) {

           
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

      
            current.add(nums[i]);

            solve(nums, i + 1, current, result);

            
            current.remove(current.size() - 1);
        }
    }
}