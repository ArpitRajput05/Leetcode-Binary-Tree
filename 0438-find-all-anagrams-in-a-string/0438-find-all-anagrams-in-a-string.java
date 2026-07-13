class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of pattern
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();

        int i = 0;
        int j = 0;
        int k = p.length();

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (map.containsKey(ch)) {

                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {

                if (count == 0) {
                    ans.add(i);
                }

                char leftChar = s.charAt(i);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) == 1) {
                        count++;
                    }
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}