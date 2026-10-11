class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> min_idx_map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!min_idx_map.containsKey(nums[i])) min_idx_map.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (min_idx_map.containsKey(diff)) {
                int idx = min_idx_map.get(diff);
                if (idx != i) return idx < i ? new int[]{idx, i} : new int[]{i, idx};
            }
        }
        return new int[]{};
    }
}
