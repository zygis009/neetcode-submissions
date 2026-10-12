class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> lengths = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (lengths.containsKey(num)) continue;
            int length = lengths.getOrDefault(num-1, 0)
                + lengths.getOrDefault(num+1, 0)
                + 1;
            if (lengths.containsKey(num-1)) {
                lengths.put(num - lengths.get(num-1), length);
            }
            if (lengths.containsKey(num+1)) {
                lengths.put(num + lengths.get(num+1), length);
            }
            lengths.put(num, length);
            max = Math.max(max, length);
        }
        return max;
    }
}