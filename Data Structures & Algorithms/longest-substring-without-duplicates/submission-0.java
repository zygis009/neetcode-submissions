class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        char[] chars = s.toCharArray();
        int max = 0;
        int l = 0, r = 0;
        while (r < chars.length) {
            map[chars[r]]++;
            while (map[chars[r]] > 1) {
                map[chars[l++]]--;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
}
