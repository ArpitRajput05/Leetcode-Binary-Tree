class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (map.containsKey(ch)) {
                    break;
                }

                map.put(ch, 1);

                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}