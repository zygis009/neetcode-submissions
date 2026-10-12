class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, int[]> bounds = new HashMap<>();
        for (int num : nums) {
            int[] bound = new int[]{num, num};
            bound[0] = bounds.getOrDefault(num - 1, bound)[0];
            bound[1] = bounds.getOrDefault(num + 1, bound)[1];
            for (int i = bound[0]; i <= bound[1]; i++) {
                bounds.put(i, bound);
            }
        }
        int max = 0;
        for (int[] bound : bounds.values()) {
            max = Math.max(max, bound[1] - bound[0] + 1);
        }
        return max;
    }
}
