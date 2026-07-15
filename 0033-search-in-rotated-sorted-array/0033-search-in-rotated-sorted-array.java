class Solution {

    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // Search in right half
        if (target >= nums[pivot] && target <= nums[nums.length - 1]) {

            return binarySearch(nums, pivot, nums.length - 1, target);
        }

        // Search in left half
        return binarySearch(nums, 0, pivot - 1, target);
    }

    public int findPivot(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int binarySearch(int[] nums, int low, int high, int target) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}