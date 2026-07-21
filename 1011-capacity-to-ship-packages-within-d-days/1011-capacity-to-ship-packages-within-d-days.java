class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            int requiredDays = countDays(weights, mid);

            if (requiredDays <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }

        return left;
    }

    private int countDays(int[] weights, int capacity) {

        int days = 1;
        int currentWeight = 0;

        for (int weight : weights) {

            if (currentWeight + weight <= capacity) {
                currentWeight += weight;
            } else {
                days++;
                currentWeight = weight;
            }

        }

        return days;
    }
}